public class SecondLargest {

    public static void main(String[] args) {
        int[] array = {10, 20, 5, 8, 25};
        secondLargest(array);
    }

    public static void secondLargest(int[] array) {
        int largest = array[0];
        int second = array[0];

        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }

        for (int num : array) {
            if (num != largest && num > second) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}