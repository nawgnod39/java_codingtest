package ex;


import java.util.Scanner;

public class ex1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        final int SIZE = 1000001;
        boolean array[] = new boolean[SIZE];


        array[1] = true;

        for (int i = 2; i <= N; i++)
        {
            for(int k = 2; i*k <= N ; k++)
            {
                array[i*k] = true;
            }
        }

        for (int i = M; i <= N ; i++)
        {
            if(array[i] == false) System.out.println(i);
        }

    }
}

