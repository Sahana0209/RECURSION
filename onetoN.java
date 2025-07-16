public class onetoN {
    public static void oneton(int n){
        if(n<1){
            return;
        }
        oneton(n-1);
        System.out.print(n+" ");
    }
    public static void main(String [] args){
        int N=10;
        oneton(N);
    }
}
