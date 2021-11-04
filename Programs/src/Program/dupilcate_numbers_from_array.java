package Program;

public class dupilcate_numbers_from_array 
{
  // Program to find the duplicated numbers from array
	
	public static void main(String[] args) 
	{
		int a []= { 1,1,2,3,4,4,5,6,6 };
		
		System.out.println(" duplicate numbers in given arrays are:-");
		
		for ( int i =0; i<a.length-1; i++)
		{
			for  ( int j =i+1; j <a.length; j++)
			{
				if ((a[i] == a [j]) && (i!=j))
				{
					System.out.print(a[j] + " ,");
				}
			}
		}

	}

}
