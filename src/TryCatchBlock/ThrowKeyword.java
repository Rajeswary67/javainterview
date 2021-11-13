package TryCatchBlock;

public class ThrowKeyword 
{
	public static void main(String[] args)
	{
		try {
			Thread.sleep(4000);
		}
	catch( InterruptedException e)
		{
		e.printStackTrace();
		}
		System.out.println("bye");
}
}

