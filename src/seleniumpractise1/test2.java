package seleniumpractise1;

public class test2 {

	public static void main(String[] args)
	
	{
		int num = 0;
		
		//System.out.println(num "is" );
		System.out.println(num + "is");
		
		String[] name = {"dip","sam","pra"};
		for(String s : name)
		{
			
		System.out.println(s);
		}
		
		//check if array has any multiple of 2
		int[] arr = {2,5,24,3,5,33,66,57};
		for(int s : arr)
		{
			if(s%2==0)  //compare two integers -> == The equality ( == ) operator checks whether its two operands are equal, returning a Boolean result
			//	The == operator checks if two values are equal. 
			{System.out.println(s);
			break;
			}
			else {}
		}
		
	}
}
