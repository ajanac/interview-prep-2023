/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 5/17/23, Wednesday
 *          To change this template use File | Settings | File and Code Templates
 *          94. Binary Tree Inorder Traversal
            Given the root of a binary tree, return the inorder traversal of its nodes' values.
            Example 1:
            Input: root = [1,null,2,3]
            Output: [1,3,2]
            Example 2:

            Input: root = []
            Output: []
            Example 3:

            Input: root = [1]
            Output: [1]


            Constraints:

            The number of nodes in the tree is in the range [0, 100].
            -100 <= Node.val <= 100

 * */

import java.util

object BinaryInOrderTraversalSolution
{
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null)
  {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def inOrderTraversal(root: TreeNode): util.ArrayList[Int]=
  {
    val stack = new util.Stack[TreeNode]()
    val outputArray = new util.ArrayList[Int]

    if (root == null) return outputArray

    var current: TreeNode = root
    while(current != null || !stack.isEmpty)
      {
        while (current != null)
          {
            stack.push(current)
            current = current.left
          }
        current = stack.pop()
        outputArray.add(current.value)
        current = current.right
      }
      outputArray
  }
}

object BinaryInOrderTraversal extends App
{
  val root = new BinaryInOrderTraversalSolution.TreeNode(1, null, new BinaryInOrderTraversalSolution.TreeNode(
    2, new BinaryInOrderTraversalSolution.TreeNode(3, null, null), null)
  )
  val output = BinaryInOrderTraversalSolution.inOrderTraversal(root)
  output.forEach( x => print(s" $x "))

}
