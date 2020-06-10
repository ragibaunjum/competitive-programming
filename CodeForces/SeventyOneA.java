import java.util.*;
public class SeventyOneA {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
          String s = sc.nextLine();
          if(s.length() > 10){
            System.out.print(s.charAt(0));
            System.out.print(s.length()-2);
            System.out.print(s.charAt(s.length()-1));
            System.out.println();
          }
          else{
            System.out.println(s);
          }
        }
    }    
}
