import java.util.Scanner;
public class ThreeHundredThirtyNineA{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] arr= s.split("\\+");
    for(int i=0; i<s.length(); i++){
        for(int j=i+1; j<s.length(); j++){
            if(arr[i].equals(arr[j])){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[i]=temp;
            }
        }
    }
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
  }
}