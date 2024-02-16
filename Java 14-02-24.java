Polymorphism

Method Overloading

class abc{
    void f1(int n){
    System.out.println(n);
}
    void f1(int a,int b){
    System.out.println(a+b);
}
}
public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.f1(10);
		a1.f1(5+10);
		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------

Dynamic 


class abc{
    void f1(int n){
    System.out.println("Hi"+n);
}
}
class child extends abc{
    //void f1(int n){
    //System.out.println("Hello"+n);
//}
}

public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.f1(10);
		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------

Public

class abc{
    public int a;
    public int b;
    
    void f1(int a,int b){
        System.out.print(a+b);
    }
}


public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.f1(10,5);
		
	}
}

------------------------------------------------------------------------------------------------

Private

class abc{
    private int a;
    private int b;

public void set(int a,int b){
    this.a=a;
    this.b=b;
    }
    void print(){
        System.out.print(this.a+this.b);
    }
}


public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.set(10,5);
		a1.print();
		
	}
}
----------------------------------------------------------------------------------------------------------------
Getter and Setter 


class abc{
    private int age;

 void set(int age){
    this.age=age;
    }
    int get(){
        return age;
    }
}


public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.set(10);
		int b=a1.get();
		System.out.print("Hello "+b);
		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------
Final

class abc{
    final int a=10;
    final void f1(int a){
        System.out.print("Hello"+a);
    }
}

public class Main{
    public static void main(String[] args){
        abc a1=new abc();
        //a1.a=20;
       // System.out.print(a1.f1(a));
        a1.f1(a1.a);
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
This Keyword for Variable

class abc{
    int a;
    void f1(){
      System.out.print(this.a);
    }
    void f2(int a){
        this.a = a;
    }
}
class Main{
    public static void main(String[] args){
        abc a1=new abc();
        a1.f2(10);
        a1.f1();
    }
}
------------------------------------------------------------------------------------------------------------------------------------------

This Keyword for Method

class abc{
    int a;
    void f1(){
        System.out.print("Hello "+a);
    }
    void f2(){
        this.f1();
    }
}
public class Main
{
	public static void main(String[] args) {
		abc a1=new abc();
		a1.a=10;
		a1.f2();
	}
}

------------------------------------------------------------------------------------------------------------------------------------------

This Keyword for Constructor

class abc{
    abc(int a,int b){
        System.out.print(a+b);
    }
    abc(){
        this(3,10);
        System.out.print("Hello");
        
    }
}
class Main{
    public static void main(String[] args){
        abc a1=new abc(5,10);
        abc a2=new abc();
        
    }
}

-----------------------------------------------------------------------------------------------

Super for variable

class a{
    int pid=100;
}
class b extends a{
    int pid=500;
    void print(){
        System.out.print(super.pid);
        System.out.print(this.pid);
        
    }
}
public class Main{
    public static void main(String[] args){
        b a1=new b();
        a1.print();
        
    }
}
--------------------------------------------------------------------------------------------------

Super for Method

class a{
    void f1(){
          System.out.print("Parent f1");
    }
}
class b extends a{
    void f1(){
        System.out.print("Child f1");
    }
    void print(){
        this.f1();
        super.f1();
    }
}
public class Main{
    public static void main(String[] args){
        b a1=new b();
        a1.print();
        
    }
}
--------------------------------------------------------------------------------------------------

Super for Constructor

class A{
    A(int a,int b){
          System.out.print("From A"+(a+b));
}
}
class B extends A{
    B(){
        super(10,20);
    }
}

public class Main{
    public static void main(String[] args){
        B a1=new B();
        //a1.b();
        
    }
}
--------------------------------------------------------------------------------------------------
static keyword

class A{
    static int age;
    void print(){
        System.out.print(age);
    }
}

class Main{
    public static void main(String[] args){
        A a1=new A();
        a1.age=30;
        A a2=new A();
        a2.age=14;
        a1.print();
        a2.print();
        
    }
}
--------------------------------------------------------------------------------------------------

Encapsulation

class A{
    int a;
    int b;
    void print(){
        System.out.print(a+b);
    }
}

class Main{
    public static void main(String[] args){
        A a1=new A();
 
        A a2=new A();
        a1.a=10;a1.b=20;
        a2.a=30;a2.b=50;
        a1.print();
        a2.print();
    }
}
--------------------------------------------------------------------------------------------------








