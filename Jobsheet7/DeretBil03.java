package Jobsheet7;

public class DeretBil03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if ((i % 3) == 0 ){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
