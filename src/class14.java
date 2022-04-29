public class class14 {

    public static void main(String[] args) {
        int n = 421314218; // 421314218 ->8
        // 42131421 -> 1
        // 4213142 -> 2
        // ...
        // 0\
        int arr[] = new int [10]; // 0 ~ 9입력된 수를 cnt 하기위한 용도
        // int arr[0] = 0;
        //
        // int arr[1] = 3;
        //
        // int arr[4] = 2;
        //
        while (n > 0) {
            arr[n % 10]++;//10으로 나누었을때 나머지
            n /= 10;//위에서 나누었으니 숫자하나 줄임
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i+": "+ arr[i]);
        }

    }

}