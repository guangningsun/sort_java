import java.util.Random;

public class ShellSort {
	public static int[] shellSort(int a[]) {

		return null;
	}

	public static void main(String[] args) {
		Random r = new Random(100);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			a[i] = Math.abs(r.nextInt()) % 100;
		}
		System.out.println("Դ����Ϊ��");
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + ",");
		}
		int b[] = shellSort(a);
		System.out.println("����������Ϊ��");
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + ",");
		}
	}

}
