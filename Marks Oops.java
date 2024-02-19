
import java.util.*;
class Main{
  public static void main(String[] args){
    int n,i,r,m1,m2,m3,m4,m5,max1=0,max2=0,max3=0,max=0,r1=0,r2=0,r3=0,r4=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    Student[] s=new Student[n];
    for(i=0;i<n;i++)
      {
        r=sc.nextInt();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        
        s[i]=new Student(m2,m3,r);
        s[i].setMark1(m1);
      }
    for(i=0;i<n;i++)
      s[i].Print();
    for(i=0;i<n;i++){
      if(max1<s[i].mark1){
        max1=s[i].mark1;
      r1=s[i].roll;
      }
      if(max2<s[i].mark2){
        r2=s[i].roll;
        max2=s[i].mark2;
      }
      if(max3<s[i].mark3){
        r3=s[i].roll;
        max3=s[i].mark3;
      }
      if(max<s[i].max){
        r4=s[i].roll;
        max=s[i].max;
      }
    }
    System.out.println(r1+" "+max1+"\n"+r2+" "+max2+"\n"+r3+" "+max3+"\n"+r4+" "+max);
    
  }
}
class Student{
  int mark1,mark2,mark3,mark4,mark5,roll,max;
  Student(int m2,int m3,int r){
    this.mark2=m2;
    this.mark3=m3;
    
    this.roll=r;
  }
  public void setMark1(int m1) 
  { 
    this.mark1 = m1; 
  }
 public void Print(){
   max=mark1+mark2+mark3;
   System.out.println(mark1+mark2+mark3);
 }

}