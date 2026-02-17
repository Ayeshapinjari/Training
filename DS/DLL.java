class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
class DLLmethods{
    Node head;
    void insertAtEnd(int data){
        Node nn=new Node(data);
        if(head==null){
        head=nn;
        return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;
        
    }
    void insertAtBegin(int data){
        Node temp=head;
        
    }
     void print(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    void reverse(){
        Node temp=head;
        while(temp.next!=null){// if u want last node we use temp.next
            temp=temp.next;
        }
        while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.prev;
        }
    }
}



public class DLL {
    public static void main(String args[]){
    DLLmethods obj =new DLLmethods();
    obj.insertAtEnd(10);
    obj.insertAtEnd(20);
    obj.insertAtEnd(30);
    obj.insertAtEnd(40);
    obj.print();
    obj.reverse();
    }
}
