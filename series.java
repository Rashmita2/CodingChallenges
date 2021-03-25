import java.util.*;

public class series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += Math.pow(2, j) * b;
                System.out.printf("%s ", a);
            }
        }
    }
}
