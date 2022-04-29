public class class23 {
    public static void main(String[] args) {
        //문자열 뒤집기
        String n ="ADEFGH";
        char str[] = n.toCharArray();
        System.out.println(n);
        char tmp;
        int len =str.length;

        for(int i=0; i<len/2;i++){
            tmp= str[i];
            str[i] =str[len-i-1];
            str[len-i-1] =tmp;
        }

      n= new String(str);
        System.out.println(n);

    }
}
