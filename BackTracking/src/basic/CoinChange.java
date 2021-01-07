package basic;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		coinChange(new int[] {2,3,5,6},10,"",0);
		coinChangeP(new int[] {2,3,5,6},10,"");
	}
	public static void coinChange(int denom[],int amount,String ans,int lastDenomIndx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=lastDenomIndx;i<denom.length;i++) {
			if(amount>=denom[i]) {
				coinChange(denom,amount-denom[i],ans+denom[i],i);
			}
		}
	}
	public static void coinChangeP(int denom[],int amount,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<denom.length;i++) {
			if(amount>=denom[i]) {
				coinChangeP(denom,amount-denom[i],ans+denom[i]);
			}
		}
	}
}
