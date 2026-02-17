class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class CLLmethods{
    Node head;
    void insertAtBegin(int data){
        Node nn=new Node(data);
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        nn.next=head;
        temp.next=nn;
        head=nn;
    }
    void insertAtPos(int data,int pos){
        Node nn=new Node(data);
        if(pos==1){
            insertAtBegin(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){// 1<5  2<5 3<5 4<5 5<5
            if(temp==head){
                System.out.println("invalid position");
                return;
            }
            temp=temp.next;// 10 20 30 40
        }
        if(temp==head){// 40 
            System.out.println("invalid position");
            return;
        }
        nn.next=temp.next;// 50 => head
        temp.next=nn;// 40 
        //System.out.println(temp.next);
        
    }
    void insertAtEnd(int data){
        Node nn=new Node(data);
        if(head==null){// first node
            head=nn;
            nn.next=head;// in CLL last node must connect to head
        }
        Node temp=head;
        while(temp.next!=head){// search for last node and last node must contain addr of head in cll
            temp=temp.next;
        }
        temp.next=nn;// assign last node next as newnode
        nn.next=head; // assign the last link to head to form cll
    }
    void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=head){// 5 10 20 30 
            temp=temp.next;
        }
        temp.next=head;
    }
    void deleteAtBegin(){
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }
    void deleteAtPos(int pos){
        Node temp=head;
        if(pos==1){
            deleteAtBegin();
            return;
        }
        for(int i=1;i<pos-1;i++){
            if(temp==head){
                System.out.println("invalid position");
                return;
            }
            temp=temp.next;
        }
        if(temp==head){
                System.out.println("invalid position");
                return;
            }
        temp.next=temp.next.next;
    }
    void print(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);

    }
}


public class CLL {
    public static void main(String args[]){
    CLLmethods obj=new CLLmethods();
    obj.insertAtEnd(10);
      obj.insertAtEnd(20);
        obj.insertAtEnd(30);
          obj.insertAtEnd(40);
          //obj.insertAtPos(50,6);
        obj.deleteAtPos(5);
          obj.print();
}
}
