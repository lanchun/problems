package problems;

public class AddList {

	public static void main(String[] args) {
		Node n1 = new Node(5, null);
		Node n2 = new Node(8, n1);
		Node n = new Node(1, n2);

		Node m1 = new Node(5, null);
		Node m2 = new Node(8, m1);
		Node m = new Node(1, m2);

		Node node = addLists(m, n);
		while (node != null) {
			System.out.print(node.item + "->");
			node = node.next;
		}
	}

	public static Node<Integer> addLists(Node<Integer> list1, Node<Integer> list2) {
		if (list1 == null && list2 == null)
			return null;
		Node<Integer> node = new Node<Integer>();
		Node<Integer> runner = node;
		int carry = 0;

		while (list1 != null || list2 != null) {
			int num = carry;
			if (list1 != null)
				num += list1.item;
			if (list2 != null)
				num += list2.item;
			carry = num > 10 ? 1 : 0;
			runner.item = num % 10;
			runner.next = new Node<Integer>();
			runner = runner.next;

			list1 = list1.next;
			list2 = list2.next;
		}
		if (carry != 0)
			runner.item = carry;
		else
			runner = null;
		return node;
	}

}
