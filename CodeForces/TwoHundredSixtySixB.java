import java.util.*;
public class TwoHundredSixtySixB{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    String s=sc.next();
    char[] c=s.toCharArray();
    for(int i=1; i<=t; i++){
        for(int j=0; j<n-1; j++){
            if(c[j] == 'B' && c[j+1] == 'G'){
                c[j]='G';
                c[j+1]='B';
                j++;
            }
        }
    }
    System.out.println(new String(c));
  }
}