public class BubbleSort{
int[] arr;
int nums = 0;
public BubbleSort(int no){
	arr = new int[no];
 }

public  void insert(int no){
  arr[nums] = no;
  System.out.println("Inserted "+no+" at "+nums);
  nums++;
}

/**
* The idea is to put the smallest item at the beginning of the array (index 0) and the largest item at the end (index nElems-1). The loop counter out in the outer for loop starts at the end of the array, at nElems-1, and decrements itself each time through the loop. The items at indices greater than out are always completely sorted. The out variable moves left after each pass by in so that items that are already sorted are no longer involved in the algorithm.
* The inner loop counter in starts at the beginning of the array and increments itself each cycle of the inner loop, exiting when it reaches out. Within the inner loop, the two array cells pointed to by in and in+1 are compared, and swapped if the one in in is larger than the one in in+1.
**/
 public void sort(){
 	System.out.println("Sorting element now: "+nums);
 	for(int outer = nums-1; outer>1;outer--){
 		for (int inner = 0; inner<outer ;inner++) {
 			 if(arr[inner]>arr[inner+1]){
 			 	int temp = arr[inner];
 			 	arr[inner] = arr[inner+1];
 			 	arr[inner+1] = temp;
 			 }
 		}
 	}
 }

 public void display(){
 	for(int no:arr){
 		System.out.print(no+",");
 	}
 }
}

