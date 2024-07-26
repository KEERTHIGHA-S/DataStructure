class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

class Linkedlist
{
    Node head,tail;
    public void insertend(int data)
    {
        Node n=new Node(data);
        n.next=null;
        
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        
    }
    
    public void insertbeg(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    
    public void insertat(int pos,int data)
    {
        Node n=new Node(data);
        Node temp=head;
        for(int i=0; i<pos-1; i++)
        {
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        
    }
    
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    
    }
}
public class SingleLinkedlist
{
    public static void main(String[] args)
    {
        Linkedlist ll=new Linkedlist();
        ll.insertend(10);
        ll.insertend(20);
        ll.insertend(30);
        ll.insertend(40);
        
        ll.insertbeg(5);
        
        ll.insertat(2,15);
        
        ll.display();
    }
}