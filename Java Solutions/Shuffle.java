import java.util.Arrays;
import java.util.Random;

public class Shuffle{
    public static void main(String[] args) {
        int[] original= {1, 2, 3, 4, 5, 6, 7};
        int[] shuffled = Arrays.copyOf(original, original.length);
        Random random = new Random();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Shuffled: " + Arrays.toString(shuffled));
    }
}

