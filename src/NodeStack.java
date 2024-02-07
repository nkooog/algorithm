public class NodeStack {

    private Node top;

    public NodeStack() {
        top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(Object item) {
        Node node = new Node(item);
        node.linkNode(top);
        top = node;
    }

    public Object peek() {
        return top.getData();
    }

    public Object pop() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException(" node is null");
        }else{
            Object item = peek();
            top = top.getNextNode();
            return top;
        }
    }

    // 새로운 메소드 추가
    public void printStack() {
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            current.printData();
            current = current.getNextNode();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NodeStack node = new NodeStack();
        node.push("첫번째");
        node.push("두번째");
        node.push("세번째");

//        node.pop();

        node.printStack();

    }

}
