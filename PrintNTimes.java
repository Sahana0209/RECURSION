public class PrintNTimes {
    
    public static void printMessage(int n) {
        if (n <= 0) {
            return; 
        }

        System.out.println("Hello my dear");
        printMessage(n - 1); 
    }

    public static void main(String[] args) {
        int N = 5; 
        printMessage(N);
    }
}

