class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
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
        if(head!=null){
            head.prev=newnode;
        }
        head=newnode;
    }
    
    // ADD LAST
void addlast(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
}

// DELETE FIRST
void delfirst(){
    if(head==null){
        System.out.println("List is Empty");
    }
    else{
        head=head.next;
        head.prev=null;
    }
}    

//DELETE LAST
void dellast(){
    if(head==null){
        System.out.println("List is Empty");
    }
    else if(head.next==null){
        head=null;
    }
    else{
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
            temp.next.prev=null;
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
        //l1.addfirst(50);
        //l1.addfirst(70);
        l1.addlast(10);
        l1.addlast(20);
        l1.addlast(30);
       // l1.delfirst();
        l1.dellast();
       // l1.delfirst();
        l1.print();
    }
}