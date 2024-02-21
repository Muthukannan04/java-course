import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
	this.data=data;
}
}
class LinkedList{
	Node head;
	LinkedList(){
	  this.head=null;
}
void addfirst(int data){
Node newnode=new Node(data);
newnode.next=head;
head=newnode;
}
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
	l1.addfirst(30);
	l1.addfirst(40);
	l1.addfirst(60);
	l1.print();
}
}