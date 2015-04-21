package test;

public class Main {

	private Integer i;
	
	public static void main(String[] args) {
		String s="123456789";
		String string = "南京大学";
		System.out.println(s.charAt(2));
		System.out.println(string.charAt(2));
		
	}
	
	public int maxSubSum(int[] a){
		int maxSum = 0;
		int thisSum = 0;
		for(int i=0;i<a.length;i++){
			thisSum = thisSum + a[i];
			if(thisSum > maxSum){
				maxSum = thisSum;
			}else {
				thisSum = 0;
			}
		}
		return maxSum;
	}
}
