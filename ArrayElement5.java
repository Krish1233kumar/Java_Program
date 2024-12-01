class ArrayElement5
{

	public static void main(String[]args)

	{
	   long[] a;
	   a = new long[5];

	// long[] a =long[5];

	  System.out.println(a);


		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		a[0]=3874;
		a[1]=8737;
		a[2]=3721;
		a[3]=1763;
		a[4]=98927;
		

		for(long y : a )
		{
			System.out.println(y);

		}

	
	}


}