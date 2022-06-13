package Assessment09_Q5;

public class L1 extends Car implements Temp{

	@Override
	public int getTempGage() {
//		엔진 온도를 리턴한다.
//		10 주행시 엔진온도 1 증가
//		103 > 103 / 10 -> 10도
		return this.getDistance() /10;
	}
	@Override
	public void go(int distance) {
//		10 주행 시 현재 주유량 1 감소
		int temp = this.getOilSize();
		int spendOil = distance / 10;
		if(temp >= spendOil){
			temp = temp - spendOil;
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
		if (temp +oilSize > this.getOilTank()) {
			this.setOilSize(maxOilSize);
//			this.setOilSize(this.getOilTank());

		}
		else {
			temp = temp + oilSize;
			this.setOilSize(temp);
		}
	}

}
