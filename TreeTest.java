import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// TreeTest: test the Tree class, a binary search tree
public class TreeTest {
   public static void main(String[] argv) {
      String[] info = {"Ajose: 295-1492","Munoz: 291-1864","Kong: 295-1601","Saleem: 293-6122","Seddon: 295-1882","Najar: 291-7890",
                         "Voorhees: 294-8075","Sparks: 584-3662"};
      String[] add = {"Devin: 294-1568","Morah: 294-1882","Zembo: 295-6622"};
      Tree tree = new Tree();
      for (int i = 0; i < info.length; i++)
         tree.insert(info[i]);
         System.out.println("Inorder"+ "\n");
      tree.inorderpass();
      System.out.println("\n");
      System.out.println("Postorder"+ "\n");
      tree.Postorderpass();
      System.out.println();
      tree.find();
      System.out.println();
      System.out.println("Search:");
      System.out.println();
      tree.bool();
      //insert
      for (int m = 0; m < add.length; m++)
         tree.insert(add[m]);
     		System.out.println();
         System.out.println("Inorder after add:");
		tree.inorderpass();
   }
}