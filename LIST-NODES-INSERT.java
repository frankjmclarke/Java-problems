static class Node {
	public int data;
	public Node nextNode;
	public Node(int data) {
		this.data = data;

	}
}

static Node createNode(int data) {
	return new Node(data);
}

static void PrintList(Node node) {
	while (node != null) {
		System.out.print(node.data);
		node = node.nextNode;
		if (node != null)
			System.out.print(",");
	}
	System.out.println();
}

static Node InsertPos(Node headNode, int position, int data) {
	Node head = headNode;
	if (position < 1)
		System.out.print("Invalid position");
	if (position == 1) {
		Node newNode = new Node(data);
		newNode.nextNode = headNode;
		head = newNode;
	} else {
		while (position-- != 0) {
			if (position == 1) { // adding Node at required position
				Node newNode = GetNode(data);
				newNode.nextNode = headNode.nextNode;
				headNode.nextNode = newNode;
				break;
			}
			headNode = headNode.nextNode;
		}
		if (position != 1)
			System.out.print("Position out of range");
	}
	return head;
}






LIST-NODES-INSERT		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	LIST-LINKED