public class Main
{

	public static void main(String[] args) {

	    int a=13;
	    byte b=27;
	    short c=279;
	    double d=456.789;
	    int int_res;byte byte_res; short short_res;double res;

	    //

	    res=a*b+c*d;
	    System.out.println("Auto type promotion");
	    System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
	    res=a*b+c*d;
	    System.out.println("res ="+res);
	    
	    System.out.println("explicit type conversion");
	    int_res = (int) res;
	    byte_res = (byte) res;
	    short_res = (short) res;
	    System.out.println("Double to int");
	    System.out.println("int res = "+int_res);
	    System.out.println("Double to byte");
	    System.out.println("byte_res = "+byte_res);
	    System.out.println("Double to short");
	    System.out.println("short_res = "+short_res);
	    
	    
	
}

}
