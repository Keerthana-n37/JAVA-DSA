class CountOdd
{
	public static void main(String[] args)
	{
		int[] array= {10,15,20,25,30,33};
		int count= countOdd(array);
		System.out.println("Odd number count:"+count);
	}
	
	static int countOdd(int[] array)
	{
		int count=0;
		for(int num:array)
		{
			if(num%2 !=0)
			{
				count++;
			}
		}
		return count;
	}
}