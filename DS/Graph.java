class Node{
    int size;
    int arr[][];
    Node(int size){
        this.size=size;
        arr=new int[size][size];
    }
    void addedge(int i,int j){
        arr[i][j]=1;
        arr[j][i]=1;   
    }
    void dfs(int start){
        boolean visited[]=new boolean[size];
        dfs_traversal(start, visited);
    }
    void dfs_traversal(int start,boolean visited[]){
        visited[start]=true;
        System.out.print(start+" ");
        for(int i=0;i<size;i++){
            if(arr[start][i]==1 && !visited[i]){
                dfs_traversal(i,visited);
            }
        }
    }
    void bfs(int start){
        int q[]=new int[size];
        boolean v[]=new boolean[size];
        int front=0,rear=0;
        v[start]=true;
        q[rear++]=start;
        while(front<rear){
            int n=q[front++];
            System.out.print(n+" ");
            for(int i=0;i<size;i++){
                if(arr[n][i]==1 && !v[i]){
                    v[i]=true;
                    q[rear++]=i;
                }
            }
        }
    }
}
public class Graph {
    public static void main(String[] args) {
        Node obj=new Node(4);
        obj.addedge(0,1);
        obj.addedge(0,2);
        obj.addedge(1,3);
        obj.addedge(2,3);
        obj.dfs(0);
        obj.bfs(0);

    }
}
