
public class BinarySearchTree {

	private TreeNode node;

	public TreeNode getNode() {
		return node;
	}

	public void setNode(TreeNode node) {
		this.node = node;
	}
	
	public void addNewNode(int value, TreeNode node){
		if(this.node==null){
			this.node = node;
			return;
		}
		int data = node.getData();
		if(data<value){
			//System.out.println("Right");
			if(node.getRightNode()==null){
				//System.out.println("empty");
				TreeNode childNode = new TreeNode();
				childNode.setData(value);
				node.setRightNode(childNode);
			}else{
				//System.out.println("not empty");
				addNewNode(value, node.getRightNode());
			}
		}else if(data>value){
			//System.out.println("left");
			if(node.getLeftNode()==null){
				//System.out.println("empty");
				TreeNode childNode = new TreeNode();
				childNode.setData(value);
				node.setLeftNode(childNode);
			}else{
				//System.out.println("Not Empty");
				addNewNode(value, node.getLeftNode());
			}
		}
		
	}
	
	public void add(int value){
		addNewNode(value, this.node);
	}
	public void printTree(TreeNode node){
		System.out.println(node.getData());
		if(node.getLeftNode()!=null){
			System.out.println("left");
			printTree(node.getLeftNode());
		}
		if(node.getRightNode()!=null){
			System.out.println("right");
			printTree(node.getRightNode());
		}
	}
	
	public BinarySearchTree(int nodevalue){
		TreeNode node = new TreeNode();
		node.setData(nodevalue);
		this.node = node;
	}
	
	public TreeNode search(TreeNode node, int value){
		if(node==null || node.getData()==value){
			return node;
		}
		if(node.getData()>value){
			System.out.println("right");
			search(node.getRightNode(), value);
		}
		return search(node.getRightNode(),value);
		
	}
	
	public void inOrderRec(TreeNode node){
		if(node!=null){
			inOrderRec(node.getLeftNode());
			System.out.println(node.getData());
			inOrderRec(node.getRightNode());
		}
	}
	
}
