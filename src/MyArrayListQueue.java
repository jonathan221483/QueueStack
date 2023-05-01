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
    public static Object peek(Object o){
        return queue.get(0);
    }
}
