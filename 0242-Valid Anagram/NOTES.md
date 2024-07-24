<h2><a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a></h2>

Notes: #hash-table , #sorting , #array 

### Approach
- Two Ways:
  - A solution(Sorting)：
    1. sort the two input string
    2. compare the sorted string if they are equal.

    - This way does not need extra space to store data.
    - However, it's worth noting that this approach has a time complexity of O(n log n) due to the sorting operation, where n is the length of the strings.
  - B solution(Extra Space and Count character):
    1. go throw first string
    2. use extra map to store the counting characters result (Array, Hash Table)
    3. go throw second string
    4. minus the appear character
    5. check if the map have value not equal return false, and true otherwise.
    
    - This way use extra space but the time complexity of this solution is O(n).
  
reference : https://leetcode.com/problems/valid-anagram/solutions/3687854/3-method-s-c-java-python-beginner-friendly