class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
class Root_methods{
    Node root;
    void insert(int data){
        root= insertData(root,data);
    }
    Node insertData(Node root,int data){
        if(root==null){
           return new Node(data);
        }
        if(root.left==null){
            root.left=insertData(root.left,data);
        }
        else{
            root.right=insertData(root.right,data);
        }
        return root;
     
    }
    void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public class B_Tree{
    public static void main(String args[]){
        Root_methods obj=new Root_methods();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.inorder(obj.root);
    }
}