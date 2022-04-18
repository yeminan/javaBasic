package sec2;

import java.util.ArrayList;
import java.util.List;
class Human{
	private String name;
	private int sno;
	private int age;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public int getSno() {return sno;}
	public void setSno(int sno) {this.sno = sno;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("이민환");
		list1.add("이민");
		list1.add("이");
		System.out.println("리스트의 크기" + list1.size());
		System.out.println("List1 : "+ list1);
		for(String name : list1) {
			System.out.println("회원명 : "+name);
		}
		String irum = list1.get(0); //인덱스가 1인 요소값 대입
		System.out.println("인덱스가 0인 요소 : "+irum);
		System.out.println("인덱스가 0인 요소 : "+list1.get(0));
		list1.add("임임임");
		list1.remove(0);
		System.out.println("list0 : "+list1);
		
		List<Human> h1 = new ArrayList<Human>();
		Human m1 = new Human();
		m1.setName("이민환");
		m1.setAge(19);
		m1.setSno(6);
		h1.add(m1);
		Human m2 = new Human();
		m2.setName("이민환2");
		m2.setAge(9);
		m2.setSno(3);
		h1.add(m2);
		Human m3 = new Human();
		m3.setName("이민환3");
		m3.setAge(29);
		m3.setSno(5);
		h1.add(m3);
		System.out.println("번호\t회원명\t나이");
		for(Human h : h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");
		}
		
	}

}
