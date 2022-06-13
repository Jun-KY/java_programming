package Assessment09_Q5;
// - name: String
// - engineSize: String
// - oilTank:int // Oil Tank size
// - oilSize: int // ���� ������ oil ��
//distance: int // ����Ÿ�

// method
// go(distance:itn):void // ����
// setOil(oilSize:int):void // ����
// get XXX
// set XXX
public abstract class Car {
	private String name;
	private String engineSize;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	public abstract void go(int distance);
	public abstract void setOil(int oilSize);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return  getName() + getEngineSize() + "\t\t" + getOilTank()
				+ "\t\t" + getOilSize() + "\t\t" + getDistance() + "";
	}
	
}
