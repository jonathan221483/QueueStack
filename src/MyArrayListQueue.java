import java.util.NoSuchElementException;
public class MyArrayListQueue {
    private static MyArrayList queue = new MyArrayList();
    MyArrayListQueue(){}

    public static void enqueue(Object o){
        queue.add(o);
    }
    public static Object dequeue(Object o){
        Object element = queue.get(0);
        queue.removeByIndex(0);
        return element;
    }
    public static Object peek(){
        return queue.get(0);
    }
    public static boolean isEmpty(){
        for(int i = 0; i< queue.size(); i++){
            if(queue.get(i)!=null)
                return false;
        }
        return true;
    }
    public static int size(){
        return queue.size();
    }
}
