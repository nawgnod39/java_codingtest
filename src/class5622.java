import java.util.Scanner;

public class class5622 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] str = new int[29];
        int[] a = new int[15];
        String st = sc.next().toUpperCase();//WA 입력
        String[] s = st.split("");


        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            a[i] = s[i].charAt(0) - 'A' + 3;
            System.out.print(a[i] + "-" + i + " ");

        }
        System.out.println("   ----   ");
        System.out.println( s.length+" = S LEN");
        System.out.println("   ----   ");
        for (int i = 0; i < str.length; i++) {
            if (i < 3) {
                str[i] = i;
            } else if (i < 6) {
                str[i] = 3;
            } else if (i < 9) {
                str[i] = 4;
            } else if (i < 12) {
                str[i] = 5;
            } else if (i < 15) {
                str[i] = 6;
            } else if (i < 18) {
                str[i] = 7;
            } else if (i < 22) {
                str[i] = 8;
            } else if (i < 25) {
                str[i] = 9;
            } else {
                str[i] = 10;
            }

           /* for (int j = 0; j < s.length; j++) {
                if (str[i]== a[j]) {
                    count = count + i;
                }
            }*/

        }
        for(int i=0; i<s.length;i++){
            for(int j=0; j<str.length;j++){
                if(j==a[i]){
                    count= count+str[j];
                }
            }
        }

        System.out.println(count + "  count  ");


     /*   System.out.println(count + "  count  ");
        for (int i = 0; i < str.length; i++) {
            System.out.println("Str[i] " + str[i] + " i =" + i);
        }*/
    }
}
