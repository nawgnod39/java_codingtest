package ex;


public class exB {

    public static void main(String[] args) {

        //1부터 100까지 소수 출력


        int check=0;
        for(int i=2; i<=100;i++){
            for(int j=2;j<100;j++){
                if(i%j==0){
                    check++;
                }
            }
            if(check==1){
                System.out.print(i+" ");
            }

            check=0;



        }



    }

}
