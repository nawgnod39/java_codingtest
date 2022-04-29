public class class9 {
    public static void main(String[] args) {

//각자리수합 

        int inputNum  =1111;

        int accSum =0 ;

        //for
        for(int i=inputNum; i>0; i=i/10){
            accSum=accSum+i%10;
        }
        System.out.println(accSum);


        //while

        /*while (inputNum>0){
            accSum =accSum+inputNum%10;
            inputNum = inputNum/10;
        }

        System.out.println(accSum);*/
    }
}
