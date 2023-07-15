/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 7/15/23, Saturday
 *          To change this template use File | Settings | File and Code Templates

Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
************
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
*************
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
*************
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
**************
Constraints:
-231 <= x <= 231 - 1
 * */

object IsPalindromeSolution
{
  def isPalindorme(x: Int): Boolean =
    {
      var xTemp = x
      if (xTemp == 0) return true
      if (xTemp < 0 || xTemp % 10 == 0) return false
      var reversedInt = 0
      while (xTemp > reversedInt)
        {
          val pop = xTemp % 10
          xTemp = xTemp / 10
          reversedInt = reversedInt * 10 + pop
        }
        if (x == reversedInt || x == reversedInt / 10)  true
        else false
    }
}

object IsPalindorme extends App
{
  println(s"${IsPalindromeSolution.isPalindorme(10)}")
  println(s"${IsPalindromeSolution.isPalindorme(121)}")

}
