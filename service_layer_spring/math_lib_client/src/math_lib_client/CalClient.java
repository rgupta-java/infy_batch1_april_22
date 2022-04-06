package math_lib_client;

import com.demo.Cal;
import com.internal.CalLogic;

public class CalClient {

	public static void main(String[] args) {
		Cal cal=new Cal();
		System.out.println(cal.add(3, 3));
		
		CalLogic calLogic=new CalLogic();
		System.out.println(calLogic.addLogic(3, 3));
	}
}
