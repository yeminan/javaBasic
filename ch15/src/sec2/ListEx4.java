package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	private String uid;
	private String pw;
	private String email;
	private String tel;
	public String getUid() {return uid;	}
	public void setUid(String uid) {this.uid = uid;	}
	public String getPw() {	return pw;}
	public void setPw(String pw) {this.pw = pw;	}
	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;	}
	public String getTel() {return tel;	}
	public void setTel(String tel) {this.tel = tel;	}
	}
public class ListEx4 {
	public static void main(String[] args) {
		List<Member> mb1 =new ArrayList<Member>();
		Member mb2 = new Member("이일병","이이병","이상병","이병장");
		mb2.setUid("일병");
		mb2.setPw("2222");
		mb2.setEmail("일병@gmail.com");
		mb2.setTel("010-5555-5555");
		mb1.add(mb2);
		Member mb3 = new Member("이하사","이중사","이상사","이원사");
		mb3.setUid("상병");
		mb3.setPw("3333");
		mb3.setEmail("상병@gmail.com");
		mb3.setTel("010-4444-4444");
		mb1.add(mb3);
		Member mb4 = new Member("이소위","2222","소위@gamil.com","010-1111-2222");
		mb4.setUid("이소위");
		mb4.setPw("2222");
		mb4.setEmail("소위@gamil.com");
		mb4.setTel("010-1111-1111");
		mb1.add(mb4);
		System.out.println("아이디\t패스워드\t이메일\t	전화번호");
		for(Member m : mb1) {
			System.out.print(m.getUid()+"\t");
			System.out.print(m.getPw()+"\t");
			System.out.print(m.getEmail()+"\t");
			System.out.print(m.getTel()+"\n");
		}
	}
}
