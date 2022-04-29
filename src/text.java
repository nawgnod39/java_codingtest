public class text {
    public static void main(String[] args) {


        String input = "helloWorLd";
        char []arr;
        arr = input.toCharArray();//문자열 객체를 케릭터 arr 로 반환해주는 메소드


        System.out.println(arr);
        for(int i=0;i<arr.length; i++){
            if(arr[i]>'a'&& arr[i]<='z'){
                arr[i] = (char)(arr[i]-('a'-'A'));
//97-65 = 32
            }else if(arr[i]>= 'A' && arr[i]<='Z'){
                arr[i]=(char)(arr[i]+('a'-'A'));
            }
        }
        System.out.print(arr);
    }
}
