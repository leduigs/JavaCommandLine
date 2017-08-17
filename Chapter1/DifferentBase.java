public class DifferentBase {
	
	//Okay as they are fields
		boolean boo;
		char c;
		byte by;
		short s;
		int i;
		long l;
		float f;
		double d;
	
	public static void main(String[] args){
		int dec = 255;
		int oct = 0377;   		//(3*(8*8))+(7*8)+(7) 
		int hex = 0xFF;         //(15*16)+15
		int bin = 0b11111111;   
		
		//Name as to be letter digit or _ and $
		int _nameisgood = 0;
		// int 3nameisnotgood ;
		int $nameisgood = 0;
		int name£ = 5;
		
		String s;
		String s_null = null;
		/*
Errors as not initialized
		boolean boo;
		char c;
		byte by;
		short s;
		int i;
		long l;
		float f;
		double d;
	    System.out.println(s);
		*/
		System.out.println(s_null);

		DifferentBase db = new DifferentBase();
		
		System.out.println(db.boo);
		System.out.println(db.c);
		System.out.println(db.by);
		System.out.println(db.s);			
		System.out.println(db.i);
		System.out.println(db.l);
		System.out.println(db.f);
		System.out.println(db.d);

		
		//Can appear in middle not at start or end
		int intWithUnderscores = 1_000_000;
		
		//These don't compile
		//int notWorking = _1000;
		//double notWorking2 = 1000.00_
		//double notWorking2 = 1000_.00
		
		System.out.println(dec);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(bin);
		
	}

}