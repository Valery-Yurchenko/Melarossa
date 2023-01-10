import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        SettingArrayBounds settingArrayBounds = new SettingArrayBounds(31, 49);

        int[] array = new int[20];
        System.out.print("not sorted array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = settingArrayBounds.getRandomNumber();
            System.out.print(array[i] + ", ");
        }
        //Arrays
        System.out.println();
        Arrays.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
        System.out.println("max number = " + array[array.length - 1]);
        System.out.println("mix number = " + array[0]);
        System.out.println();

        //Stream
        System.out.println();
        int max1 = Arrays.stream(array)
                .max()
                .getAsInt();
        int min1 = Arrays.stream(array)
                .min()
                .getAsInt();
        System.out.println("max number = " + max1);
        System.out.println("mix number = " + min1);

        //
        System.out.println();
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
