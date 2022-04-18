package sec1;
class Box<T>{
	private T t;

	public T get() {return t;}
	public void set(T t) {this.t = t;}
}
public class BoxEx {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("자바");
		System.out.println(box1.get());
		
		Box<Integer> box2 =new Box<Integer>();
		box2.set(33333);
		System.out.println(box2.get());
		
		

	}

}
