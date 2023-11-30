package BinarySearchTree;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		BST b = new BST(); // creating a new BST
		
		
		//UC-1 : creates the BST and returns the root
		Node root = b.createBST(); 
		
		//UC-2: Check if an element is present in the BST
		System.out.print("\nEnter element that you want to search : ");
		int elem = s.nextInt();
		boolean ans = b.search(root,elem);
		if(ans)
			System.out.println(elem+" is present is the binary-search tree");
		else
			System.out.println(elem+" is not present is the binary-search tree");
		
	}

}
