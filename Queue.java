package RottenOranges;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

public class Queue {

        int arr[];
        int front, rear, size, capacity;

        public Queue(int capacity) {
            this.capacity = capacity;
            this.rear = capacity - 1;
            this.front = 0;
            this.size = 0;
            arr = new int[capacity];
        }

        //    Checking if queue is full or not
        public boolean isFull(Queue queue) {
            return (queue.size == queue.capacity);
        }

        public boolean isEmpty(Queue queue) {
            return (queue.size == 0);
        }

        public void enqueue(int x) {

            if (isFull(this)) {
                return;
            } else {
                this.rear = (this.rear + 1) % capacity;
                this.arr[this.rear] = x;
                size++;

            }

        }

        public void dequeue() {
//        returns if queue is empty
            if (isEmpty(this)) return;
//        Pointing to the next index. the formula below makes it a circular array or queue
            this.front = (this.front + 1) % capacity;
            size--;
        }

        public int front() {
            return this.arr[this.front];


        }
        public void getSize(){
            System.out.println(size);
        }

    }

// Language: java

