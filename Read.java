import java.util.*;

public class Read {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        String first;
        while (in.hasNext()) {
            first = in.nextLine();
            System.out.println(i + " " + first);
            i++;
        }
    }
}
