package code1;

public class Car2 extends Car {

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺" 
				+ (endtime - starttime) + "���룡");
	}

	
}
