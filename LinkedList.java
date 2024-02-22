class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
    
    // ADD FIRST 
    void addfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    
    
    // ADD LAST METHOD 
    void addlast(int data){
        Node newnode=new Node(data);
        if(this.head==null){
            this.head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    // DELETE FIRST
    void delfirst(){
        if(head==null){
            System.out.println("The List Is Empty");
        }
        else{
            head=head.next;
        }
    }
    
    // DELETE AT LAST
    void dellast(){
        if(head==null){
            System.out.println("The List Is Empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    
    
    // PRINT 
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        l1.addfirst(50);
        l1.addfirst(70);
        // l1.addlast(10);
        // l1.addlast(20);
        // l1.addlast(30);
        l1.delfirst();
        l1.print();
    }
}