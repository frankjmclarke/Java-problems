import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		
		LinkedList prev = linkedList;
		LinkedList current = linkedList;
    while (current != null)  {	
			current = current.next;			
			if((current != null) && (prev.value == current.value)) {
				prev.next = current.next;
				System.out.println("removed "+current.value);
			} else
					prev = current;
		} 

    return linkedList;
  }
}
