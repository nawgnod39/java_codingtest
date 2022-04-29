import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class class12 {
    public static void main(String[] args) {



        int  n = 4;
        int arr[][] = new int[n][n];
        int num=1;
        int num2=1;

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i] =num;
                num++;
                System.out.printf("%4d",arr[j][i]);

            }
            System.out.println();
        }
        System.out.println("----");

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i] =num2;
                num2++;

                System.out.printf("%4d",arr[i][j]);

            }
            System.out.println();
        }/*
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }*/
      /*
        int num =5;

        for(int i =0; i<num;i++){
            for (int j= 0;j<num;j++){
                System.out.printf("%5d",j*(num)+i+1);
            }
            System.out.println();
        }
*/
    }
}
