import javax.print.DocFlavor;
import java.util.Scanner;

public class class10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(input.indexOf(c) + " ");
    }
}
