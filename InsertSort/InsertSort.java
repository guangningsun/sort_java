import java.util.Random;


public class InsertSort {
	
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
		int b []=insert_sort(a);
		System.out.println("����������Ϊ��");
		for(int k=0;k<b.length;k++){
			System.out.print(b[k]+",");
		}
	}
	public static int [] insert_sort(int a[]){
		int sentinel ,j;
		for(int i=1;i <a.length;i++){
			j=i-1;//����ָ��ָ���������
			sentinel =a[i];//�ڱ���ֵΪ��������еĵ�һ��ֵ
			while(j>=0&&sentinel<a[j]){//������ָ��δԽ�磬
				a[j+1]=a[j];//���ڱ�С����������е�ֵʱ������������е���������ƶ���ֱ���ҵ��ڱ�����������е�λ��
				j--;//����ָ����ǰ�ƶ�һλ
			}
			a[j+1]=sentinel;//���ڱ���ֵ�����ճ�����λ�ã�����ָ�����ƶ�һλ������j+1Ϊ��λ�á�
		}
		return a;
	}
}
