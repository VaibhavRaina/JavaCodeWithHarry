public class TwentyNine {
    static int avg(int...sum){
        int i;
        int s1=0;
        int avg1;
        for(i=0;i<sum.length;i++){
            s1=s1+sum[i];


            

        }

        avg1=s1/sum.length;
        System.out.println(avg1);

        return 0;
    }

    public static void main(String[] args) {
        avg(2,2);
        
    }
    
}
