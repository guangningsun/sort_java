
public class MergeSort {
	public int[] mergeArray(int[]a,int first,int mid ,int last,int []tmp){
		int i= first;
		int j= mid + 1;
		int k=0;
		while(i<mid&&j<last){
			if(a[i]<a[j]){
				tmp[k++]=a[i++];
			}else{
				tmp[k++]=a[j++];
			}
		}
		while(i<mid){
			tmp[k++]=a[i++];
		}
		while(j<=last){
			tmp[k++]=a[j++];
		}
		for(int z=0;z<k;z++){
			a[first+z]=tmp[z];
		}
		return a;
	}
	public void  mergeSort(int []a,int first,int last,int tmp[]){
		if(first<last){
			int mid = (first+last)/2;
			mergeSort(a,first,mid,tmp);
			mergeSort(a,mid+1,last,tmp);
			mergeArray(a,first,mid,last,tmp);
		}
	}
	public int[] merge(int [] a){
		int [] p = new int [a.length];
		if(p.length<=0)
			return null;
		mergeSort(a,0,a.length-1,p);
		return a;
	}
}
