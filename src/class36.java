import java.util.Scanner;

public class class36 {



    public static void decToBin(int N ){

/*17
*  8  --1
*  4  --0
*  2  --0
*  1  --0
*
*
* */
        if(N/2==0){
            System.out.print(N);
            return;
        }
        decToBin(N/2);
        System.out.print(N%2);

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        decToBin(input);

    }
}
