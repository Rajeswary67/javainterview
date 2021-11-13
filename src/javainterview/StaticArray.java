package javainterview;

public class StaticArray {

	public static void main(String[] args) {
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		for(int j=0; j<i.length;j++)
		{
			System.out.println(i[j]);
		}
			
			System.out.println(i[2]);	
	//System.out.println(i[-1]);
			System.out.println(i[2+1]);
			System.out.println(i[3-1]);
			System.out.println("*************");
			
			for(int e: i)
			{
				System.out.println(e);
			}
	
			double d[]=new double[3];
			d[0]=1.22;
			d[1]=2.33;
			d[2]=3.44;
			//d[3]=4.55;
			//d[4]=5.66;
			for(int k=0;k<d.length;k++) {
				System.out.println(d[k]);	
			}
			
		System.out.println("*************");
		for(double e: d)
		{
			System.out.println(e);
		}
		
		String s[]=new String[2];
		s[0]="aaa";
		s[1]="bbb";
		//s[2]="ccc";
		for(int l=0;l<s.length;l++)
		{
			System.out.println(s[l]);
		}
			
		Object o[]=new Object[5];
		o[0]="raju";
		o[1]=34;
		o[2]='F';
		o[3]=12.333;
		o[4]=true;
		for(int m=0;m<o.length; m++)
		{
			System.out.println(o[m]);
		}
        System.out.println("***");
        for(Object e:o)
        {
        	System.out.println(e);
        }
		System.out.println(o[1]);
		System.out.println("***************");
		int count=0;
		for(Object e:o)
		{
			System.out.println(count+ "="+e);
			count++;
		}
		System.out.println("*************");
		
		for(Object e:o)
		{
			//count=0;
			System.out.println(count +"="+e);
			count++;
		}
			
		System.out.println();
		
			
			
			
	}

}
