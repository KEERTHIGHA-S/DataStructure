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
    public void insert(int data)
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
    
    public void deletionend()
    {
        Node temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
           
        }
        temp.next=null;
        tail=temp;
    }
    
    public void deletionbeg()
    {
        //Node temp=head;
        head=head.next;
        //temp.next=null;
        
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
    
    public void deletionat(int pos)
    {
        Node temp=head;
        for (int i=0; i<pos-1; i++)
        {
            temp=temp.next;
        }
        head.next=temp.next.next;
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
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        
        
        
        ll.insertat(1,15);
        
       
        
        ll.display();
        
        System.out.println("After deletion at begining");
        
        ll.deletionbeg();
        ll.display();
        System.out.println("After deletion at specific position");
        ll.deletionat(1);
        ll.display();
        System.out.println("After deletion at end");
        ll.deletionend();
        
        ll.display();
    }
}