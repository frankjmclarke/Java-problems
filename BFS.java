import java.io.*;
import java.util.*;
import java.math.*;

   class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }
class Solution { 
  public static void main(String args[]) throws IOException {
  
  }
  
static void bfs(Tree root){
  ArrayList<Tree> queue = new ArrayList();
  int i = 0;
  queue.add(root);
  while(i < queue.size()){
    Tree item =queue.get(i++);
    if (item==null)
      continue;
    else{
      System.out.println(item.data);
      queue.add(root.left);
      queue.add(root.right);
    }
  }
}
}
///////////RECURSION
static void bfs(Tree root, int i, ArrayList<Tree> queue){
  if(i >= queue.size()) return;
  else {
    Tree poppedNode = queue.get(i);
    if(poppedNode != null){
      System.out.println(poppedNode.data);
      queue.add(poppedNode.left);
      queue.add(poppedNode.right);
    }
    bfs(root, i+1, queue);
  }
}

static void bfs(Tree root){
  ArrayList<Tree> queue = new ArrayList<>();
  queue.add(root);
  bfs(root, 0, queue);
}

BFS