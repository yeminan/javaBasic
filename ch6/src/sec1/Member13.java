package sec1;

public class Member13 {
	String name;
	String ID;
	String password;
	 int age;
		Member13 (){
			this("이민환"); 
		}
		Member13 (String name){
			this(name,"lee"); 
		}
		Member13 (String name, String ID){
			this(name,ID,"a1234"); 
		}
		Member13 (String name, String ID,String password){
		this(name,ID,password,15); 
		}
		
		Member13 (String name, String ID, String password, int age){
		this.name = name;
		this.ID = ID;
		this.password = password;
		this.age = age;
		
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
}
