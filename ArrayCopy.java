import java.util.Arrays;

public class ArrayCopy
{
    public static void main(String[] args)
	{

        String[] names = {"Ravi", "Anu", "Kiran"};
        String[] selectedNames = new String[names.length];

        System.arraycopy(names,0,selectedNames,0,names.length);

        System.out.println("Original Array: " + Arrays.toString(names));
        System.out.println("Copied Array: " + Arrays.toString(selectedNames));
    }
}