public class SelectionSort{
int[] arr;
int nums = 0;
public SelectionSort(int no){
	arr = new int[no];
 }

public  void insert(int no){
  arr[nums] = no;
  System.out.println("Inserted "+no+" at "+nums);
  nums++;
}
// sorted elements start accumulating to left of array
public void sort(){
 	System.out.println("Sorting element now: "+nums);
 	int minimum;
 	for(int outer = 0;outer<nums-1;outer++){
 		minimum = outer;
 		// find minimum element at note its position
 		for(int inner=outer+1;inner<nums;inner++){
 			if(arr[inner]<arr[minimum]){
 				minimum = inner;
 			}
 			//Swap element at minimum position with outer position
 			int temp = arr[minimum];
 			arr[minimum]= arr[outer];
 			arr[outer] = temp;
 		}
 	}
 
 }

 public void display(){
 	for(int no:arr){
 		System.out.print(no+",");
 	}
 }
}

