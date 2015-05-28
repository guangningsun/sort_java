import java.util.Random;



public class ProgressSort {
	public static void main(String[] args) {
		// 生成随机数
		Random r = new Random(100);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			a[i]= Math.abs(r.nextInt())%100;
		}
		ProgressSort p = new ProgressSort();
		p.print(a, "before","");
		// 声明各个排序对象
		BubbleSort bubbleSort = new BubbleSort(); 	 // 冒泡排序
		BInsertSort bInsertSort = new BInsertSort(); // 二路归并排序
		HeapSort heapSort = new HeapSort(); 		 // 堆排序
		InsertSort insertSort = new InsertSort();	 // 直接插入排序
		MergeSort mergeSort = new MergeSort(); 		 // 归并排序
		QuickSort quickSort = new QuickSort(); 		 // 快速排序
		RadixSort radixSort = new RadixSort(); 		 // 基数排序
		SelectSort selectSort = new SelectSort(); 	 // 选择排序
		ShellSort shellSort = new ShellSort(); 		 // 希尔排序
		// 调用各排序方法
		int bubble []= bubbleSort.bubbleSort(a);
		int binsert [] = bInsertSort.bInsertSort(a);
		int insert [] = insertSort.insert_sort(a);
		int select [] = selectSort.selectSort(a);
		int merge [] = mergeSort.merge(a);
//		quickSort.quickSort(a, 0, a.length-1);
//		System.out.println(a[0]);
		
		p.print(bubble, "after","冒泡排序");
		p.print(binsert, "after", "二路归并排序");
		p.print(insert, "after", "直接插入排序");
		p.print(select, "after", "选择排序");
		p.print(merge, "after", "归并排序");
//		p.print(quick, "after", "快速排序");
		
		
	}
	public void print(int a[],String t,String msg){
		if(t.equals("after")){
			System.out.println(msg+"排序后的数据为：");
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+",");
			}
			System.out.println("");
		}
		if(t.equals("before")){
			System.out.println("源数据为：");
			for(int z=0;z<a.length;z++){
				System.out.print(a[z]+",");
			}
			System.out.println("");
		}
	}
}
