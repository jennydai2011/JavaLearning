# Double pointer 
  - find two pointers
  - narrow down range
  . processed, not needed, unknown
  
  leetcode#
  。344 - Reverse string - 数组下标倒序，对称替换
  。26- Remove duplicated From sorted array - slow/fast pointer, if fast=slow, fast++, slow不变;不等时替换 arr[slow++]=arr[fast++]
  。11 - container with most water
  。42 - trapping rain water
  。293 - moving zeros
  。80 - remove duplicates from sorted arry
  。1047 - remove all adjacent duplication in string
  
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
   - similar questions:
      - #237 delete node in a linked list
      - #141 linked list cycle. solution:2 pointers, V(fast) = 2V(slow), when slow==fast, return true
      - #92 reverse linked list II
      - #25 reverse linked list in group 

# stack
  - principal -- define stack
    - arr[i] 左侧所有比arr【i]
    - 递归之前的状态
  - similar questions:
     -#20  Valid parentheses
     -#496 Next greater element I
     -#503 next greater element II
     -#394 Decode string
     -#636 Exclusive Time of Functions
     -#84 Largest Rectangle in Histogram
 # heap
 - heap 适用于求解第K大的元素
 - common APIs:
    - peek  ->查看堆顶元素 O(1)
    - poll  ->拿出堆顶元素 o(logn)
    - offer ->添加元素 O(logn)
 - 3种解法
    - sorting O(logn)
    - max heap O(n+klogn)
    - min heap O(nlogk)
  - #215 (kth larget element in an array) -- min heap solution general steps
    - initialize a min heap
    - for each element x in the array
      - offer to heap if heap size < k or x>=top of heap
      - adjust heap size if necessary
    - return the top of heap    
  - #23 merge k sorted list
    - 1. initialize min heap with all List head references
    - 2. while heap is not empty
      - a. pull ouf top of heap( smallest pointer)
      - b. add it to result list
      - c. Add its next node if there exists 
    - Similar questions
      -#347 Top K frequent elements 
      -#253  Meeting roos II
      -#295 Find median From data stream
      -#767 Reorganzie String
      -#703 Kth largest element in a stream
