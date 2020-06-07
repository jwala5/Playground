import java.util.*;
class Main{
	Node head;
	class Node{
    	int data;
        Node next;
        
        Node(int x)
        {
        data=x;
        next= null;
        }
     }
     public void insert_at_node(int x)
     {
     	Node new_node = new Node(x);
        Node temp = head;
        	
            if(head== null)
            {
            	head = new_node;
            }
            else
            {
            	while(temp.next!=null)
                {
                temp=temp.next;
                }
                temp.next=new_node;
            }
     }
     public void print_node()
     {
     System.out.println("The students marks are:");
     Node temp = head;
     int n=0;
     while(temp!=null){
     	if(temp.data>n)
        {
        n= temp.data;
        }
     	System.out.print(temp.data+" ");
        temp= temp.next;
        }
        System.out.println();
        System.out.print("The maximum mark is "+n +".");
     }
     		
     public static void main(String[] args)
     {
       
     Main l = new Main();
     Scanner sc = new Scanner(System.in);

     for(int n=1;n<=100;n++)
     {
     	n= sc.nextInt();
       if(n==-1)
       {
         break;
       }
      	l.insert_at_node(n);
     }
   
     l.print_node();
     }
}