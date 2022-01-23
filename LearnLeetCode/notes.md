# Double pointer 
  - find two pointers
  - narrow down range
  . processed, not needed, unknown
  
  leetcode#
  #344 - Reverse string - 数组下标倒序，对称替换
  #26- Remove duplicated From sorted array - slow/fast pointer, if fast=slow, fast++, slow不变;不等时替换 arr[slow++]=arr[fast++]
  #11 - container with most water
  #42 - trapping rain water
  #293 - moving zeros
  #80 - remove duplicates from sorted arry
  #1047 - remove all adjacent duplication in string
  
# Binary search
  - 是一个在有序范围内实现搜索的算法，O(logN)
  - 两大原则
    - 每次都要缩减搜索区间
    - 每次不能略过潜在答案
  - 三种变种
    - 找准确答案
      。l <= r
      . 缩减搜索空间： l = mid-1, r = mid +1
    - 找模糊值，最接近的答案
      . l<r
      . l = mid, r=mid-1; 或者 l=mid+1, r=mid
    - 万用型
      . l < r-1
      . l =mid, r=mid
    
    leetcode#
    #1062 - Longest Repeating Substring
    #410 - Split arry lartest sum
    #1231 - divide chocolate
    #852 - peak index in a mountain array
    #1011 - capacity to ship packages within D days
    #1292 - maximum side length of a square with sum less than or euqal to threshold

 # Linked list
   - double pointer
   - recursion
      。ask subproblem to return result
      。do something at current recursion level
        - return result
        - repeat
