package Assessment09_Q5;

public class L3 extends Car implements Temp {

	@Override
	public int getTempGage() {
//		10 주행 시 엔진 온도 3증가
		return this.getDistance()/10*3;
	}

	@Override
	public void go(int distance) {
//		10 주행 시 현재 주유량 2감소
		int temp = this.getOilSize();
		int spendOil = distance/5;
//		현재 주유량 증가
		if (this.getOilSize()>=spendOil) {
			temp = temp - spendOil;
			this.setOilSize(temp);
			
			int dist = this.getDistance();
			this.setDistance(dist + distance);
		}
		else 
			System.out.println("Not enought Oil..!");
	}

	@Override
	public void setOil(int oilSize) {
		int temp = this.getOilSize();
		int maxOilSize = this.getOilTank();
		if (temp + oilSize> this.getOilTank()) {
			this.setOilSize(maxOilSize);
		}
		else {
			temp = temp + oilSize;
			this.setOilSize(temp);
		}
	}
	

}
