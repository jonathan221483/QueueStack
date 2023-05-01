import java.util.EmptyStackException;
public class MyArrayListStack {

    private static MyArrayList stack = new MyArrayList();
    MyArrayListStack(){}

    public static void push(Object o){
        stack.add(o);
    }

    public static Object pop(){
        Object element = stack.get(stack.size());
        stack.removeByIndex(stack.size());
        return element;
    }
}
