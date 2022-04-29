public class class20 {
    public static int getNum (int i) {
        int j = 0;

        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
                j++;
            i = i/10;
        }
        return j;
    }
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            int cnt = getNum(i);

            if (cnt == 0) {
                System.out.print(i+ " ");
            }
            else {
                for (int l = 0; l < cnt; l++) {
                    System.out.print("¦");
                }
                System.out.print(" ");
            }
        }
/*
        int num =100;

        for(int i=1; i<=num; i++){

            if(i%10==3||i%10==6||i%10==9||(i>=90&&i<100)) {
                System.out.print("짝");
            }else {
                System.out.print(i);
            }
        }
*/


    }
}
