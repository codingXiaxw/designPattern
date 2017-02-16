package code2;

public class CarLogProxy implements Moveable {

	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	
	@Override
	public void move() {
		System.out.println("��־��ʼ....");
		m.move();
		System.out.println("��־����....");
	}

}
