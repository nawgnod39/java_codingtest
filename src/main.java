import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inputNum = new int[10];
        for (int i = 0; i < 10; i++) {
            inputNum[i] = scan.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(inputNum[i]);
        }
        int[] mode = new int[10];

        System.out.println();
        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mode[i]);
        }

        int modeNum = 0; // 현재 최빈수
        int modeCnt = 0; //최빈 수 횟수
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 " + modeNum + " CNT : " + modeCnt);
    }
}
