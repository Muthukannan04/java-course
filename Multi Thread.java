class printer{
    void printdoc(int page,String s){
        for(int i=1;i<=page;i++){
            System.out.println("Printing"+i+"Page for"+s);
        }
    }
}
class Mathsthread extends Thread{
    printer p;
    Mathsthread(printer p){
        this.p=p;
    }
    public void run(){
        this.p.printdoc(5,"Maths");
    }
    
}
class Sciencethread extends Thread{
    printer p;
    Sciencethread(printer p){
        this.p=p;
    }
    public void run(){
        this.p.printdoc(7,"science");
    }
}
class Main{
    public static void main(String[] args){
        printer p1=new printer();
        Mathsthread m1=new Mathsthread(p1);
        Sciencethread s1=new Sciencethread (p1);
        m1.start();
        s1.start();
    }
}