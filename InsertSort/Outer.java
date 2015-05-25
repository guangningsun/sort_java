import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Outer {
		public class Inner{
			int start_time;
			int end_time;
			int kaojiao;
			int meishu;
			int shu;
			
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Integer n = scanner.nextInt();
			Outer out = new Outer();
			ArrayList<Inner> a = new ArrayList<Inner>();
			for(int i=0;i<n;i++){
				Inner b = out.new Inner();
				b.start_time = scanner.nextInt();
				b.end_time = scanner.nextInt();
				a.add(b);
			}
			int tshi=1;
//			Collections.sort(a,out.new Inner().end_time);
			for (Inner inner : a) {
				for(Inner j :a){
					if(!j.equals(inner)){
						if(inner.start_time<=j.start_time&& j.start_time<=inner.end_time){
							tshi = tshi+1;
						}
					}
				}
				
			}
			
		}
}
