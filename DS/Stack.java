class S{
    int[] stack;
    int top;
    int size;
    S(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    void push(int data){
        if(top==size){
            System.out.println("stack is full");
            return;
        }
        stack[++top]=data;
    }
    void print(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
    int pop(){
        return stack[top--];
    }
    void peek(){
        System.out.println("peek element "+stack[top]);
    }
}

public class Stack {
    public static void main(String args[]){
    S obj=new S(5);
    obj.push(1);
        obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.push(5);
    int v=obj.pop();
    System.out.println(v+" : deleted element");
    obj.print();
    obj.peek();
    }
}
