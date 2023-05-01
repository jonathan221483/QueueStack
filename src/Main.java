public class Main {
    public static void main(String[] args) {

        /*MyLinkedListStack a = new MyLinkedListStack();
        a.push(3);
        a.push(6);
        a.push(9);
        System.out.println(a.peek());
        System.out.println(a.pop());
        System.out.println(a.isEmpty());*/

        /*MyLinkedListQueue b = new MyLinkedListQueue();
        b.enqueue(2);
        b.enqueue(7);
        System.out.println(b.dequeue());
        System.out.println(b.dequeue());
        System.out.println(b.isEmpty());*/

        /*MyArrayListQueue c = new MyArrayListQueue();
        c.enqueue(2);
        c.enqueue(7);
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.isEmpty());*/

        MyArrayListStack a = new MyArrayListStack();
        a.push(3);
        a.push(6);
        a.push(9);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.isEmpty());
    }
}