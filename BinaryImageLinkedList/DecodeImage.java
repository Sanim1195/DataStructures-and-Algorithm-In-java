package BinaryImageLinkedList;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */




public class DecodeImage {
    Node head;
     int firstInput = 0;

    public DecodeImage(){
        this.head = null;
    }

    public void  display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }


    public void push( int input){

        int size = 28;

        int counter = 0;

        while(counter != input){
            Node newNode = new Node(firstInput);
            newNode.next = head;
            head = newNode;
            counter++;
        }

        if (firstInput == 0){
            firstInput = 1;
        }else{
            firstInput = 0;
        }
    }

// Function to search elements by index
    void searchElementByIndex(int index){
        Node temp = head;
        int counter = 0;

        while(counter != index){
            counter++;
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

//     Function that inserts an element at a given index

    void insertAtIndex(int index, int data){

        Node temp = head;
        int counter = 0;

        //To insert at an index we go to index-1 position
        while(counter != index -1){
            counter++;
            temp = temp.next;
        }

        //Creating a new node with the value
        Node newNode = new Node(data);
        //new node's next pointer points to temp node's next
        newNode.next = temp.next;
        temp.next = newNode;

    }

//    Delete an element from the index
void deleteAtIndex(int index){
    Node temp = head;
    int counter = 0;

    if (index == 0){
        head = head.next;
    }
    if( temp.next == null || temp == null){
        return;
    }
    while(counter != index-1){
        counter++;
        temp = temp.next;
    }

    Node after = temp.next.next;
    temp.next = after;
}













}
