public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public void linkNode(Node top) {
        this.next = top;
    }

    public Object getData() {
        return this.data;
    }

    public Node getNextNode() {
        return this.next;
    }

    public void printData() {
        System.out.println("Node Data: " + data);
    }

}
