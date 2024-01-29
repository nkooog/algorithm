public class StackArray<T> {

    int top = -1; // 시작 위치 (배열은 0부터 시작하므로 -1이면 비어있다고 가정하면됨)
    int capacity;
    int[] stackArr;

    StackArray() {
        this.stackArr = new int[10];
        this.capacity = 10;
    }

    public static void main(String[] args) throws Exception{

        // 배열을 이용해서 stack 구현
        StackArray m = new StackArray();

        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        m.push(5);
        m.push(6);

        m.clear();
        m.printStack();
    }

    // push(int value) : 데이터를 집어넣는 함수
    public void push(int value) {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException("stack is full");
        }
        stackArr[++top]=value;
    }

    // printStack() : 배열에 있는 모든 요소 출력
    public void printStack(){
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("arr is null");
        }
        for(int e : stackArr) {
            System.out.println(e);
        }
    }

    // clear() : 초기화
    public void clear() {
        this.top = -1;
        stackArr = new int[capacity];
    }

    // peek() : 가장 마지막에 넣은 데이터
    public int peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("arr is null");
        }
        return stackArr[top];
    }

    // size() : queue에 현재 들어가 있는 데이터의 개수를 return하는 함수
    public int getSize() {
        return stackArr.length;
    }

    // queuelsEmpty() : 큐 안이 비었는지 판단하는 함수
    public boolean isEmpty() {
        return (top == -1);
    }

    // queueIsFull() : 배열의 최대크기를 벗어나면 안되기에 큐에 더이상 들어갈 공간이 없는지 판단하는 함수
    public boolean isFull() {
        return (top >= (capacity - 1));
    }


    private void accept(int e) {
        System.out.println(stackArr[e]);
    }
}