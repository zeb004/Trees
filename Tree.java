import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Tree {
	//String value="Saleem";
	String value="Acevedo";
	String name="Najar";
   private TreeNode root;
   // insert
   public void insert(String d) {
      if (root == null) {
         root = new TreeNode(d);
         return;
      }
      TreeNode loc = root;
      while (true) {
         if (d.compareTo(loc.data) < 0) {
            if (loc.left != null) loc = loc.left;
            else { loc.left = new TreeNode(d); break; }
         }
         else if (d.compareTo(loc.data) > 0) {
            if (loc.right != null) loc = loc.right;
            else { loc.right = new TreeNode(d); break; }
         }
         else break;
      }
   }
	boolean a;
	boolean b;
	String phone;
	String phone2;
   public void inorderpass() {inOrder(root); }
   public void Postorderpass() {postOrder(root); }
   public void PostorderpassI() {postOrderI(root); }
   public void find() {Search(root,value); }
   public void find2() {Search2(root,value); }
   // Itterative Inorder
  public void inOrder(TreeNode root) {

    if(root == null)
     return;

    Stack<TreeNode> s = new Stack<TreeNode>();
    TreeNode currentNode=root;

    while(!s.empty() || currentNode!=null){

     if(currentNode!=null)
     {
      s.push(currentNode);
      currentNode=currentNode.left;
     }
     else
     {
      TreeNode n=s.pop();
      System.out.printf(n.data+ " ");
      currentNode=n.right;
     }
    }
   }
	//post order rec
   public void postOrder(TreeNode root) {
     if(root !=  null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.data);
     }
 }
 //postorder  itterative
  public void postOrderI( TreeNode root) {
	  System.out.println("Post order Itterative:");
       if( root == null ) return;

       Stack<TreeNode> s = new Stack<TreeNode>( );
       TreeNode current = root;

       while( true ) {

           if( current != null ) {
               if( current.right != null )
                s.push( current.right );
               s.push( current );
               current = current.left;
               continue;
         }

           if( s.isEmpty( ) )
            return;
           current = s.pop( );

           if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
               s.pop( );
               s.push( current );
               current = current.right;
           } else {
               System.out.print( current.data + " " );
               current = null;
           }
       }
  }
 //search rec
 public void Search(TreeNode root, String value){
         if(root == null) {
			  a=false;

         }else if ( root.data.contains(value)) {
			 a=true;
			 phone=root.data;
			 System.out.println("Inorder from"+" "+name+":");
			inOrder(root);
         }else {

        Search(root.left, value);
        Search(root.right, value);
}
}
//search itterative
public boolean Search2(TreeNode root, String value){
		while(root!=null){
			if(root.data.contains(value)){
				return true;
			}else if(root.data.compareTo(value)>0){
				root = root.left;
			}else{
				root = root.right;
			}
		}
		return false;
	}

//boolean print
public void bool() {boolresult(a,value,phone);}
    public void boolresult(boolean a, String value,String phone) {
		System.out.println(a+" "+phone);
	}
	//boolean print
	public void bool2() {boolresult2(a,value,phone);}
	    public void boolresult2(boolean a, String value,String phone) {
			System.out.println(a+" "+phone);
	}

}



