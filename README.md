# MergeSortMechanics

## Method: 
1. We discussed our hypotheses of what we thought the Big-Oh classification of merge sort would be.
  It was agreed upon that Merge Sort is O(n log n). With each pass, the midpoint is found, which is O(n).
  Then the array is split, which is O(log n). An example of this is binary search.
  What makes merge sort not just O(log n ) is that the array is iterated through n times, making it O(n log n). 
2. To test our hypothesis, we added an instance variable to MergeSort.java called pass. Then, in merge(), we made
  pass increment by one within each run. We also placed the pass incrementor in sort(), after the base case of having
  an array of one integer and before splitting the array. This pass variable helps us to count every action done while
  performing merge sort on an array.
3. We added genRandomData() to MergeSortTester to easily test random data sets. genRandomData takes in an int and returns
  an randomized int array with the length of the int parameter.
4. In the main method of MergeSortTester, we created 3 bundles of data sets. We tested: smaller data sets, from size 1-19,
  medium data sets, from size 50-1000 in increments of 50, and large data sets, from size 1000 to 10000 in increments of 1000.
5. After obtaining the data of passes, we created 3 graphs to analyze it.

## Findings:
As expected, the graphs resembled O(n log n). 
graphs: https://docs.google.com/document/d/1UgDZbDvZ_rrvhvvRYdqe9qpGE8ehjwqY7LRF6brvA_c/pub
