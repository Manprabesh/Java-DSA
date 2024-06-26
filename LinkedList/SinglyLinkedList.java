// package Java-DSA.LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}



public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;
    public void insertFirst(int value){//Inserting the element at the beginning of the Node
        // Node temp=head;
        head=new Node(value,head);//Either these way or
        System.out.println(head);



       // Node node=new Node(value);
        // node.next=head;
        // head=node;

        size++;

        if(tail==null){
            tail=head;
        }
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtAnyElem(int index, int value){
        Node temp=head;

        for(int i=1; i<index;i++){
            temp=temp.next;
        }
        System.out.println();

        // System.out.println(head);

        // Node node =new Node(value,temp.next);
        // temp.next=node; I
        //It can be done either these way or


        Node node =new Node(value);
        Node ref=temp.next;
        temp.next=node;
        node.next=ref;
        //Either these way


    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->  ");
            temp=temp.next;
        }
    System.out.print("End:  "+"And the size is: "+size);
    }

    public void DeleteFirst(){
        int val=head.data;
        // System.out.println(val+"#################");
        head=head.next;
        if(head==tail){
            tail=null;
        }

        size--;
        // return val;

    }

    public int DeleteLast(){
        if(size<=1){
            return DeleteLast();
        }

        Node Secondlast=get(size-1);
        int val=tail.data;
        tail=Secondlast;
        tail.next=null;
        return val;
    }

    public Node get(int index){

        Node node=head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        size--;
        return node;
    }

    public int DeleteAnyElem(int index){
        if(index==0){
            DeleteFirst();
        }
        if(index==size-1){
            return DeleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.data;
        prev.next=prev.next.next;
        return val;

    }

    public Node find(int value){
        Node node=head;

        while(node!=null){
            if(node.data==value){
                return node;
            }
            node=node.next;
        }
        return node;
    }
    public static void main(String[] args) {
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertFirst(3);
        sl.insertFirst(2);
        sl.insertFirst(1);
        sl.insertFirst(0);

        sl.insertLast(4);
        sl.insertLast(5);
        // sl.insertLast(6);
        // sl.insertLast(7);

        // sl.insertAtAnyElem(4, 44);


        sl.display();

        System.out.println("+++++++++");
        //  sl.DeleteFirst();

        sl.display();

        System.out.println();
        System.out.println(sl.DeleteLast());
        sl.display();

        System.out.println(sl.DeleteAnyElem(1));
        sl.display();
        System.out.println();
        System.out.println(sl.find(34));
    }
}
