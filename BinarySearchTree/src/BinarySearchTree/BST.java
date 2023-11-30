package BinarySearchTree;
import java.util.*;
/*
 * @desc:This class represents a binary-search tree(BST) .
      It creates the BST 
      and checks if an element is present int the tree or not
*/
public class BST 
{
	/*
	 * @desc:This method creates a BST and inserts elements into the BST
	 * 
	 * @params:none
	 * 
	 * @returns:The root of the BST
	 */
	public Node createBST()
	{
		Scanner s = new Scanner(System.in);
		//Queue stores the node in the order in which they are connected in the BST.
		Queue<Node> q = new LinkedList<>();
		//ROOT NODE:
		System.out.print("Enter root node : ");
		int rootdata = s.nextInt();
		if(rootdata==-1)
			return null;
			
		
		Node root = new Node(rootdata);
		//adding the root node to the queue
		q.add(root);
		
		while(!q.isEmpty())
		{
			/*
			 * We pop the node that was inserted first 
			 * and connect it to it's left & right node
			 */		
			Node front = q.poll();
			//Connecting the leftnode
			System.out.print("Enter left child of "+front.data+" : ");
			int leftdata = s.nextInt();
			if(leftdata!=-1)
			{
				Node leftnode = new Node(leftdata);
				front.left = leftnode;
				//After the leftnode is connected , it is added onto the queue
				q.add(leftnode);				
			}
			//Connecting the right node
			System.out.print("Enter right child of "+front.data+" : ");
			int rightdata = s.nextInt();
			if(rightdata!=-1)
			{
				Node rightnode = new Node(rightdata);
				front.right = rightnode;
				//After the rightnode is connected , it is added onto the queue
				q.add(rightnode);				
			}
		}
		return root;
	}
	
	/*
	 * @desc:This method checks if an element is present in the BST or not
	 * 
	 * @params:root of the BST and the element to be searched
	 * 
	 * @returns:boolean -->true if the element is present and false if not present
	 */
	public boolean search(Node root,int k)
	{
		if(root==null)
			return false;
		
		if(root.data==k)
			return true;
		else if(root.data<k)
			return search(root.right,k);
		else
			return search(root.left,k);
	}

}
