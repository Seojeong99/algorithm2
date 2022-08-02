import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main_1244_이서정 {
	static int sn, sw[]; //스위치 개수, 스위치 상태


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sn = sc.nextInt();
		sw = new int[sn+1];
		for(int i=1; i<=sn; i++) {
			sw[i]=sc.nextInt();
		}
		
		int stn = sc.nextInt();
		for(int j=0; j<stn; j++) {
		int gm = sc.nextInt();
		int num = sc.nextInt();
		
		if(gm==1) {
			int index=1;
			for(int i=num; i<sw.length; i=num*index ) {
				index++;
				sw[i] = sw[i]^1;
				System.out.println("i입니다"+i);
				
			}
		}
		if(gm==2) {
			sw[num] = sw[num]^1;
			int i=0;
			while(num-i>=1 && num+i<sw.length) {
				
				if(sw[num-i]==sw[num+i]) {
					sw[num-i] = sw[num-i]^1;
					sw[num+i] = sw[num+i]^1;
					i++;
				}
				else {
					break;
				}
			}
			
		}
		}
		for(int i=1; i<sw.length; i++) {
			System.out.print(sw[i]+" ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}
}
	
