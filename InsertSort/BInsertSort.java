import java.util.Random;


public class BInsertSort {
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
		int b []=bInsertSort(a);
		System.out.println("排序后的数据为：");
		for(int k=0;k<b.length;k++){
			System.out.print(b[k]+",");
		}
	}
	public static int[] bInsertSort(int a[]){
		for(int i=1;i<a.length;i++){//同样认为第一个是有序的
			if(a[i]<a[i-1]){ //如果无序队列第一个值小于或大于有序队列的最后一个值，则进行插入排序
				int sentinel; //声明哨兵
				int low = 0;// 定义扫描边缘左边界
				int high = i - 1;//定义扫描边缘右边界
				sentinel = a[i];//给哨兵赋值
				while (low <= high) {
					int mid = (low + high) / 2;
					if (a[mid] > sentinel) {
						high = mid-1;
					} else {
						low = mid+1;
					}
				}
				//low 到i处数据整体后移一位
				for (int j = i; j > low; j--) {
					a[j] = a[j - 1];
				}
				//将哨兵的值赋给空出来的位置
				a[low] = sentinel;
			}
			}
		return a;
	}
	public void print(){
		
	}
}
