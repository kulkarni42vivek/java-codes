package DSA.basics;

 class StackU{
    
    private class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    private Node top;
    private int height;

    StackU(int initialValue) {
        this.top = new Node(initialValue);
        this.height = 1;
    }

    void pushValue(int value) {
    	Node newNode = new Node(value);
    	newNode.value = value ;
    	newNode.next= top ;
    	top= newNode;
    }
    
}
public class StackImpl{
	public static void main(String[] args) {
		StackU st = new StackU(5);
		
	}
}

