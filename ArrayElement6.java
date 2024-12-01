class ArrayElement6
{
	public static void main(String[]args)
	{
		
		float[] f;
		f =new float[5];
	
		System.out.println(f);

		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);
		System.out.println(f[4]);



		f[0]=34.35f;
		f[1]=752.2f;
		f[2]=752.2f;
		f[3]=792.2f;
		f[4]=882.2f;

		
		for(float r : f)
		{

			System.out.println(r);

		}


	}


}