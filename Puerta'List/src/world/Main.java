package world;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Main theMain = new Main();
		
		Stack<Integer> harrysBag = new Stack<Integer>();
		Stack<Integer> monksBag = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int harryCoins = Integer.parseInt(br.readLine());
		String[] coinsValue = br.readLine().split(" ");
		String[] inst = br.readLine().split(" ");
		
		int monkSum = 0;
		boolean equals = false;


		for(int i = 0; i < harryCoins; i++) {
			harrysBag.push(Integer.parseInt(coinsValue[i]));
		}
		
		for(int i = 0; i < Integer.parseInt(inst[0]) && !equals; i++) {
			
			if(br.readLine().equalsIgnoreCase("Harry")) {
				int deleted = harrysBag.pop().getDate();
				monksBag.push(deleted);
				System.out.println(deleted);
				monkSum += deleted;
			}else {
				int deleted = monksBag.pop().getDate();
				System.out.println(deleted);
				monkSum -= deleted;
			}
			if(monkSum == Integer.parseInt(inst[1])) {
				equals = true;
			}
		}
		if(monkSum != Integer.parseInt(inst[1])) {
			System.out.println(-1);
		}else {
			System.out.println(monksBag.getSize());
		}
		
	}
		
}
