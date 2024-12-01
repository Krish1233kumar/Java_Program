class ArrayElement9
{
	public static void main(String[]args)

	{
		char[] c;
		c = new char[5];

		System.out.println(c);


		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);


		c[0]='A';
		c[1]='E';
		c[2]='I';
		c[3]='O';
		c[4]='U';

		for(char y : c )
		{

			System.out.println(c);
		}


	}

}