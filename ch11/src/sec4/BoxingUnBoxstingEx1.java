package sec4;

public class BoxingUnBoxstingEx1 {

	public static void main(String[] args) {
		int i1 =100;
		float f1 =62.8f;
		byte b1 = 124; 
		
		
		//Boxing : 기본(Primitive) -> 래퍼(Wrapper)
		//short -> Short
		//int -> integer
		//long -> Long
		//float -> Float
		//double -> Double
		//byte -> Byte
		//char -> Character(X)
		//boolean -> Boolean
		
		//Unboxxing : 기본(Primitive) -> 래퍼(Wrapper)
		//short <- Short
		//int <- integer
		//long <- Long
		//float <- Float
		//double <- Double
		//byte <- Byte
		//boolean <- Boolean
		
		//Boxing
		Integer int1 = new Integer(1004);
		Integer int2 = new Integer("1004");
		Integer int3 = Integer.valueOf("1004");
		Integer int4 = Integer.valueOf(i1);
		
		Float fl1 = new Float(3.14);
		Float fl2 = new Float("3.14");
		Float fl3 = Float.valueOf(f1);
		Float fl4 = Float.valueOf(f1);
		Float fl5 = new Float(f1);
		
		Byte by1 = Byte.valueOf(b1);
		Byte by2 = new Byte("124");
		Byte by3 = new Byte(b1);
		Byte by4 = Byte.valueOf("b1");
		
		//UnBoxing
		int iv1 = int1.intValue();
		int iv2 = int2.intValue();
		
		  
	
		float fv1 = fl1.floatValue();
		float fv2 = fl2.floatValue();
		
		System.out.println("b1 ==  : "+(int1 == iv1));
		System.out.println("int1 == fv2 : "+(int1 == fv2));
		
	}

}
