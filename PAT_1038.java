import java.util.ArrayList;

import java.util.Scanner;


public class PAT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int geshu = in.nextInt();
		int []arr = new int[geshu];

		for(int i=0;i<geshu;i++){
			arr[i] = in.nextInt();
		}
		int querygeshu = in.nextInt();
		int []brr = new int[querygeshu];
		for(int i=0;i<querygeshu;i++){
			brr[i] = in.nextInt();
			
		}
		for(int i=0;i<querygeshu;i++){
			int count = 0;
			for(int j=0;j<geshu;j++){
				if(arr[j]==brr[i]){
					count++;
				}
			}
			if(i<querygeshu-1){
			System.out.print(count+" ");
			}
			else{
			System.out.print(count);
		}
		}
		//sad
	}

}
