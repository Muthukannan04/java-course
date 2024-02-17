import java.util.*;

class Bicycle{
  int gear;
  int speed;
  int height;
  
}
class MountainBike extends Bicycle{
  MountainBike(int g,int s,int h){
  super.gear=g;
  super.speed=s;
  super.height=h;
  }
  public String toString(){
    return "No of gears are "+gear+"\nspeed of bicycle is "+speed+"\nseat height is "+height;
  }
}
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Bicycle b1=new Bicycle();
    int g,s,h;
    g=sc.nextInt();
    s=sc.nextInt();
    h=sc.nextInt();
    MountainBike m=new MountainBike(g,s,h);
    System.out.print(m);
  }
}