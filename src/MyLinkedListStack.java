import java.util.EmptyStackException;
public class MyLinkedListStack {
    private static MyLinkedList stack = new MyLinkedList(); //create an instance of LinkedList
    MyLinkedListStack(){} //constructor for Stack

    public static void push(Object o){  //adds new element to stack
        stack.add(o);
    }

    public static Object pop(){ //returns and deletes the front element of the stack
        Object element = stack.get(stack.size()); //create a buffer variable that will store last element
        stack.removeByIndex(stack.size()); //delete that element
        return element;
    }
    public static Object peek(){
        return stack.get(stack.size()-1);
    } //returns front element of stack

    public static boolean isEmpty(){ //returns true if stack is empty
        for(int i = 0; i< stack.size(); i++){
            if(stack.get(i)!=null) //check every element in the stack for null value
                return false;
        }
        return true;
    }
    public static int size(){
        return stack.size();
    } //returns number of elements in the stack

}
