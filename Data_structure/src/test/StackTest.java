package test;

import static org.junit.Assert.assertArrayEquals;

import stack.MyStack;

public class StackTest {

    public void basic() {
        IStack<Integer> given = new MyStack<>();
        for (int i = 0; i < 50; i++) {
            given.push(i);
            assertArrayEquals(given.peek(), i);
            assertArrayEquals(given.size(), i+1);
        }
        for (int i = 49; i > -1; i--) {
            assertArrayEquals(given.pop(), i);
            assertArrayEquals(given.size(), i);
        }
    }
    System.out.println(Arrays.toString(given))
}
