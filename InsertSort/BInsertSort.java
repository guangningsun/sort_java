import java.util.Random;


public class BInsertSort {
	public static void main(String[] args) {
		Random r = new Random(100);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			a[i]= Math.abs(r.nextInt())%100;
		}
		System.out.println("Դ����Ϊ��");
		for(int z=0;z<a.length;z++){
			System.out.print(a[z]+",");
		}
		int b []=bInsertSort(a);
		System.out.println("����������Ϊ��");
		for(int k=0;k<b.length;k++){
			System.out.print(b[k]+",");
		}
	}
	public static int[] bInsertSort(int a[]){
		for(int i=1;i<a.length;i++){//ͬ����Ϊ��һ���������
			if(a[i]<a[i-1]){ //���������е�һ��ֵС�ڻ����������е����һ��ֵ������в�������
				int sentinel; //�����ڱ�
				int low = 0;// ����ɨ���Ե��߽�
				int high = i - 1;//����ɨ���Ե�ұ߽�
				sentinel = a[i];//���ڱ���ֵ
				while (low <= high) {
					int mid = (low + high) / 2;
					if (a[mid] > sentinel) {
						high = mid-1;
					} else {
						low = mid+1;
					}
				}
				//low ��i�������������һλ
				for (int j = i; j > low; j--) {
					a[j] = a[j - 1];
				}
				//���ڱ���ֵ�����ճ�����λ��
				a[low] = sentinel;
			}
			}
		return a;
	}
	public void print(){
		
	}
}
