/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester
{
    
    public static int[] genRandomData(int n){

	int[] a = new int[n];
	for (int x = 0; x < a.length; x++){
	    a[x] = Math.pow(2,30) * Math.random();
	}
	
	System.out.print(a);
	return a;
    }




    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int[] blergh = {9,2,76,1463,793,275,173,1234};
	MergeSort mergeObj = new MergeSort();
	mergeObj.sort(blergh);
	System.out.println(mergeObj.pass);

	int[] A = genRandomData(100);
	mergeObj.pass = 0;
	mergeObj.sort(A);
	System.out.println(mergeObj.pass);




    }//end main

}//end class
