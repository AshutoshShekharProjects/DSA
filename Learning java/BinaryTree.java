import com.sun.source.tree.Tree;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTreeOps{
        int id=-1;
        public Node buildTree(int[] nodes){
            id++;
            if(nodes[id]==-1){
                return null;
            }
            Node newNode = new Node(nodes[id]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public void preorder(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if(root==null){
                //System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public void postorder(Node root){
            if(root==null){
                //System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
        public void sumKthLevel(Node root, int k){
            int sum=0;
            int c=1;
            if(root==null){
                return;
            }
            if(k>height(root)){
                System.out.println("Level exceeds height");
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty() && c<=k){
                Node curr=q.remove();
                if(curr==null){
                    c++;
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(c==k){
                        sum += curr.data;
                    }
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
            System.out.println(sum);
        }
        public int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public int countOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftCount=countOfNodes(root.left);
            int rightCount=countOfNodes(root.right);
            return leftCount+rightCount+1;
        }
        public int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sumOfNodes(root.left);
            int rightSum=sumOfNodes(root.right);
            return leftSum+rightSum+ root.data;
        }
        public int diameter(Node root){
            if(root==null){
                return 0;
            }
            int d1=diameter(root.left);
            int d2=diameter(root.right);
            int d3=height(root.left)+height(root.right)+1;
            return Math.max(d3,Math.max(d1,d2));
        }
        public class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht,int diam){
                this.ht=ht;
                this.diam=diam;
            }
        }
        public TreeInfo diameter2(Node root){
            if(root==null){
                return new TreeInfo(0,0);
            }
            TreeInfo left=diameter2(root.left);
            TreeInfo right=diameter2(root.right);

            int myHeight=Math.max(left.ht, right.ht)+1;

            int diam1= left.diam;
            int diam2= right.diam;
            int diam3= left.ht+ right.ht+1;

            int myDiam=Math.max(diam3,Math.max(diam1,diam2));

            TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
            return myInfo;
        }
        public boolean isIdentical(Node root, Node subRoot){
            if(root==null && subRoot==null){
                return true;
            }
            if(root==null || subRoot==null){
                return false;
            }
            if(root.data==subRoot.data){
                return isIdentical(root.left,subRoot.left) && isIdentical(root.left,subRoot.left);
            }
            return false;
        }
        public boolean isSubtree(Node root, Node subRoot){
            if(subRoot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(isIdentical(root,subRoot)){
                return true;
            }
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //int[] nodes2 = {1,2,4,-1,-1,5,-1,-1,3,6,7,-1,-1};
        BinaryTreeOps tree= new BinaryTreeOps();
        //BinaryTreeOps tree2= new BinaryTreeOps();
        Node root=tree.buildTree(nodes);
        //Node subRoot=tree2.buildTree(nodes2);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.countOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter2(root).diam);
        System.out.println(tree.isSubtree(root,root));
        tree.sumKthLevel(root,3);
    }
}
