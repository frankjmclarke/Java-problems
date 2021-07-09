import java.util.*;

class Program {
	
	
	static int traverse(BinaryTree root, int depth) { //O(v+e) time , O(h) space
		if(root==null)
			return 0;
		return depth + traverse(root.left, depth +1) + traverse(root.right, depth +1);
	}

  public static int nodeDepths(BinaryTree root) {
    traverse(root,0);
		System.out.println(sum);
    return sum;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
