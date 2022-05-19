import java.util.Scanner;

public class class2657 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();// TEST CASE 갯수

        for(int i=0 ;i<num;i++){

            int R =sc.nextInt();//R 번 반복
            String S =sc.next();
            for(int j=0; j<S.length();j++){
                for(int k=0; k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }

        }



    }
}

