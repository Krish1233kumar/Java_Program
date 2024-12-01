class Arraylong
{
	public static void longMethod1(long [] a)

	{
		System.out.println (a);
	
		System.out.println (a[0]);
		System.out.println (a[1]);
		System.out.println (a[2]);
		System.out.println (a[3]);
		System.out.println (a[4]);
		System.out.println (a[5]);

		System.out.println(a.length);
	}

		public static void main(String []args)
		{
			long[] a ={8644l,7547856l,96785l,5634535l,123346546l,57687l};

				longMethod1(a);
		}
}