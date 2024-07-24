import com.sun.source.tree.BreakTree;

public class Stack {
    LinkedList stack = new LinkedList();


    public void push(int data){
        stack.addToHead(data);
    }
    public void pop(){
        if (stack.head != null){
        System.out.println(stack.head.data+" is popped");
        stack.deleteByIndex(1);}
        else System.out.println("Can't pop from empty Stack...");
    }
    public void peek(){
        if (stack.head != null)
            System.out.println("->"+stack.head.data);
        else System.out.println("Empty Stack...");
    }

    public void addToBottom(int data){
        if (this.stack.head == null){
            push(data);
            return;
        }
        int data1 = stack.head.data;
        pop();
        addToBottom(data);
        push(data1);
    }
    public void reverse(){
        if (this.stack.head == null){
            return;
        }
        int data1 = stack.head.data;
        pop();
        reverse();
        addToBottom(data1);
    }
}
