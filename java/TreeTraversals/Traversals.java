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
		if(root!=null && root.left!=null && root.right!=null){
			printLeafNodes(root.left);
			printLeafNodes(root.right);
		}else if(root!=null && root.left==null && root.right==null){
			System.out.print(root.data+", ");
		}
	}
}


public class Traversals{
	public static void main(String... args){
		Node node25 = new Node(null,null,25);
		Node node35 = new Node(null,null,35);
		Node node45 = new Node(null,null,45);
		Node node55 = new Node(null,null,55);
		Node node30 = new Node(node25,node35,30);
		Node node50= new Node(node45,node55,50);
		
		Node root = new Node(node30,node50,40);
		MyTree tree = new MyTree(root);
		tree.printInorder();
		tree.printPreorder();
		tree.printPostOrder();
		tree.printAllLeafNodes();
	}
}