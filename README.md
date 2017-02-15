# MergeSortMechanics

## Method: 
1. We discussed our hypotheses of what we thought the Big-Oh classification of merge sort would be.
  It was agreed upon that Merge Sort is O(n log n). With each pass, the midpoint is found, which is O(1).
  Then the array is split, which is O(log n). An example of this is binary search.
  What makes merge sort not just O(log n) is that the array is iterated through n times, making it O(n log n). 
2. To test our hypothesis, we added an instance variable to MergeSort.java called pass. Then, in merge(), we made
  pass increment by one with each run. We also placed the pass incrementor in sort(), after the base case of having
  an array of one integer and before splitting the array. This pass variable helps us to count every action done while
  performing merge sort on an array.
3. We added genRandomData() to MergeSortTester to easily test random data sets. genRandomData takes in an int and returns
  an randomized int array with the length of the int parameter.
4. In the main method of MergeSortTester, we created 3 bundles of data sets. We tested: smaller data sets, from size 1-19,
  medium data sets, from size 50-1000 in increments of 50, and large data sets, from size 1000 to 9000 in increments of 1000.
5. After that, we calculated the expected number of passes (n log n) to compare with the experimental data of passes.
6. After obtaining all the needed data, we created 3 graphs to analyze it.

## Findings:
Although the experimental data was not the same as the expected, the graphs show that our experimental data resembles O(n log n). When we first looked at the first and second bundles of data, the graph showed a line that looked linear. But from examining the smaller data sets, we were able to see the n log n trend.
graphs: https://docs.google.com/document/d/1UgDZbDvZ_rrvhvvRYdqe9qpGE8ehjwqY7LRF6brvA_c/pub
