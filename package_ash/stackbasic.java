package package_ash;
class stack{
    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    stack(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop elements from top of stack
    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        return arr[top];
    }
    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for(int i=0; i<=top;i++){
            System.out.print(arr[i] + ", ");
        }
    }


    public void display(){
        // for(int i:arr){
        //   System.out.print(i+" ");
        // }
        for(int i=0;i<=top ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class stackbasic {

        public static void main(String[] args) {
            stack s=new stack(7);
            s.push(4);
            s.push(8);
            s.push(1);
            System.out.println(s.pop());
            System.out.println(s.peek());
            // s.push(8);
            // s.push(2);
            // s.push(6);

            s.display();
        }
}
