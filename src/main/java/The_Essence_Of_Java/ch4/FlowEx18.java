package The_Essence_Of_Java.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++){
                System.out.printf("%d X %d = %d%n", i, j, i*j);
            }
        }
    } //end of main
}
