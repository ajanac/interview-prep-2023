/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 7/11/23, Tuesday
 *          To change this template use File | Settings | File and Code Templates
 *          Given the root of a binary tree, invert the tree, and return its root.
            Example 1:
            *********
            Input: root = [4,2,7,1,3,6,9]
            Output: [4,7,2,9,6,3,1]
            Example 2:
            *********
            Input: root = [2,1,3]
            Output: [2,3,1]
            Example 3:
            **********
            Input: root = []
            Output: []
            Constraints:
            The number of nodes in the tree is in the range [0, 100].
            -100 <= Node.val <= 100
 * */
import java.util.Collections
import java.util

object InvertBinaryTreeSolution
{
  // Definition of binary tree
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null)
  {
    var value: Int = _value
    var left : TreeNode = _left
    var right: TreeNode = _right
  }

  def invertTree(t: TreeNode): TreeNode =
  {
    if (t == null) return t
    val left = invertTree(t.left)
    val right = invertTree(t.right)
    // swap
    t.right = left
    t.left = right
    t
  }
  
  def PreOrderTraversal(t: TreeNode): Unit =
    {
      if (t == null) return
      print(s"${t.value} ")
      PreOrderTraversal(t.left)
      PreOrderTraversal((t.right))
    }
}

object InvertBinaryTree extends App
{
  // [4,2,7,1,3,6,9]
  val tree = new InvertBinaryTreeSolution.TreeNode(4, new InvertBinaryTreeSolution.TreeNode(2, new InvertBinaryTreeSolution.TreeNode(1,
    null, null), new InvertBinaryTreeSolution.TreeNode(3, null, null)), new InvertBinaryTreeSolution.TreeNode(
    7, new InvertBinaryTreeSolution.TreeNode(6, null, null), new InvertBinaryTreeSolution.TreeNode(9, null, null))
  )
  InvertBinaryTreeSolution.PreOrderTraversal(tree)
  InvertBinaryTreeSolution.invertTree(tree)
  println()
  InvertBinaryTreeSolution.PreOrderTraversal(tree)

}
