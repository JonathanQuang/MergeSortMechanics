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
Although the experimental data was not the same as the expected, the graphs show that our experimental data resembles O(n log n). 
What we did was we compared the difference between our experimental values and the expected values from n*log2(n), n, and n^2.
This yielded datapoints that concerned how close the data was to the formulas.
We then found the lines of best fit for the 3 sets of differences and the R value (AKA, the correlation coefficient). The R value
represents how close the experimental differences are to the expected differences. An R value closest to 1 or -1 would mean that the
applied formula was very accurate.



tables and graphs: https://docs.google.com/document/d/1UgDZbDvZ_rrvhvvRYdqe9qpGE8ehjwqY7LRF6brvA_c/pub

From the stastical values generated, the graph that generated the R value closest to 1 was the nlog(n) graph. This means that stastically, nlog(n) is probably the correct Big-Oh classification.

Do note that due to the high values tested, the R values were all close to R. This means that a small difference in R values meant that
the classification was more off. If we were to test using smaller numbers, the R values between the classifcations would probably be more
noticable numerically.
