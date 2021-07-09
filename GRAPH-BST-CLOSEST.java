import java.util.*;

class Program {

  public static int bst(BST tree, int target, int closest) {
		if (Math.abs(target-closest) > Math.abs(tree.value-target)) {
			closest = tree.value;
		}

		if (target < tree.value && tree.left != null) {
			return bst(tree.left, target, closest);
		}
		if (target > tree.value && tree.right != null) {
			return bst(tree.right, target, closest);
		}
		
		if (tree!=null ||tree.value == target) {
			return closest;
		}
		return closest;
  }
  public static int findClosestValueInBst(BST tree, int target) {
		bst(tree, target, tree.value);
		return bst(tree, target, tree.value);
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}