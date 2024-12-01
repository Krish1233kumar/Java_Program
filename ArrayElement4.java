class ArrayElement4
{
	public static void main(String[]args)
	{
		short[] a;
		a = new short[5];
		System.out.println(a);

		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
     		System.out.println(a[4]);*/


		a[0]=10;
		a[1]=12;
		a[2]=9;
		a[3]=8;
		a[4]=9;
		

		for(short p : a)
		{

		System.out.println(p);

		}

	}


}