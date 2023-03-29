import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 1, 5, 7, 7, 3, 2, 5, 7};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE ];

        for (int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }
}