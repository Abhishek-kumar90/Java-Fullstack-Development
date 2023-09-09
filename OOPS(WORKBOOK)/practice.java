public class practice {

    public static void main(String args[]){

        LinkedList l1 = new LinkedList();

        Node h1 = l1.create();

        l1.Travers(h1);
    }
}

class LinkedList{

    Node create(){

        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        n1.data = 101;
        n1.next = n2;

        n2.data = 202;
        n2.next  = n3;

        n3.data = 303;
        n3.next = n4;

        n4.data = 404;
        n4.next = n5;

        n5.data = 505;
        n5.next = null;

        return n1;


    }

    void Travers(Node head){
        while(head != null){
            System.out.println(head.data+" ");
            head = head.next;
        }

    }
}

class Node{
    int data;
    Node next;
}






