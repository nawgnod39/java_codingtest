public class class11 {
    public static void main(String[] args) {
/*   1   2   3   4   5
  10   9   8   7   6
  11  12  13  14  15
  20  19  18  17  16
  21  22  23  24  25
    Scanner scan = new Scanner(System.in);
        int str;

        System.out.println("Scanner 방식의 입력 테스트 입니다.");

        str = scan.nextInt();

        for (int i=0; i<=str; i++){

        }
        System.out.println(str);*/
        int n = 3;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {//나머지가 0
                for(int j=0; j<n; j++){
                    arr[i][j] =i * n +j+1;
                }
            } else {
                for(int j= n -1;j>=0; j--){
                    arr[i][j] = i*n + n-j;
                }
            }

        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

}