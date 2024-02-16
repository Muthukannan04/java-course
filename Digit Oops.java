import java.util.*;
class Count{
  Count(int n){
    int count = 0;
    while(n!=0){
      int rem = n%10;
      n /= 10;
      count++;
    }
    System.out.println("Count of all digits: "+count);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    Count obj = new Count(n);
  }
}