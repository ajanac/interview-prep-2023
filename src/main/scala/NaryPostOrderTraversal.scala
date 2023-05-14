import java.util
/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 5/13/23, Saturday
 *          To change this template use File | Settings | File and Code Templates N-ary Tree Postorder Traversal
            Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

            Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
            Example 1:


            Input: root = [1,null,3,2,4,null,5,6]
            Output: [5,6,3,2,4,1]
            Example 2:


            Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
            Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]


            Constraints:
            **********
            The number of nodes in the tree is in the range [0, 104].
            0 <= Node.val <= 104
            The height of the n-ary tree is less than or equal to 1000.
 *
 * */

class NodeNaryProblem(var _value: Int)
{
  var value: Int = _value
  var children = new util.ArrayList[NodeNaryProblem]()
}

object NaryPostOrderTraversalSolution
{
  def postOrder(root: NodeNaryProblem): util.LinkedList[Int] =
    {
      val stack = new util.LinkedList[NodeNaryProblem]()
      val outputArray = new util.LinkedList[Int]()
      if (root == null)
        {
          return outputArray
        }
      stack.add(root)
      while (!stack.isEmpty)
        {
          val node = stack.pollLast()
          outputArray.addFirst(node.value)
          node.children.forEach(child => stack.add(child))
        }
        outputArray
    }
}
object NaryPostOrderTraversal extends App
{
  val root = new NodeNaryProblem(1)
  root.children.add(new NodeNaryProblem(3))
  root.children.add(new NodeNaryProblem(2))
  root.children.add(new NodeNaryProblem(4))

  root.children.get(0).children.add(new NodeNaryProblem(5))
  root.children.get(0).children.add(new NodeNaryProblem(6))
  println(NaryPostOrderTraversalSolution.postOrder(root))
}
