import java.util.Scanner;

public class class29 {
//숫자 1234567  87654321 mix 찾기
    public static void distinct(int input[]){

        boolean aFlag =true;
        boolean bFlag =true;

        if(input[0] !=  1) {
            aFlag = false;
        }
        for (int i =1; i <input.length-1 ; i++){
            if(input[i]-input[i+1] != -1){
                aFlag = false;
                break;
            }
        }
        if (input[0] != 8){
            bFlag = false;
        }
        for (int i =1; i <input.length-1 ; i++){
            if(input[i]-input[i+1] != 1){
                bFlag = false;
                break;
            }
        }

        if (aFlag){
            System.out.println("ASD");
        }else if(bFlag){
            System.out.println("DSD");
        }else{
            System.out.println("mix");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input[] = new int [8];

        for (int i = 0; i<input.length;i++){
            input[i] =scan.nextInt();
        }

        distinct(input);

    }
}
