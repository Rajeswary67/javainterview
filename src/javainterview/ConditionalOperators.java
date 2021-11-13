package javainterview;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if (a == b)
			System.out.println("print a is equal to b");
		else
			System.out.println("print a is not equal to b");

		int c = 30;
		int d = 40;
		if (c >= d)
			System.out.println("print c is greaterthan to d");
		else
			System.out.println("print d is greaterthan c");

		if (true)
			System.out.println("true");
		else
			System.out.println("fail"); // here it is a dead code because the sysytem does not execute the code after it
										// is
										// true so it comes under yellow line i.e no need to put unnecessary data into
										// the sys
										// so dont try to write true or false with in the if-else statement
		boolean flag = true;
		if (flag)
			System.out.println("elememt is visible");
		else
			System.out.println("element is not visible");

		// if with in the if statement:
		int sal = 1000;
		if (sal >= 1000) {
			System.out.println("sal is greaterthan 1000");
			if (sal == 1000) {
				System.out.println("sal is 1000");
				if (sal <= 1000) {
					System.out.println("sal is lessthan to 1000");
				} else
					System.out.println("bad sal");
			} else
				System.out.println("not good sal");
		} else
			System.out.println("nice sal");

		String browser = "safari";

		if (browser.equals("IE")) {
			System.out.println("launch IE");

		}

		if (browser.equals("safari")) {
			System.out.println("launch safari");
		}
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else
			System.out.println("no browser launched");
	}

	String browser="chrome";

	if(browser.equals("IE"))
	{
		System.out.println("launch IE");
	}

	else if(browser.equals("safari"))
	{
		System.out.println("launch safari");
	}else if(browser.equals("chrome"))
	{
		System.out.println("launch chrome");
	}else System.out.println("no browser launched");}

	int x = 100;
	int y = 200;
	int z =  300;

	if(x>y&&x>z)
	{
		System.out.println("x is big");
	}if(y>z)
	{
		System.out.println("y is big");
	}else Systm.out.println("z is big");

}

}


