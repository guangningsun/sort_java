
public class SelectSort {
	public int [] selectSort(int []list){
		int min=0;
		for(int i=0;i<list.length;i++){
			min = i;
			for(int j=i+1;j<list.length;j++){
				if(list[min]>list[j]){
					min =j;
				}
			}
			if(min!=i){
				int tmp = list[i];
				list[i]= list[min];
				list[min]=tmp;
			}
		}
		return list;
	}
}
