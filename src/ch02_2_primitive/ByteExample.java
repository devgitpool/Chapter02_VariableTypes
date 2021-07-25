package ch02_2_primitive;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 =	-30;
		byte var3 =	0;
		byte var4 = 30;
		byte var5 = 127;
	    //byte var6 = 128;
		int  var7 = 128;
		byte var8 = (byte)128; // -128
		/*
		 * 눈금 시계저울 연상....
		 * 빼변 시계반대 더하면 시계방향... 
		 * 범위가 -128 ..-1..0..1..2..127.-128....0.....127.-128....
		 */
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
