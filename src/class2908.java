import java.util.Scanner;

public class class2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        String[] strArray = st.split(" ");

        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        int temp = 0;
        int ctemp = 0;
        int dtemp = 0;
        int arr[] = new int[6];
        for (int i = 0; i < 3; i++) {
            temp = a % 10;//743
            arr[i] = temp;
            a = a / 10;
        }
        for (int i = 3; i < 6; i++) {
            temp = b % 10;//743
            arr[i] = temp;
            b = b / 10;
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                ctemp = arr[i] * 100;
            } else if (i == 1) {

                ctemp += arr[i] * 10;
            } else  {
                ctemp += arr[i];
            }
        }
        for (int i = 3; i < 6; i++) {
            if (i == 3) {
                dtemp += arr[i] * 100;
            } else if (i == 4) {
                dtemp += arr[i] * 10;
            } else{
                dtemp += arr[i];
            }
        }
        if (ctemp > dtemp) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr[i]);
            }
        } else if (dtemp > ctemp) {
            for (int i = 3; i < 6; i++) {
                System.out.print(arr[i]);
            }
        }


    }
}
