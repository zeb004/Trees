import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// TreeNode: simple node in a binary search tree
public class TreeNode {
   public String data;  // data at each node
   public TreeNode left, right;
   public TreeNode(String d) { // construct leaf node
      data = d;
      left = right = null;
   }
}