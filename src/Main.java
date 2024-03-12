import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
//    public class Stack {
//        private int top;
//        private int[] arr;
//
//        public Stack(int capacity) {
//            top = -1;
//            arr = new int[capacity];
//        }
//
//        public Stack() {
//            this(10);
//        }
//
//        public void push(int data){
//            if(isFull()){
//                throw new RuntimeException("Stack is full");
//            }
//            top++;
//            arr[top] = data;
//        }
//        public boolean isFull(){
//            return arr.length == size();
//        }
//        public int size(){
//            return top+1;
//        }
//
//        public int pop(){
//            if (isEmpty()){
//                throw new RuntimeException("Stack is empty");
//            }
//            int result = arr[top];
//            top--;
//            return result;
//        }
//        public boolean isEmpty(){
//            return top < 0;
//        }
//
//        public int peek(){
//            if (isEmpty()){
//                throw new RuntimeException("Stack is empty");
//            }
//            return arr[top];
//        }
//    }

    public String reverseString(String s){
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c : chars){
            stack.push(c);
        }
        for (int i=0; i<s.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    int [] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=arr.length-1; i>=0; i--){
            if (!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                result[i] =-1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }


//    private ListNode top;
//    private int length;
//
//    private class ListNode{
//        private int data;
//        private ListNode next;
//
//        public ListNode(int data){
//            this.data = data;
//        }
//    }
//
//    public void Stack(){
//        top = null;
//        length =0;
//
//    }
//
//    public int length(){
//        return length;
//    }
//    public boolean isEmpty(){
//        return length ==0;
//    }
//
//    public void push(int data){
//        ListNode temp = new ListNode(data);
//        temp.next = top;
//        top = temp;
//        length++;
//    }
//
//    public int pop(){
//        if (isEmpty()){
//            throw  new EmptyStackException();
//        }
//        int result = top.data;
//        top = top.next;
//        return result;
//    }
//
//    public int peek(){
//        if (isEmpty()){
//            throw  new EmptyStackException();
//        }
//        return top.data;
//    }

    public static void main(String[] args) {

//        Main stack = new Main();
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//
//        stack.pop();
//        System.out.println(stack.peek());
//            Main main = new Main();
//            Main.Stack stack = main.new Stack(5);
//            stack.push(5);
//            stack.push(10);
//            stack.push(15);
//
//            System.out.println(stack.peek());
        Main sll = new Main();

        //System.out.println(sll.reverseString("babhs"));
        int[] bab = {4,7,3,4,8,1};
        bab = sll.nextGreaterElement(bab);
        for (int n : bab){
            System.out.println(n);
        }

    }
}