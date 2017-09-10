package mineAlgorithm;

public class BirthdayCandle {
	
	public void doBirthdayCandle() {
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = i; j < 100; j++) {
				sum += j;
				if(sum == 236) {
					System.out.println(i);
				}
			}
//			每次循环后清除sum，防止sum叠加
			sum = 0;
		}
	}
	
	public static void main(String[] args) {
		BirthdayCandle bc = new BirthdayCandle();
		bc.doBirthdayCandle();
	}

}
