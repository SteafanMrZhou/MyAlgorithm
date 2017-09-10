package mineAlgorithm;

public class CoalballNumber {
	
	
	public void doCoalballNumber() {
		int perSum = 0;
	    int sum = 0;
	    for(int i = 1; i <= 100; i++) {
	    	perSum += i;
	    	sum += perSum;
	    }
	    System.out.println(sum);
	}
	

	public static void main(String[] args) {
		CoalballNumber cn = new CoalballNumber();
		cn.doCoalballNumber();
	}
	
}
