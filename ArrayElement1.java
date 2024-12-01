class ArrayElement1
{
	public static void main(String[]args)
	{
	   int[] a;

	   a =new int[5];		


 	//int []a = new int [5];

	//System.out.println(a);

	/*System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);*/

	for(int p : a)
	{

		System.out.println(p);
	}
	     
		a[0]=54;
		a[1]=64;
		a[4]=76;
		a[3]=76;
		a[2]=34;

		for(int p : a)
		{

			System.out.println(p);

		}
	    

	}


}