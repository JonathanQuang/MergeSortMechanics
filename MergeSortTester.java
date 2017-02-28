// Team MergeSortMechanics - Joelle Lum, Samantha Ngo, Jonathan Quang
// APCS2 - pd1
// HW07
// 2017-02-13

/*======================================
  class MergeSortTester

  ALGORITHM:
  The mergesort algorithim splits a list of integers into halves 
  (or near halves) recursively until there are only lists of length 1. Then an
  algorithim for merging two sorted lists is applied to the halves
  recursively until we get a list of the original length.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlog(n)

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 0
  n=10      time: 43
  n=100     time: 771
  ...
  n=1000  time: 10975

  ANALYSIS:
  The anaylsis of our results coincides closely with a BIG-OH classification
  of mergesort. We used desmos to guess and check constants of nlog(n) and
  we found that the function acurately described our experimental data.
  Do note that as an algorithm of nlog(n) becomes larger, its graph
  begins to look more and more like a line, which is why we tested 
  the algorithm with a range of array sizes for our data.
  ======================================*/

public class MergeSortTester
{
    
    public static int[] genRandomData(int n){
	int[] a = new int[n];
	for (int x = 0; x < a.length; x++){
	    a[x] = (int)(5000 * Math.random());
	}
	return a;
    }




    /******************************
     * execution time analysis 
     * We first made a function that took length n as an input
     * It would return an integer array of length n with random numbers
     * from 0-4999. 
     * The MergeSort.java file was modified to be instantiable and to
     * have an instance variable called pass that kept track of the runtime
     * We use for loops to test arrays of various sizes
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSort mergeObj = new MergeSort();

	for (int x = 1; x < 1000000; x*=10){
	    System.out.print("\n" + x);
	    mergeObj.pass = 0;
	    int[] derp = genRandomData(x);
	    mergeObj.sort(derp);
	    System.out.print(": " + mergeObj.pass);
	}
	
    }//end main

}//end class
