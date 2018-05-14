import java.util.*;
/*Documentation:
Purpose:
	You are to write a program name BSTree.java that will:
	1. Generate 100 random integer numbers ranging from 1 – 99.
	2. Store these numbers in a data structure of your choice and display the data on the screen.
	DO NOT SORT THIS DATA STRUCTURE.
	3. Now build a Binary Search Tree using this set of numbers. You MUST insert the values into the tree starting from the first element of your Data Structure and go sequentially.
	4. After building the tree, use an infix recursive method to display the data on the screen.
	5. To build the Binary Search Tree, you must create your own Linked List.
	
	
	Turn in BSTree.java, BStree.class OR BSTree.jar in the A#7 folder in iCollege (D2L) no later than 11:00 p.m. on the due date. 
	You must put the program name, your name, the course number (CSC 2720) and the date at the beginning of the program along with all documentations.
	
	
	
	
	Solution and Algorithms:
	
	*First Generate 100 random integer from 1 to 99
	*Then create a Binary Search Tree using these 100 numbers 
	*After building the tree use an infix recursive method to display the data on the screen
	*
	*
	*Linked list
	*Arraylist
	*boolean
	*Array
	*if,if else statement
	*for loop

	
	 *Description of how to use this program:
	 *Run this program output follow the instructions that displayed in the console window.
	 
	Class:2720 								Data Structures	
	CRN:86473
	Student Name: Yang Li		
	Program Name: BSTree.java 				Date:11/29/2017	
	*/
public class BSTree {
//declare some varibles that will be used in this program
   static LinkedList<Integer> treeList = new LinkedList<Integer>();
   static LinkedList<Integer> IndexList = new LinkedList<Integer>();
   private int data;
   private int root;
   private BSTree left;
   private BSTree right;
   static int c = 0;
   static ArrayList <Integer> bst = new ArrayList <Integer>();
   
//genrate 100 random number and did not sort it
   public static void main(String args[]){  
       int count = -1 ;
       
       System.out.println();
       System.out.println("Generate 100 Random Unsorted Integers (Between 0 - 99): \n");

       for(int i = 0; i < 100; i ++){
           int random = (int)(Math.random() * 100);
           treeList.add(random);
           count++;
           IndexList.add(count);
       }


       System.out.println("Random Number: ");
       System.out.println(treeList);
       System.out.println("");
       System.out.println("Index Number: ");
       System.out.println(IndexList);
       
       
       System.out.println("\n");
       System.out.println("*****************************************************");
       System.out.println("Start to build a Binary Search Tree: ");
       System.out.println("Start with Number: ");
       
// create BST and get numbers from the list
       BSTree BinarySearchTree = new BSTree(treeList.get(0));
       BinarySearchTree.setRoot(treeList.get(0));

       
       for(int i = 0; i < treeList.size(); i++){
           System.out.println(treeList.get(i));
           BinarySearchTree.add(treeList.get(i));
       }
//print out all the numbers       
       System.out.println("*****************************************************");
       System.out.println("\nInfix Recursive Method print out: \n");
       BSTree.printInfix(BinarySearchTree);

       
   }
//use an infix recursive method to display the data
   private static void printInfix(BSTree root){
       if(root == null){
           return;
       } else{
           c++;
           printInfix(root.getLeft());
           System.out.print(" " + root.getData());
           printInfix(root.getRight());
           bst.add(root.getData());
           
       }
   }

//returns false if data is same as data; otherwise returns true plus how the node is inserted
   public boolean add(int data) {
       if (data == this.data){
           System.out.println("Inserting this number " + data);
           return false;
       }
       else if (data < this.data) {
           if (left == null) {
               System.out.println("Inserting new node " + data + " to left");
               left = new BSTree(data);
               return true;
           } else{
               return left.add(data);
           }

       } else if (data > this.data) {
           if (right == null) {
               System.out.println("Inserting new node " + data + " to right");
               right = new BSTree(data);
               return true;
           } else
               System.out.println("Inserting " + data + " to right");
           return right.add(data);
       }
       return false;
   }
// The binary tree
   static BSTree tree = new BSTree(100);

   public BSTree(int data){
       this.data = data;
   }

   public void setData(int data){
       this.data = data;
   }

   public int getData(){
       return data;
   }

   public void setRoot(int root){
       this.root = root;
   }

   public int getRoot(){
       return root;
   }

//left node
   public void setLeft(int data){
	   BSTree temp = new BSTree(data);
	   temp.left = null;
	   temp.right = null;
	   temp.data = data;
	   this.left = temp;
   }
   public void setLeft(BSTree left){
	   this.left = left;
   }

   public BSTree getLeft(){
	   return left;
   }
//right node
   public void setRight(int data){
	   BSTree temp = new BSTree(data);
	   temp.left = null;
	   temp.right = null;
	   temp.data = data;
	   this.right = temp;
   }
   public void setRight(BSTree next){
	   this.right = next;
   }

   public BSTree getRight(){
	   return right;
   }
}


