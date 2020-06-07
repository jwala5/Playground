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
                new_node.next=head;
			head = new_node;
            }
     }
     public void print_node()
     {
     Node temp = head;
     while(temp!=null){
     	System.out.print(temp.data+" ");
        temp= temp.next;
        }
     }
     		
     public static void main(String[] args)
     {
       
     Main l = new Main();
     Scanner sc = new Scanner(System.in);

     for(int n=1;;n++)
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