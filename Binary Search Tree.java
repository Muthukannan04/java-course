import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
        }
        else{
            Node temp=root;
            while(true){
                if(newnode.data<temp.data){
                    if(temp.left==null){
                        temp.left=newnode;
                        break;
                    }
                    else{
                        temp=temp.left;
                    }
                }
                else if(newnode.data>temp.data){
                    if(temp.right==null){
                        temp.right=newnode;
                        break;
                    }
                    else{
                        temp=temp.right;
                    }
                }
            }
        }
    }
    void display(){
        displayRec(root);
    }
    void displayRec(Node root){
        if(root==null){
            return;
        }
    displayRec(root.left);
    System.out.println(root.data);
    displayRec(root.right);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BST t1=new BST();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            t1.insert(e);
        }
        t1.display();
        
    }
}