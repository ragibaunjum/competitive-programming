import java.util.*;
public class TwoHundredEightyTwoA{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String x="X++";
    String y="++X";
    String z="X--";
    String w="--X";
    int count=0;
    for(int i=0; i<=n; i++){
        String s=sc.nextLine();
        if(x.equals(s)){
            count++;
        }
        else if(y.equals(s)){
            count++;
        }
        else if(z.equals(s)){
            count--;
        }
        else if(w.equals(s)){
            count--;
        }
    }
    System.out.println(count);
  }
}