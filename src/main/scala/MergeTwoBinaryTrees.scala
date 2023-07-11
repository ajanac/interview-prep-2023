/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 7/10/23, Monday
 *          To change this template use File | Settings | File and Code Templates
 * */

/**
 * You are given two binary trees root1 and root2.

    Imagine that when you put one of them to cover the other,
    some nodes of the two trees are overlapped while the others are not.
    You need to merge the two trees into a new binary tree.
   The merge rule is that if two nodes overlap, then sum node values
   up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

   Return the merged tree.
  Note: The merging process must start from the root nodes of both trees.

Example 1:

Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]
Example 2:

Input: root1 = [1], root2 = [1,2]
Output: [2,2]
 */

object Solution
{
  //Definition for a binary tree node.
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null)
  {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode =
  {
    if (t1 == null) return  t2
    if (t2 == null) return  t1
    t1.value = t1.value + t2.value
    t1.left = mergeTrees(t1.left, t2.left)
    t1.right = mergeTrees(t1.right, t2.right)
    t1
  }
  
  def inOrder(t: TreeNode): Unit = 
    {
      if (t == null) return t
      inOrder(t.left)
      print(s"${t.value} ")
      inOrder(t.right)
    }
}

object MergeTwoBinaryTrees extends App
{
  val tree1 = new Solution.TreeNode(1, _left = new Solution.TreeNode(3, _left = new Solution.TreeNode(5,
    null, null), _right = null), _right =  new Solution.TreeNode(2, _left = null, _right = null))
  Solution.inOrder(tree1)
  println()
  val tree2 = new Solution.TreeNode(2, _left = new Solution.TreeNode(1, _left = null, _right = new Solution.TreeNode(4, null, null))
    , _right =  new Solution.TreeNode(3, _left = new Solution.TreeNode(7, _left = null, _right = null), _right = null))
  Solution.inOrder(tree2) // need to come to the inorder for this one
  println()
  val mergedTree = Solution.mergeTrees(tree1, tree2)
  Solution.inOrder(mergedTree)

}
