import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int OutIndex = in.nextInt();
        int arr[] = new int[1000];
        double result[] = new double[1000];

        for (int i = 0; i < OutIndex; i++) {
            int InIndex = in.nextInt();
            for (int j = 0; j < InIndex; j++) {
                arr[j] = in.nextInt();
                result[j] += arr[j];
            }
            double answer = result[i]/InIndex;
            System.out.println(Str\ing.format("%3d", answer));
        }
        in.close();
    }
}