import java.util.EmptyStackException;
public class MyArrayListStack {

    private static MyArrayList stack = new MyArrayList(); //create an instance of ArrayList
    MyArrayListStack(){} //constructor for Stack

    public static void push(Object o){
        stack.add(o);
        } //adds new element to stack

    public static Object pop(){ //returns and deletes the front element of the stack
        Object element = stack.get(stack.size()-1); //create a buffer variable that will store last element
        stack.removeByIndex(stack.size()-1); //delete that element
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
