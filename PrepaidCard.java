package Numerical3;

public abstract class PrepaidCard {
	
		int cardNo;
		double availableBalance;
		double swipeLimit;

		public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
			super();
			this.cardNo = cardNo;
			this.availableBalance = availableBalance;
			this.swipeLimit = swipeLimit;
		}

		public abstract boolean swipeCard(double amount);

		public void rechargeCard(double amount) {
			availableBalance = amount + availableBalance;
			System.out.println("After recharge card available balance = " + availableBalance);

		}

		@Override
		public String toString() {
			return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
					+ "]";
		}

		public int rewards(double amount) {
			return 0;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
