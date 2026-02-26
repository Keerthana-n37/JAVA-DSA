class ReverseString{

   public static void main(String[] args)
   {
		String input="idli";
		String reversed="";
		int index;
		for(index=input.length()-1;index>=0;index--)
		{
			reversed=reversed+input.charAt(index);
		}
		System.out.println("Reversed:"+reversed);
	}
}