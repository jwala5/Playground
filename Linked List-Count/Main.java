

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
     Node temp = head;
     int count=0;
     while(temp!=null){
     	System.out.print(temp.data+" ");
        count++;
        temp= temp.next;
        }
         System.out.println();
        System.out.println("The number of students who are present is "+ count+".");
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
   System.out.println("The students who are present in the class are");
  
     l.print_node();
     }
}