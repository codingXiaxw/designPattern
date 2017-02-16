package code3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

public class Test {

	/**
	 * JDK��̬���������
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  �������
		 * interfaces  ʵ�ֽӿ�
		 * h InvocationHandler
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
												cls.getInterfaces(), h);
		m.move();
	}

}
