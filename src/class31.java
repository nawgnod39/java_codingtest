import java.util.Scanner;

public class class31 {


    public static int cal(int input){



        if(input==1){
            return 1;
        }
        return input*cal(input-1);
    }
    public static void main(String[] args) {

        int input;

        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        int ans =0;

        ans =cal(input);

        System.out.println(ans);
    }

}
