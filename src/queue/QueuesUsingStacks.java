package queue;

import stack.GenericStack;

public class QueuesUsingStacks {
    private Node top;

    private GenericStack<Integer> stack1;
    private GenericStack<Integer> stack2;

    private class Node{
        Integer value;
       Node next;
        Node(Integer value){
            this.value = value;
        }
    }

    public QueuesUsingStacks(){
        stack1 = new GenericStack<>(1);
        stack2 = new GenericStack<>(2);
    }

    // TODO write this method using the 2 stacks provided above only
    public void enqueue(int value) {
        // Move everything from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push the new value onto stack1
        stack1.push(value);

        // Move everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // TODO Write this method using the 2 stacks provided above only
    public Integer dequeue() {
        if (stack1.isEmpty()) {
            return null;
        }
        return stack1.pop();
    }

    public String peek(){
        return top.value.toString();
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
