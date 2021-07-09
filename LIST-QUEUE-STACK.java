static class Queue{ //via stack
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();
 
    static void enQueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty())
            s2.push(s1.pop());
        // Push item into s1
        s1.push(x);
 
        // Push everything back to s1
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }
 
    static int deQueue(){     
        if (s1.isEmpty()){// if first stack is empty
            System.out.println("Q is Empty");
            System.exit(0);
        }
        int x = s1.peek();        // Return top of s1
        s1.pop();
        return x;
    }
};


























LIST-QUEUE-STACK