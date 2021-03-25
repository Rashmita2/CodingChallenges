import java.util.Scanner;

public class output2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            // String s = String.format("%s", s1);
            // String n = String.format("%03d", x);
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
}
