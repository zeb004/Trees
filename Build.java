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
public class Build {
   public String data;  // data at each node
   public Main1 left, right;
   public Main1(String d) { // construct leaf node
      data = d;
      left = right = null;
   }
}