import java.util.Scanner;

public class class1929 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int m = input.nextInt();
                int n = input.nextInt();
                boolean pN[] = new boolean[n+1];
                pN[1] = true;
                for(int i=2; i*i<=n; i++)
                    if(!pN[i])
                        for(int j=i*i; j<=n; j+=i)
                            pN[j] = true;
                for(int i=m; i<=n; i++){
                    if(!pN[i])
                        System.out.println(i);
                }
            }
        }
      /*  Scanner sc= new Scanner(System.in);

        int M =sc.nextInt();
        int N =sc.nextInt();

        int check=0;

        for(int i=M;i<=N;i++){

            for(int j=2;j<=N;j++) {
                if(i%j == 0){
                    check++;
                }
            }
            if(check==1) {
                System.out.println(i);
            }
            check=0;
        }*/


