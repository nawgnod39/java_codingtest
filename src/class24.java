import java.util.Scanner;

public class class24 {
    public static void main(String[] args) {
            // 접근 제한 없이 메모리에 상주하고 리턴 값이 없이 main 함수를 선언한다.
            Scanner in = new Scanner(System.in);

            // 값을 입력받을수 있께 Scanner 변수 in를 선언한다.
            int[] arr;
            // 배열 arr[]를 선언한다.
            int testcase = in.nextInt();
            // 변수 testcase를 선언하고 값을 입력받아 testcase에 저장한다.

            for(int i = 0 ; i < testcase ; i++) {
                int n = in.nextInt();
                // 학생수를 입력받는다.
                arr = new int[n];
                // int 형 배열 arr를 n개 만큼 생성한다.

                double sum = 0;
                // 성적 합을 저장하는 double형 변수인 sum를 선언하고 0으로 초기화한다.

                // 성적을 입력하는 부분이다.
                for(int i1 = 0 ; i1 < n ; i1++) {
                    int grade = in.nextInt();
                    // 성적을 입력받아 그 값을 변수 grade에 저장한다.
                    arr[i1] = grade;
                    // 변수 grade 값을 변수 i1에 저장한다.
                    sum += grade;
                    // sum + grade 한 값을 변수 sum에 저장한다.
                }

                double avg = (sum / n) ;
                // double 형 변수 avg를 선언하고 sum/n한 값을 저장한다.
                double count = 0;
                // 평균 넘는 학생 수를 저장하는 변수인 count를 선언하고 초기화한다.

                // 평균 넘는 학생 비율를 찾는다.
                for(int i2 = 0 ; i2 < n ; i2++) {
                    if(arr[i2] > avg) {
                        // 변수 arr[i2]가 평균을 넘을 때마다 if문 안의 값이 실행된다.
                        count++;
                        // count값이 더해진다.
                    }
                }

                System.out.println(count);
                System.out.printf("%.3f%%\n",(count/n)*100);
                // (count/n)*100한 결과 값을 소수점 3자리까지 출력한다.
            }

            in.close();
            // 객체 in의 사용을 종료한다.
        }

    }