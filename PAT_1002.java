import java.util.*;

public class PAT_1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String[] arr = str.split("");
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(arr[i]);
        }
        // System.out.println(sum);
        String sun = sum + "";

        for (int i = 0; i < sun.length(); i++) {
            switch (sun.charAt(i)) {
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
            case '0':
                System.out.print("ling");
                break;

            }
                if(i<sun.length()-1){
                    System.out.print(' ');
                }
        }
        
    }
}