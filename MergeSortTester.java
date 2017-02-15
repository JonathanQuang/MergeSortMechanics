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
	    a[x] = (int)(5000 * Math.random());
	}
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
	MergeSort mergeObj = new MergeSort();

	System.out.println("Biggest number lengths");
	for (int x = 1000; x < 1000; x += 1000){
	    System.out.print("\n" + x);
	    mergeOb.pass = 0;
	    int[] derp = genRandomData(x);
	    mergeObj.sort(derp);
	    System.out.println(": " + mergeObj.pass);
	}
	System.out.println("\n----------------");
	System.out.println("Big number lengths");
	for (int x = 50; x < 1050; x += 50){
	    System.out.print("\n" + x);
	    mergeObj.pass=0;
	    int[] derp = genRandomData(x);
	    mergeObj.sort(derp);
	    System.out.print(": " + mergeObj.pass);
	}
	System.out.println("\n----------------");
	System.out.println("Smaller number lengths");
	
	for (int x = 1; x < 20; x += 1){
	    System.out.print("\n" + x);
	    mergeObj.pass=0;
	    int[] derp = genRandomData(x);
	    mergeObj.sort(derp);
	    System.out.print(": " + mergeObj.pass);
	}
    }//end main

}//end class
