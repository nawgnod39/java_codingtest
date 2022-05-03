import java.util.Scanner;

public class class1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int avg = sc.nextInt();
        int[] arr = new int[avg];
        int max=0;

        int sol=0;
        int temp=0;
        double c=0;
        int a=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {

        }
        for(int i=0;i<arr.length;i++){

            sol+=(arr[i]/max)*100;

        }
        System.out.println(sol);

        temp= sol/3;


        System.out.println(temp);


    }
}
