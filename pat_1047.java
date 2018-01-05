import java.util.*;

public class pat_1047 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);   
            ArrayList arr = new ArrayList ();
            for(int i=0;i<10;i++){
                    int geshu = in.nextInt();
                for(int j=0;j<geshu;j++){
                    arr.add(i);
                   
                }
            }
            
            int flag = 0;
        //   arr.stream().forEach(x->System.out.print(x+" "));
          for(int i=0;i<arr.size();i++){
              if(!arr.get(i).equals(0)){
                arr.set(0, arr.get(i));
                arr.set(i,0);
                break;
              }
              
          }
        //   System.out.println(arr.get(1));
        //   arr.stream().forEach(x->System.out.print(x));
          for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
          }
        }
}