import java.util.Scanner;

public class class30 {
    public static void main(String[] args) {

        int until;
        boolean flag = true;

        Scanner scan = new Scanner(System.in);

        until=scan.nextInt();


        for (int i=0; i<until;i++){

            if( i == until){
                System.out.println(i);
                break;
            }

            if(flag){
                System.out.print(i+"+");
                flag =false;
            }else{
                System.out.print(i+"-");
                flag = false;
            }

        }

    }
}
