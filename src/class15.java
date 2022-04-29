import java.util.Scanner;

public class class15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum;
        int arr[] = new int[2];
        inputNum = scan.nextInt();
        System.out.print(inputNum);
        System.out.println();

        for (int j= inputNum;j<4;j++) {
            for (int i =1; i < 10; i++) {
                System.out.printf("%2d *%2d =%3d", inputNum, i, inputNum * i);
                System.out.println();
            }
            inputNum++;
        }


    }
}
