package TryCatchBlock;

public class FinallyKeyword {
	//
		public static int Getnum(String name)
		{
			if( name.equals("Tom"))
			{
		     try
		     {
		    	 int marks=90/0;
		    	 return marks;
		     }catch(ArithmeticException e)
		     {
		     return 40;
			}finally
			{
				return 10;
			}
		}else if (name.equals("raj"))
		{
			return 100;
		}
	
		else	
	{
		return 50;
	}
	
}

public static void main(String[] args)	
	{
	   System.out.println(Getnum("Tom"));
		int a=10;
		int b=0;
		System.out.println("test");
		try {
			
			int div=a/b;
		
	}catch(ArithmeticException e)
	{
		System.out.println("AE is coming");
		System.exit(0);
	}

	finally
	{
		System.out.println("end");
		
	}

}

}

