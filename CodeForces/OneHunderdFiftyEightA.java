import java.util.*;
public class OneHunderdFiftyEightA{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int [] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if(a[i] > a[j]){
          int temp = a[i];
          a[i]=a[j];
          a[i]=temp;
        }
      }
    }
    int count=0;
    for(int i=0; i<n; i++){
      if(a[i] > 0){
         if(a[i] > a[k-1] || a[i] == a[k-1]){
           count++; 
         }
      }
    }
    System.out.println(count);
  }
}