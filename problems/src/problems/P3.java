package problems;

import java.util.*;

/**
 * 约瑟夫环问题
 * 
 * @author lanchun
 * 
 */
public class P3 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 30; i++)
			list.add(i);
		int index = 0;
		while (list.size() > 1) {
			index = (index + 8) % list.size();
			list.remove(index);
		}
		System.out.println(list);
	}

}
