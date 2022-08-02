import java.util.Scanner;

public class Solution_1289_이서정 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		for(int t=0; t<test; t++) {
			String memory = input.next();
			int putmemory[] = new int[memory.length()];
			for(int i=0; i<putmemory.length; i++) {
				putmemory[i]= Character.getNumericValue(memory.charAt(i));
			}
			int count=0;
			if(putmemory[0]==1) {
				count++;
			}
			for(int i=0; i<putmemory.length-1; i++) {
				if(putmemory[i]!=putmemory[i+1]) {
					count++;
				}
			}
			System.out.printf("#%d %d",t+1,count);
			System.out.println();
		}
		

	
	}
}
