package BinaryImageLinkedList;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

public class LinkedList {
    Node head ;

    public LinkedList(){
        this.head =null;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println(" ");
    }


}
