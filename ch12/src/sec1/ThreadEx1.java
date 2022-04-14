package sec1;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"이민환","이민한","이민현","이민훈","이민헌","이민햔","이민혼","이민힌","이민혁"};
		for(int i=0;i<10;i++) {
			 System.out.println(names[i]);
			 if(names[i].equals("이민환")) {
				 System.out.println("침입자");
						toolkit.beep();
						continue;
			 }else {
				 System.out.println("서비스");
				 System.out.println("정상");
			 }
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		}
	}

}
