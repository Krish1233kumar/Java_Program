class ArrayElement7
{
	public static void main(String[]args)
	{
		double[] d ;

		d = new double[5];

		System.out.println(d);

		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);


		d[0]=83476.42;
		d[1]=2874.2;
		d[2]=2874.2;
		d[3]=2874.2;
		d[4]=2874.2;			

		for(double y : d)
		{

			System.out.println(y);

		}



	}


}