import java.util.Random;



public class ProgressSort {
	public static void main(String[] args) {
		// ���������
		Random r = new Random(100);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			a[i]= Math.abs(r.nextInt())%100;
		}
		ProgressSort p = new ProgressSort();
		p.print(a, "before","");
		// ���������������
		BubbleSort bubbleSort = new BubbleSort(); 	 // ð������
		BInsertSort bInsertSort = new BInsertSort(); // ��·�鲢����
		HeapSort heapSort = new HeapSort(); 		 // ������
		InsertSort insertSort = new InsertSort();	 // ֱ�Ӳ�������
		MergeSort mergeSort = new MergeSort(); 		 // �鲢����
		QuickSort quickSort = new QuickSort(); 		 // ��������
		RadixSort radixSort = new RadixSort(); 		 // ��������
		SelectSort selectSort = new SelectSort(); 	 // ѡ������
		ShellSort shellSort = new ShellSort(); 		 // ϣ������
		// ���ø����򷽷�
		int bubble []= bubbleSort.bubbleSort(a);
		int binsert [] = bInsertSort.bInsertSort(a);
		int insert [] = insertSort.insert_sort(a);
		int select [] = selectSort.selectSort(a);
		int merge [] = mergeSort.merge(a);
//		quickSort.quickSort(a, 0, a.length-1);
//		System.out.println(a[0]);
		
		p.print(bubble, "after","ð������");
		p.print(binsert, "after", "��·�鲢����");
		p.print(insert, "after", "ֱ�Ӳ�������");
		p.print(select, "after", "ѡ������");
		p.print(merge, "after", "�鲢����");
//		p.print(quick, "after", "��������");
		
		
	}
	public void print(int a[],String t,String msg){
		if(t.equals("after")){
			System.out.println(msg+"����������Ϊ��");
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+",");
			}
			System.out.println("");
		}
		if(t.equals("before")){
			System.out.println("Դ����Ϊ��");
			for(int z=0;z<a.length;z++){
				System.out.print(a[z]+",");
			}
			System.out.println("");
		}
	}
}
