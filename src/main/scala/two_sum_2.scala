/**
 * @author : ajanasathian
 * @mailto : ajanacs@gmail.com
 * @created : 5/8/23, Monday
 *          To change this template use File | Settings | File and Code Templates
 *          *****************
 *          Problem Statement:
 *          *****************
            Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
            find two numbers such that they add up to a specific target number.
            Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
            Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
            The tests are generated such that there is exactly one solution. You may not use the same element twice.
            Your solution must use only constant extra space.
            *************************
            Example 1:
            *********
            Input: numbers = [2,7,11,15], target = 9
            Output: [1,2]
            Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * */
object TwoSum2
{
  def twoSum(numbers: Array[Int], target: Int): Array[Int] =
    {
      var aPointer = 0 // index to the smallest element in the array
      var bPointer = numbers.length - 1
      while  (aPointer <= bPointer)
        {
          val sum = numbers(aPointer) + numbers(bPointer)
          if (sum > target)
            {
              bPointer = bPointer - 1
            }
          else if (sum < target)
            {
              aPointer = aPointer + 1
            }
          else
            {
              return Array(aPointer + 1, bPointer + 1)
            }
        }
        Array[Int]()
    }
}
object TwoSumSortedArray extends App
{
  val numbers = Array(2,7,11,15)
  val output = TwoSum2.twoSum(numbers, target = 9)
  output.foreach(println(_))
}
