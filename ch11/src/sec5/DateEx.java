package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年 MM月 dd日 hh時 mm分 ss初");
		
		String date1 = sdf1.format(now);
		String date2 = sdf2.format(now);
		
		System.out.println(date1);
		System.out.println(date2);
		//yyyy - 년		대소문자 구분확실하게 해야함 
		//MM - 월
		//dd - 일
		//hh - 시
		//mm - 분
		//ss - 초
		int year = now.getYear();
	}

}
