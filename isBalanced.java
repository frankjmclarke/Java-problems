// Time complexity: O(nlogn)
// Space complexity: O(h)

static class Tree{
  int data;
  Tree left;
  Tree right;
  
  Tree(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
  
  Tree(int data, Tree left, Tree right){
      this.data = data;
      this.left = left;
      this.right = right;
  }
}

static int height(Tree root){
	if(root == null) return -1;
	int lefth = height(root.left);
	int right = height(root.right);
	return 1 + Math.max(lefth, righth);
}

static boolean isBalanced(Tree root){
	if(root == null) return true;
	int leftHeight = height(root.left);
	int rightHeight = height(root.right);
	return Math.abs(leftHeight-rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
}


// Time complexity: O(n)
// Space complexity: O(h)
static int getH(Tree root, boolean[] output){
	if(root == null) return -1;
	int lefth = getH(root.left, output);
	int righth = getH(root.right, output);
	if(Math.abs(lefth-righth) > 1) output[0] = false;
	return 1 + Math.max(lefth, righth);
}

static boolean isBalanced(root){
	boolean[] output = {true};
	getH(root, output);
	return output[0];
}

