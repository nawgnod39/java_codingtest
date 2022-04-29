public class class6 {
    public static void main(String[] args) {

        int num1 ,num2;
        num1= 12;
        num2 = 18;

        //작은수 큰수를  알아야함
        int small;
        int big;

        if (num1> num2){
            big = num1;
            small =num2;
        }else{
            big =num2;
            small=num1;
        }

        int gcd =1;//최대 공약수 1부터 시작 .초기화
        for (int i=1; i<=small;i++){
            if(big % i == 0 && small % i == 0 ){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
