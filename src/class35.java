import java.util.Scanner;

public class class35 {


    public static void extract(int N){

        if(N/10 ==0){
            System.out.println(N);
            return ;
        }
        extract(N/10);
        System.out.println(N%10);

     }
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        extract(input);


    }
}
