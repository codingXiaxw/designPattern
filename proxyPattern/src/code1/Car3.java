package code1;

public class Car3 implements Moveable {

	public Car3(Car car) {
		super();
		this.car = car;
	}

	private Car car;
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺" 
				+ (endtime - starttime) + "���룡");
	}

}
