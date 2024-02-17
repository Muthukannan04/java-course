import java.util.*;

class Mythread extends Thread{
    public void run(){
        for(int i=0;i<51;i++){
            System.out.println(i);
        }
    }
}
class yourthread extends Thread{
    public void run(){
        for(int i=51;i<101;i++){
            System.out.println(i);
        }
    }
}
class Main{
    public static void main(String[] args){
        Mythread m1=new Mythread();
        yourthread y1=new yourthread();
        m1.start();
        y1.start();
        for(int i=101;i<151;i++){
            System.out.println(i);
        }
    }
}