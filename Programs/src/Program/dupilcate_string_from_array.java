package Program;

public class dupilcate_string_from_array 
{
  // Program to find the duplicated numbers from array
	
	public static void main(String[] args) 
	{
		
		String str ="abc abc abcd abcd cd";
		String arr [] = str.split(" ");
	    
		for ( int i =0; i<=arr.length-1; i++)
		{
			int a =1;
			for  ( int j =i+1; j <=arr.length-1; j++)
			{
				if ((arr[i].equals(arr[j]) && i!=j))
				{
					a++;
					arr[j]=" ";
				}
			}
			if (a>1 && arr[i]!=" ")
			{
				System.out.println(arr[i] +" duplicate string found in array");
			}

		}
	}

}
