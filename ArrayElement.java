class ArrayElement
{
	public static void main(String[]args)
	{

 	//String []a;
 	//a = new String[5];


	String [] a =new String[5];


 	//System.out.println(a);
 
	  /*System.out.println(a[0]);
	  System.out.println(a[1]);
	  System.out.println(a[2]);
	  System.out.println(a[4]);
	  System.out.println(a[3]);*/
	  

		for(String p : a )
		{

			System.out.println(p);
		}
	
		a[0]="5";
		a[1]="576";
 		a[2]="645";
		a[3]="74";
 		a[4]="92";
 
                System.out.println("=======");

		for (String p : a)

		{

			System.out.println(p);
		
		}

	}
}