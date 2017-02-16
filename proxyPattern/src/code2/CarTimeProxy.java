package code2;

public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺" 
				+ (endtime - starttime) + "���룡");
	}

}
