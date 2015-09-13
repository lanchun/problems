package problems;

import java.util.Stack;

/**
 * 用两个栈来模拟一个队列
 * 其中s1顶端总是保存着最新的元素，移除元素则从s2中移除
 * 有一个小技巧，移除的时候要先判断s2是否为空，如果为空才将s1中的元素已过去
 * 否则直到把s2中的元素移除完
 * @author lanchun
 *
 */
public class TwoStackQueue<E> {

	Stack<E> s1,s2;
	public TwoStackQueue(){
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void add(E e){
		s1.push(e);
	}
	
	public void shiftStacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}
	
	public E peek(){
		shiftStacks();
		return s2.peek();
	}
	
	public E remove(){
		shiftStacks();
		return s2.pop();
	}
	public static void main(String[] args) {

	}

}
