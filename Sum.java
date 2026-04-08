class Sum{
	public static void main(String[] args)
	{
		int[] numbers={1,2,3,4,5};
		int sum=0;
		for(int index=0;index<numbers.length;index++)
		{
			sum=sum+numbers[index];
		}
		System.out.println("Sum:"+sum);
	}
}