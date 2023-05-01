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
    public static Object peek(){
        return stack.get(stack.size());
    }

    public static boolean isEmpty(){
        for(int i = 0; i< stack.size(); i++){
            if(stack.get(i)!=null)
                return false;
        }
        return true;
    }

}
