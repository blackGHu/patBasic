import java.util.*;

public class Text1 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a * b != 0) {
                if (!flag) {
                    System.out.print(a * b + " " + (b - 1));
                } else {
                    flag = false;
                    System.out.print(" ");
                }

            }

        }
        in.close();
        if (!flag) {
            System.out.print("0 0");
        }
    }
}