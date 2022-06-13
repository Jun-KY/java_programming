package Assessment09_Q5;

public class L2 extends Car implements Temp {

	@Override
	public int getTempGage() {
		return this.getDistance() /5;
	}

	@Override
	public void go (int distance) {
//		10 주행 시 현재 주유량 1.5감소
		int temp = this.getOilSize();
		double spendOil = (double)distance/10*1.5;
//		현재 주유량 증가
		if (temp>=spendOil) {
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
		if (temp + oilSize > this.getOilTank()) {
			this.setOilSize(maxOilSize);
		}
		else {
			temp = temp + oilSize;
			this.setOilSize(temp);
		}
	}

}
