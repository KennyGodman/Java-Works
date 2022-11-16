package dataStructure.queue;

public class Queue {

    private int lengthOfQueue;
    private String [] queue;
    private int count;

    public Queue( int lengthOfQueue){
        this.lengthOfQueue = lengthOfQueue;
        queue = new String[this.lengthOfQueue];
    }
    public boolean IsEmpty() {
        return true;
    }

    public int size() {
        return count;
    }

    public void setLengthOfQueue(int lengthOfQueue) {
        this.lengthOfQueue = lengthOfQueue;
    }

    public int getLengthOfQueue() {
        return lengthOfQueue;
    }

    public void push(String item) {
        queue[count] = item;
        count++;
    }

    public String pop(String item) {
        String popped = queue[0];
        queue[0] = null;
        count--;
        return popped;

    }
    public String peek(){
        return queue[0];
    }
    }


