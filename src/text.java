

class sjb {
    static private sjb instance =null;
    private int count =0;
    static public sjb get(){
        if(instance == null){
            instance = new sjb();
        }
        return instance;
    }
    public void count(){count++;};
    public int getCount(){return  count;}
}
public class text {
    public static void main(String[] args) {

        sjb s1= sjb.get();
        s1.count();
        sjb s2= sjb.get();
        s2.count();
        sjb s3 =sjb.get();
        s3.count();
        System.out.println(s1.getCount());
    }
}
