import java.util.*;
class Node{
	public  Node(Node left,Node right, int data){
	 this.data = data;
	 this.left = left;
	 this.right = right;
	}
	int data;
	Node left;
	Node right;
}

class MyTree{
	Node  root;
	public MyTree(Node root){
		this.root = root;
	}

	public void printInorder(){
		if(root!=null){
			System.out.println("****In-Order****");
			recursiveInorderHelper(root);
			System.out.println("\n");
		}else{
			System.out.println("Root is null");
		}
	}
	private void recursiveInorderHelper(Node root){
		
		if(root!=null){
			 recursiveInorderHelper(root.left);
			 System.out.print(root.data+",");
			 recursiveInorderHelper(root.right);
		}
	}

	public void printPreorder(){
		if(root!=null){
			System.out.println("****Pre-Order****");
			recursivePreorderHelper(root);
			System.out.println("\n");
		}else{
			System.out.println("Root is null");
		}
	}
	private void recursivePreorderHelper(Node root){
		if(root!=null){
			 System.out.print(root.data+",");
			 recursivePreorderHelper(root.left);
			 recursivePreorderHelper(root.right);
		}
	}

	public void printPostOrder(){
		if(root!=null){
			System.out.println("****Post-Order");
			recursivePostOrderHelper(root);
			System.out.println("\n");
		}else{
			System.out.println("Root is Null ;(");
		}
	}
	private void recursivePostOrderHelper(Node root){
		if(root!=null){
			recursivePostOrderHelper(root.left);
			recursivePostOrderHelper(root.right);
			System.out.print(root.data+", ");
		}
	}
	
	public void printAllLeafNodes(){
		if(root!=null){
			System.out.println("***Leaf Nodes****");
			printLeafNodes(root.left);
			printLeafNodes(root.right);
			System.out.println("\n");
		}
	}
	private void printLeafNodes(Node root){
		if(root!=null && (root.left!=null || root.right!=null)){
			printLeafNodes(root.left);
			printLeafNodes(root.right);
		}else if(root!=null && root.left==null && root.right==null){
			System.out.print(root.data+", ");
		}
	}

	public void printAllNonLeafNodes(){
		if(root!=null){
			System.out.println("***Non Leaf Nodes****");
			System.out.print(root.data+", ");
			printNonLeafNodes(root.left);
			printNonLeafNodes(root.right);
			System.out.println("\n");
		}
	}
	private void printNonLeafNodes(Node root){
		if(root!=null && (root.left!=null || root.right!=null)){
			System.out.print(root.data+", ");
			printNonLeafNodes(root.left);
			printNonLeafNodes(root.right);
		}
	}

	public void printLevelWise(){
		if(root!=null){
			int height = getHeight(root);
			System.out.println("height of tree: "+height);
			for(int i =0 ;i<height;i++){
				printLevel(root,i);
			}
		}
	}
private void printLevel(Node root,int level){
//
}
	private int getHeight(Node root){
		if(root==null){
			return -1;
		}else{
			int leftH = getHeight(root.left);
			int rightH= getHeight(root.right);
			if(leftH>rightH){
				return leftH+1;
			} else{
				return rightH+1;
			}
		}
	}

	public void printIterativeInorder(){
		System.out.println("**Non-Recursive**");
		List<Integer> values = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		Node current = root;

		while(!stack.isEmpty()||current!=null){
			if(current!=null){
				stack.push(current);
				current = current.left;
			}else{
				 Node n = stack.pop(); 
				 values.add(n.data);
				 current = n.right;
			}
		}
		for(Integer val:values){
			System.out.print(val+", ");
		}
		System.out.print("\n");
	}
}


public class Traversals{
	public static void main(String... args){
		Node node60 = new Node(null,null,60);
		Node node25 = new Node(null,null,25);
		Node node35 = new Node(null,null,35);
		Node node45 = new Node(null,null,45);
		Node node55 = new Node(null,node60,55);
		Node node30 = new Node(node25,node35,30);
		Node node50= new Node(node45,node55,50);
		
		Node root = new Node(node30,node50,40);
		MyTree tree = new MyTree(root);
		tree.printInorder();
		tree.printIterativeInorder();
		tree.printPreorder();
		tree.printPostOrder();
		tree.printAllLeafNodes();
		tree.printAllNonLeafNodes();
		tree.printIterativeInorder();
	}
}