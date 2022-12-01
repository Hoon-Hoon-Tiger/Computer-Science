package stack;

public class MyStack<T> implements IStack<T>{
    // node 기반으로 구현

    private int size;
    private Node head;

    public MyStack() {
        this.size = size();
        this.head = new Node( data: null);
    }

    @Override
    public void push(T data) {
        Node node = new Node(data, this.head.next);
        this.head.next = node;
        this.size++
    }

    @Override
    
    public T pop() {

        if (this.isEmpty()) {
            return null;
        }

        Node curr = this.head.next;
        // curr.next를 head.next로 바꾸어 주게 되면 head가 가리키는 방향이 curr.next로 바뀌게 된다. 
        this.head.next = curr.next;
        //curr.next가 가리키는 방향을 null값으로 바꾸어주게 되면서 curr node가 고립되게 된다.
        curr.next = null;
        this.size--;
        return curr.data;
    }
  
    @Override
    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.head.next.data;
    }

// pop과 peek이 이루어질 때 stack의 data가 없는 상황일 경우 연산이 정상적으로 진행되지 않기 때문에 고려해주어야된다.
    private boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public int size() {
        return this.size;
    }
    
    private class Node{
        T data;
        Node next;

        Node(T data) { this.data = data; }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
