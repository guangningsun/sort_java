
public class ShellSort {
	public int[] shellSort(int a[]) {
		for(int increment = a.length/2;increment>0;increment /=2){
			for(int i=increment; i<a.length;i++){
				int temp = a[i];// ½¨Á¢ÉÚ±ø
				int j = i-increment;
				while(j>=0&&temp<a[j]){
					a[j+increment]=a[j];
					j= j-increment;
				}
				a[j+increment]=temp;
			}
		}
		return a;
	}
}
