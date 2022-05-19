import java.util.Scanner;

public class class1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str =sc.nextLine();

        String trimStr =str.trim();
        String[] a =trimStr.split(" ");


        int count =0;
        for(int i=0; i<a.length;i++){
            count++;
            if (trimStr.equals("")) {
                System.out.println(0);
                return;
            }

        }

        System.out.println(count);

    }
}
