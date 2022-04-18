package sec1;

import java.util.Deque;
import java.util.ArrayDeque;
public class DequeEx1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.addFirst("kin");//가장 앞에 추가
		deque.addFirst("nam");
		deque.addLast("jung");
		deque.addLast("kim");
		deque.add("gil");
		System.out.println("데크의 값 출력 : "+deque);
		deque.offerLast("kang");
		deque.offerFirst("jun");
		System.out.println("데크의 사이즈 : "+deque.size());
		System.out.println("데크의 값 출력 : "+deque);
		deque.poll();
		System.out.println("데크의 값 출력 : "+deque);
		deque.pop();
		System.out.println("데크의 값 출력 : "+deque);
		}
}
