import java.util.NoSuchElementException;
public class MyLinkedListQueue {

    private static MyArrayList queue = new MyArrayList();  //create an instance of LinkedList
    MyLinkedListQueue(){}  //constructor for Queue
    public static void enqueue(Object o){ //adds new element to the beginning of queue
        queue.add(o);
    }
    public static Object dequeue(Object o){ //returns and deletes the front element of the queue
        Object element = queue.get(0); //create a buffer variable that will store front element
        queue.removeByIndex(0); //delete front element
        return element;
    }
    public static Object peek(){
        return queue.get(0);
    } //returns front element of queue
    public static boolean isEmpty(){ //returns true if stack is empty
        for(int i = 0; i< queue.size(); i++){
            if(queue.get(i)!=null) //check every element in the stack for null value
                return false;
        }
        return true;
    }
    public static int size(){
        return queue.size();
    } //returns number of elements in the stack
}
