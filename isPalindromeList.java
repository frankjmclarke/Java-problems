import java.util.*;

public class Exercise {
    static class Node{
    int data;
        Node next;
        Node(int data){this.data = data; this.next = null;}
        Node(int data, Node next){this.data = data; this.next = next;}
    }
  
    static class LinkedList{
        Node head;
        LinkedList(){this.head = null;}
        LinkedList(Node head){this.head = head;}
    }
    
  public static Node reverse(Node head) {
    Node previous=null;
    Node current = head;
    while (current!=null){
      Node next = current.next;//1
      current.next=previous;//null  
      previous=current;
      current = next;
    }
    return previous;
  }
  
  
  
  public static boolean isPalindromeList(LinkedList list){
    Node hare = list.head;
    Node tort = list.head;
 
    while (hare != null && hare.next != null) {
      hare = hare.next;
      hare = hare.next;
      tort = tort.next;
    }
    
    Node slow = reverse(tort);
    
    boolean success = true;
    
    Node head=list.head;
    while(slow!=null) {
      if (slow.data != head.data) {
        success = false;
        break;
      }
      slow=slow.next;
      head=head.next;       
    }
      
    return success;

  }
}