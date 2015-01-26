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

