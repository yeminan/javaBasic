package sec1;
class Student {
	String name;
	int no;
	int year;
	int ban;
}
class Score{
	int edps;
	int oa;
	int pg;
	public Student setStudent(String name, int no, int year, int ban) {
		Student st = new Student();
		st.name = name;
		st.no= no;
		st.year=year;
		st.ban=ban;
		return st;
	}
}

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
