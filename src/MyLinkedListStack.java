public class MyLinkedListStack {
    static MyLinkedList stack = new MyLinkedList();
    MyLinkedListStack(){}

    public static void push(Object o){
        stack.add(o);
    }

    public static Object pop(){
        Object element = stack.get(stack.size()-1);
        stack.removeByIndex(stack.size()-1);
        return element;
    }
    public static Object peek(){
        return stack.get(stack.size()-1);
    }

    public static boolean isEmpty(){
        for(int i = 0; i< stack.size(); i++){
            if(stack.get(i)!=null)
                return false;
        }
        return true;
    }
    public static int size(){
        return stack.size();
    }

}
