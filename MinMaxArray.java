class MinMaxArray {

    public static void main(String[] args) 
	{
        int[] array = {10, 5, 20, 8, 25};
        findMinMax(array);
    }

    static void findMinMax(int[] array) {
        int min = array[0], max = array[0];

        for (int num : array) {
            if (num < min) 
			{
			   min = num;
			}
            if (num > max) 
			{
				max = num;
			}
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}