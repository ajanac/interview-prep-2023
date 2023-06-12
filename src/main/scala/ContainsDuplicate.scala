import scala.reflect.internal.util.HashSet

/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 6/12/23, Monday
 *          To change this template use File | Settings | File and Code Templates
 *          ***************************************************************
 *          Given an array of integers, find if the array contains any duplicates.

            Your function should return true if any value appears at least twice in the array,
            and it should return false if every element is distinct.

            Example 1:
            Input: [1,2,3,1]
            Output: true

            Example 2:
            Input: [1,2,3,4]
            Output: false

            Example 3:
            Input: [1,1,1,3,3,4,3,2,4,2]
            Output: true
 * */
object containsDuplicateHasSetSolution // Prioritize time
{
  def containsDuplicate(nums: Array[Int]): Boolean =
    {
      val numbers = new java.util.HashSet[Int]()
      nums.foreach{elem =>
        if (numbers.contains(elem)) return  true
        numbers.add(elem)
      }
      false
    }
}

object containsDuplicateSortingArraySolution // No storage space then use it
{
  def containsDuplicate(nums: Array[Int]): Boolean =
    {
      val sortedNums = nums.sorted // nlogn - sort
      sortedNums.indices.foreach{index =>
        if (index + 1 < sortedNums.length)
        {if (sortedNums(index) == sortedNums(index + 1)) return true}
      }
    false
    }
}

object ContainsDuplicate
{
  def main(args: Array[String]): Unit =
    {
      val testOne = Array(1,2,3,1)
      println(s"Duplicates ? ${containsDuplicateHasSetSolution.containsDuplicate(testOne)}")
      val testTwo = Array(1,2,3,4)
      println(s"Duplicates ? ${containsDuplicateHasSetSolution.containsDuplicate(testTwo)}")

      val testThree = Array(1,1,1,3,3,4,3,2,4,2)
      println(s"Duplicates ? ${containsDuplicateSortingArraySolution.containsDuplicate(testThree)}")
      println(s"Duplicates ? ${containsDuplicateSortingArraySolution.containsDuplicate(testTwo)}")
    }
}
