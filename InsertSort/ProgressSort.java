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
		p.print(a, "before");
		// ���������������
		BubbleSort bubbleSort = new BubbleSort();
		int b []= bubbleSort.bubbleSort(a);
		p.print(b, "after");
		
	}
	public void print(int a[],String t){
		if(t.equals("after")){
			System.out.println("����������Ϊ��");
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
