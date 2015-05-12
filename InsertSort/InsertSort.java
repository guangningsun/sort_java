import java.util.Random;


public class InsertSort {
	
	public static void main(String[] args) {
		Random r = new Random(100);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			a[i]= Math.abs(r.nextInt())%100;
		}
		System.out.println("源数据为：");
		for(int z=0;z<a.length;z++){
			System.out.print(a[z]+",");
		}
		int b []=insert_sort(a);
		System.out.println("排序后的数据为：");
		for(int k=0;k<b.length;k++){
			System.out.print(b[k]+",");
		}
	}
	public static int [] insert_sort(int a[]){
		int sentinel ,j;
		for(int i=1;i <a.length;i++){
			j=i-1;//工作指针指向有序队列
			sentinel =a[i];//哨兵赋值为无序队列中的第一个值
			while(j>=0&&sentinel<a[j]){//当工作指针未越界，
				a[j+1]=a[j];//当哨兵小于有序队列中的值时，将有序队列中的数字向后移动，直到找到哨兵在有序队列中的位置
				j--;//工作指针向前移动一位
			}
			a[j+1]=sentinel;//将哨兵的值赋给空出来的位置，由于指针会多移动一位，所以j+1为空位置。
		}
		return a;
	}
}
