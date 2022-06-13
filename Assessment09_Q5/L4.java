package Assessment09_Q5;

public class L4 extends Car implements Temp {

	@Override
	public int getTempGage() {
		return this.getDistance() / 10 * 4;
	}

	@Override
	public void go(int distance) {
		int temp = this.getOilSize();
		double spendOil = (double)distance/4;
		
		if(temp >= spendOil) {
			temp = temp - (int)spendOil;
			this.setOilSize(temp);
			
			int dist = this.getDistance();
			this.setDistance(dist + distance);
		}
		else {
			System.out.println("Not enough Oil..!");
		}
	}

	@Override
	public void setOil(int oilSize) {
		int temp = this.getOilSize();
		int maxOilSize = this.getOilTank();
		if(temp + oilSize> this.getOilTank())
			this.setOilSize(getOilTank());
		else {
			temp = temp + oilSize;
			this.setOilSize(temp);
		}
	}

}
