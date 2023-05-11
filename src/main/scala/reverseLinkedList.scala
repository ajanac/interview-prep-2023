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

class ListNodeGeneral(val value: Int, var next: ListNodeGeneral = null)

object ListNodeGeneral
{
  def apply(value: Int = -999, next: ListNodeGeneral = null) = new ListNodeGeneral(value, next)

  def printList(listNode: ListNodeGeneral): Unit =
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
  def reverseList(head: ListNodeGeneral): ListNodeGeneral =
    {
      var prev: ListNodeGeneral = null
      var headTemp = head
      while (headTemp != null)
        {
          var next: ListNodeGeneral = headTemp.next
          headTemp.next = prev
          prev = headTemp
          headTemp = next
        }
      prev
    }
}

object ReverseList extends App
{
  // Create one list && Add elements to the list
  val listA = ListNodeGeneral(5, ListNodeGeneral(10, ListNodeGeneral(15, null)))
  ListNodeGeneral.printList(listA)
  // Call the reverse function
  val reversedList = ReverseLinkedList.reverseList(listA)
  // Display reversed list
  println("Reversed Linked List is:")
  println("*****************")
  ListNodeGeneral.printList(reversedList)

}
