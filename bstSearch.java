public class bstSearch {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean search(Node root,int key){
        if(root==null)
        return false;
        if(root.data ==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else 
        return search(root.right, key); 
    }
    public static Node insert(Node root, int val){
        if(root == null){
        root=new Node(val);
        return root;
    }
    if(root.data>val){
        //left subtree
        root.left=insert(root.left,val);
    }
    else{
        //right subtree
        root.right=insert(root.right,val);
    }
    return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        if(search(root,5)){
            System.out.print("found");
        }
        else
        System.out.println("not found");
        
    }
}
