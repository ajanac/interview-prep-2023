/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 5/7/23, Sunday
 *          To change this template use File | Settings | File and Code Templates
*           Reverse Linked List
 *          *******************
 *          Given the head of a singly linked list, reverse the list, and return the reversed list.
 *          Input: head = [1,2,3,4,5]
*           Output: [5,4,3,2,1]
 *          Constraints:
*
            The number of nodes in the list is the range [0, 5000].
            -5000 <= Node.val <= 5000
 * */

class ListNode(val value: Int, var next: ListNode = null)

object ListNode
{
  def apply(value: Int = -999, next: ListNode = null) = new ListNode(value, next)

  def printList(listNode: ListNode): Unit =
  {
    var node = listNode
    while (node != null)
    {
      print(s"${node.value} ")
      node = node.next
    }
    println()
  }
}

object ReverseLinkedList
{
  def reverseList(head: ListNode): ListNode =
    {
      var prev: ListNode = null
      var headTemp = head
      while (headTemp != null)
        {
          var next: ListNode = headTemp.next
          headTemp.next = prev
          prev = headTemp
          headTemp = next
        }
      prev
    }
}

object reverseList extends App
{
  // Create one list && Add elements to the list
  val listA = ListNode(5, ListNode(10, ListNode(15, null)))
  ListNode.printList(listA)
  // Call the reverse function
  val reversedList = ReverseLinkedList.reverseList(listA)
  // Display reversed list
  println("Reversed Linked List is:")
  println("*****************")
  ListNode.printList(reversedList)

}
