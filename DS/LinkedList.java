 class Node1{
    int data;// data
    Node1 next1;// addr of next1 node
    Node1(int data){
        this.data=data;
        next1=null;
    }
 }
 class LLmethods{
    Node1 head;//first node of ll
    void insert(int data ){ //insert data //O(1)
        Node1 newnode=new Node1(data);//new node store reference(address) of data 
        // IF DATA AND NEXT ARE STORED IN HEAP WITH ADDRESS 2000 
        // THEN NEWNODE HAS ONLY REFERENCE I.E; 2000  
        if(head==null){
            head=newnode; //HEAD => 10 | NULL , HEAD ALSO STORE REFERENCE OF NEWNODE I.E, 2000
        }
        else {
        Node1 temp=head;
        while(temp.next1!=null)// search for last node to add new node
            {
            temp=temp.next1;
        }
        temp.next1=newnode ;// in next1 part of head we store new node;    
    }
    }
    void print(){  //O(n)
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next1;
        }
        System.out.print("NULL");
    }
    void insertatbegin(int data){ //O(1)
        Node1 newnode=new Node1(data);
        newnode.next1=head;// 
        head=newnode; 
    }
    void insertatpos(int data,int pos){ //O(n)
        Node1 newnode=new Node1(data);
        Node1 temp=head;
        if(pos==1){
            insertatbegin(data);
            return;
        }
        for(int i=1;i<pos-1 && temp!=null;i++){// moves upto before position 4-1 
            
            temp=temp.next1; // store 3rd element
        }
        if(temp==null){
                System.out.println("invalid position");// if it exceeds the node length
                return;
            }
        
       // Node prev=temp;
        //Node nex=temp.next1;
        newnode.next1=temp.next1;// new node address part has 4th element address
        temp.next1=newnode;// 3rd element address has new node address
    }
    
    void deleteAtEnd(){ //O(n)
        Node1 temp=head;
        while(temp.next1.next1!=null){
            temp=temp.next1;
        }
        temp.next1=null;

    }
    void deleteAtBegin(){ //O(1)
        //Node temp=head;
        head=head.next1;
        //temp=null;
    }
    void deleteAtPos(int pos){//7 //O(n)
        Node1 temp=head;
        if(pos==1){
            deleteAtBegin();
            return;
        }//6<6
        for(int i=1;i<pos-1 && temp!=null ;i++){ //5 10 20 25 30 40
            temp=temp.next1;//6000(40)
        }
        if(temp==null || temp.next1==null){
           System.out.println("invalid position");// if it exceeds the node length
                return; 
        }
        temp.next1=temp.next1.next1;
    }
    int search(int x){ //O(n)
        Node1 temp=head;
        int i=0;
        while(temp!=null){
            i++;
       if(temp.data==x) {
        return i;
       }
       temp=temp.next1;
    
       }
       return -1;
    }

 }
 class LinkedList{
    public static void main(String args[]){
        LLmethods obj=new LLmethods();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.print();
        System.out.println("");
        obj.insertatbegin(5);
        obj.insertatpos(25, 4);
        obj.print();
        // System.out.println("");
        // obj.deleteAtEnd();
        // obj.print();
        // obj.deleteAtBegin();
        // System.out.println("");
        // obj.print();
        obj.deleteAtPos(7);
        // System.out.println("");
        obj.print();
        // System.out.println("");
        // obj.deleteAtPos(5);
        // int k=obj.search(40);
        // System.out.println(k);
        // obj.print();
        // //   obj.deleteAtPos(4);
        //   obj.print();


    }
 }