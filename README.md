# Algorithms and Data Structures | Khaimuldin Nursultan
## Assignment 3 | Stack and Queue implementation
### Methods needed to be implemented:

## Stack

  push(Object o) - adds an element to the top of the stack

  pop() - removes and returns the top element of the stack

  peek() - returns the top element of the stack

  isEmpty() - returns true if the stack is empty or false if it is not

  size() - returns the number of elements in the stack
  
```
    public static void push(Object o){  //adds new element to stack
        stack.add(o);
    } 
    public static Object pop(){  //returns and deletes the front element of the stack
        Object element = stack.get(stack.size()-1); //create a buffer variable that will store last element
        stack.removeByIndex(stack.size()-1); //delete that element
        return element;
    }
    public static Object peek(){  //returns front element of stack
        return stack.get(stack.size()-1);
    } 
    public static boolean isEmpty(){  //returns true if stack is empty
        for(int i = 0; i< stack.size(); i++){
            if(stack.get(i)!=null) //check every element in the stack for null value
                return false;
        }
        return true;
    }

    public static int size(){  //returns number of elements in the stack
        return stack.size();
    } 
```



## Queue

  enqueue(Object o) - adds an element to the back of the queue

  dequeue() - removes and returns the front element of the queue 

  peek() - returns the front element of the queue without removing it

  isEmpty() - returns true if the queue is empty or false if it is not

  size() - returns the number of elements in the queue


```
    public static void enqueue(Object o){ //adds new element to the beginning of queue
        queue.add(o);
    }
    public static Object dequeue(){ //returns and deletes the front element of the queue
        Object element = queue.get(0); //create a buffer variable that will store front element
        queue.removeByIndex(0); //delete front element
        return element;
    }
    public static Object peek(){  //returns front element of queue
        return queue.get(0);
    } 
    public static boolean isEmpty(){ //returns true if stack is empty
        for(int i = 0; i< queue.size(); i++){
            if(queue.get(i)!=null) //check every element in the stack for null value
                return false;
        }
        return true;
    }
    public static int size(){  //returns number of elements in the stack
        return queue.size();
    } 
```
