package Q;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

public class Queue {
    int arr[];
    int front, rear, size, capacity;

    public Queue(int capacity){
        this.capacity = capacity;
        this.rear = capacity-1;
        this.front = 0;
        this.size = 0;
        arr = new int[capacity];
    }

    //    Checking if queue is full or not
    public boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    public boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    public void enqueue(int x){

        if (isFull(this)) {
            return;
        }else {
            this.rear = (this.rear+1)% capacity;
            this.arr[this.rear] = x;
            size++;

        }

    }

    public void dequeue(){
//        returns if queue is empty
        if(isEmpty(this)) return;
//        Pointing to the next index. the formula below makes it a circular array or queue
        this.front = (this.front + 1) % capacity;
        size--;
    }

    public void front(){
        System.out.println(arr[front]);
    }


    public void dispaly(){
        for (int point = front ; point <= rear ; point++) {
            System.out.println(arr[point]);
        }
    }


    public static void main(String[] args) {

        Queue q = new Queue(3);
        System.out.println(q.isFull(q));
        System.out.println(q.isEmpty(q));
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.front();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty(q));
        q.enqueue(55);
        q.front();
        q.dispaly();
    }






}
