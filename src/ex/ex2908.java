package ex;

import java.io.*;
import java.util.StringTokenizer;

public class ex2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num1, num2;
        boolean isNum1Big = false;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        num1 = st.nextToken().split("");
        num2 = st.nextToken().split("");

        for (int i=2; i>=0; i--){
            if (Integer.parseInt(num1[i]) > Integer.parseInt(num2[i])){
                isNum1Big = true;
                break;
            }
            else if (Integer.parseInt(num1[i]) < Integer.parseInt(num2[i])){
                isNum1Big = false;
                break;
            }
        }

        for (int i=2; i>=0; i--){
            if(isNum1Big)
                System.out.print(num1[i]);
            else
                System.out.print(num2[i]);
        }


        br.close();
    }
}
