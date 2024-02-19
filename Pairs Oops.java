import java.util.*;
class Pairs{
  Pairs(int a[],int n,int sum){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i]+a[j] == sum){
          System.out.println(a[i]+" "+a[j]);
        }
      }
    }
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int sum = sc.nextInt();
    Pairs p = new Pairs(a,n,sum);
  }
}