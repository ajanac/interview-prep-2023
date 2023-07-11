/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 7/3/23, Monday
 *          To change this template use File | Settings | File and Code Templates
 *          589. N-ary Tree Preorder Traversal

            Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

            Nary-Tree input serialization is represented in their level order traversal.
            Each group of children is separated by the null value (See examples)
            Example 1:
            Input: root = [1,null,3,2,4,null,5,6]
            Output: [1,3,5,6,2,4]
            Example 2:
            Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
            Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
            Constraints:
            The number of nodes in the tree is in the range [0, 104].
            0 <= Node.val <= 104
            The height of the n-ary tree is less than or equal to 1000.
            Follow up: Recursive solution is trivial, could you do it iteratively?
 * */
import java.util
import java.util.Collections
class NodeNaryPreOrderProblem(var _value: Int)
{
  var value: Int = _value
  var children = new util.ArrayList[NodeNaryPreOrderProblem]()
}
object NaryPreOrderTraversal
{
  def preOrder(root: NodeNaryPreOrderProblem): util.LinkedList[Int] =
    {
      val stack = new util.LinkedList[NodeNaryPreOrderProblem]()
      val outputArray = new util.LinkedList[Int]()
      if (root == null)
        return outputArray
      stack.add(root)
      while (!stack.isEmpty)
        {
          val node = stack.pollLast()
          outputArray.add(node.value)
          Collections.reverse(node.children)
          node.children.forEach(child => stack.add(child))
        }
      outputArray
    }
}

object NaryPreOrderTraversalSolution extends App
{
  val root = new NodeNaryPreOrderProblem( 1)
  root.children.add(new NodeNaryPreOrderProblem(3))
  root.children.add(new NodeNaryPreOrderProblem(2))
  root.children.add(new NodeNaryPreOrderProblem(4))

  root.children.get(0).children.add(new NodeNaryPreOrderProblem(5))
  root.children.get(0).children.add(new NodeNaryPreOrderProblem(6))
  println(NaryPreOrderTraversal.preOrder(root))
}


