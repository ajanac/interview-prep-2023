/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 5/10/23, Wednesday
 *          To change this template use File | Settings | File and Code Templates
 *
 *        Palindrome Linked List
          Given the head of a singly linked list, return true if it is palindrome or false otherwise.
          Example 1:
          **********
          Input: head = [1,2,2,1]
          Output: true
          Example 2:
          **********
          Input: head = [1,2]
          Output: false
          Constraints:
          *************
          The number of nodes in the list is in the range [1, 105].
          0 <= Node.val <= 9
          Follow up: Could you do it in O(n) time and O(1) space?
 * */

class ListNode(val value: Int, var next: ListNodeGeneral = null)

object ListNode
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

object PalindromeLinkedListSolution
{
  def isPalindorme(head: ListNodeGeneral): Boolean =
    {
      var slow: ListNodeGeneral = head
      var fast: ListNodeGeneral = head
      while (fast != null && fast.next != null)
        {
          fast = fast.next.next
          slow = slow.next
        }
      slow = reversed(slow)
      fast = head

      while (slow != null)
        {
          if (slow.value != fast.value) return false
          slow = slow.next
          fast = fast.next
        }
    true
    }
  private def reversed(head: ListNodeGeneral): ListNodeGeneral =
  {
    var temp = head
    var prev: ListNodeGeneral = null
    while (temp != null)
      {
        val next = temp.next
        temp.next = prev
        prev = temp
        temp = next
      }
      prev
  }
}

object PalindromeLinkedList extends App
{
  val listA = ListNodeGeneral(1, ListNodeGeneral(2, ListNodeGeneral(2, ListNodeGeneral(1, null))))
  ListNodeGeneral.printList(listA)
  println(PalindromeLinkedListSolution.isPalindorme(listA))

  val listB = ListNodeGeneral(1, ListNodeGeneral(1, ListNodeGeneral(2, null)))
  ListNodeGeneral.printList(listB)
  println(PalindromeLinkedListSolution.isPalindorme(listB))

}
