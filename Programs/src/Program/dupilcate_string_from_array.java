package Program;

public class dupilcate_string_from_array 
{
  // Program to find the duplicated numbers from array
	
	public static void main(String[] args) 
	{
		
		String str =" abc abc abcd abcd cd";
		String arr [] = str.split("");
	    int a =0;
		
		for ( int i =0; i<=arr.length-1; i++)
		{
			for  ( int j =arr.length-1; j >=0; j--)
			{
				if ((arr[i] == arr [j]) && (i!=j))
				{
					a++;
				}
			}
		}
if (a>0)
{
	System.out.println("duplicate string found in array");
}
else
{
	System.out.println("duplicate string not found in array");
}
	}

}
