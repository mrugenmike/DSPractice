public class SelectionSortTest{
	public static void main(String... args){
		SelectionSort selectionSort = new SelectionSort(4);

		selectionSort.insert(10);
		selectionSort.insert(40);
		selectionSort.insert(24);
		selectionSort.insert(12);

		System.out.println("Before Sorting: ");
		selectionSort.display();

		selectionSort.sort();
		System.out.println("After Sorting: ");
		selectionSort.display();


	}
}