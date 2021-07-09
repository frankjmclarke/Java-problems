static boolean detectLoop(Node h){//set
	HashSet<Node> s = new HashSet<Node>();
	while (h != null) {
		if (s.contains(h))
			return true;
		s.add(h);
		h = h.next;
	}
	return false;
}
static boolean detectLoop(Node h){//sentinel
    while (h != null) {
        if (h.flag == 1)
            return true;
        h.flag = 1;
        h = h.next;
    }
    return false;
}

void detectLoop(){
	Node slow_p = head, fast_p = head;
	int flag = 0;
	while (slow_p != null && fast_p != null
		   && fast_p.next != null) {
		slow_p = slow_p.next;
		fast_p = fast_p.next.next;
		if (slow_p == fast_p) {
			flag = 1;//removeLoop(slow, node);return 1;
			break;
		}
	}
	if (flag == 1)System.out.println("Loop found");
	else System.out.println("Loop not found");
}
void removeLoop(Node loop, Node curr){
	Node ptr1 = null, ptr2 = null;
	while (1 == 1) {
		ptr2 = loop;
		while (ptr2.next != loop && ptr2.next != ptr1)
			ptr2 = ptr2.next;
		if (ptr2.next == ptr1) {
			break;
		ptr1 = ptr1.next;
	}
	ptr2.next = null;
}





LIST-DETECT-LOOP























LIST-DETECT-LOOP