public class BubbleSortTest{
	public static void main(String... args){
		BubbleSort bubbleSort = new BubbleSort(4);

		bubbleSort.insert(10);
		bubbleSort.insert(40);
		bubbleSort.insert(24);
		bubbleSort.insert(12);

		System.out.println("Before Sorting: ");
		bubbleSort.display();

		bubbleSort.sort();
		System.out.println("After Sorting: ");
		bubbleSort.display();


	}
}