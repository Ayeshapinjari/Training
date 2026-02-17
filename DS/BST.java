class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
    }
}
class Methods{
    Node root;
    void insert(int data){
        root=insertdata(root,data);
    }
    Node insertdata(Node root,int data){
        if(root==null){ 
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertdata(root.left,data);
        }
        else if(data>root.data){
            root.right=insertdata(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root==null){ // if return encounter recentenly visited node i.e top function in call stack
            return;
        }
        inorder(root.left);// first all elements of lest are stored
        System.out.print(root.data+" ");// then printed
        inorder(root.right);// then right is stored
    }
    void preorder(Node root) {
    if (root == null)
        return;

    System.out.print(root.data + " "); // 1️⃣ ROOT
    preorder(root.left);               // 2️⃣ LEFT
    preorder(root.right);              // 3️⃣ RIGHT
}
void postorder(Node root) {
    if (root == null)
        return;

    postorder(root.left);              // 1️⃣ LEFT
    postorder(root.right);             // 2️⃣ RIGHT
    System.out.print(root.data + " "); // 3️⃣ ROOT
}

}
public class BST {
    public static void main(String args[]){
        Methods obj=new Methods();
        obj.insert(30);
        obj.insert(10);
        obj.insert(15);
        obj.insert(5);
        obj.insert(35);
        obj.insert(40);
        obj.inorder(obj.root);
        System.out.println("");
        obj.preorder(obj.root);
         System.out.println("");
        obj.postorder(obj.root);

    }
}
