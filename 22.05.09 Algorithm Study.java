import java.util.Scanner;

public class Main {
    public static void main() {
        int array=0, row=0;
        int a=0, b=0, count=1;

        Scanner sc = new Scanner(system.in);

        System.out.println("행, 열을 순서대로 입력하시오 : ");
        cnt1 = sc.nextInt();
        cnt2 = sc.nextInt();

        arr = new int[cnt1][cnt2];

        for(int i=0; i<cnt1; i++) {
            arr[i][cnt2] = sc.nextInt();
        }

        while(true) {
            if(arr[a][b+1]==1) {
                arr[a][b]=0;
                b++;
            }  

            if(arr[a][b-1]==1) {
                arr[a][b]=0;
                b--;
            }

            if(arr[a+1][b]==1) {
                arr[a][b]=0;
                a++;
            }

            if(arr[a-1][b]==1) {
                arr[a][b]=0;
                a--;
            }

            count++;
        }
    }
}