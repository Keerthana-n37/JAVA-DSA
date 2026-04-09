class Sum
{
	public static void main(String[] args)
	{
		int[] array = {10, 15, 20, 25, 30, 33};
		int sum = findSum(array);
        System.out.println("Sum of array:"+sum);		
	}
	
	static int findSum(int[] array)
	{
		int sum=0;
		for(int num: array)
		{
			sum+= num;
		}
		return sum;
	}
	
}