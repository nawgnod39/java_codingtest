import java.util.Scanner;

public class class1978 {
    public static void main(String args[]) {

        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        int count =0;

        int sosu;
        for(int i=0;i<num;i++){
            sosu=sc.nextInt();
            for(int j=2; j<=sosu;j++){

                if(sosu==j){
                    count++;
                }
                if(sosu%j ==0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}