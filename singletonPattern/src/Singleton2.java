/*
 * ����ģʽ
 * ���𣺶���ģʽ���ص��Ǽ�����ʱ�Ƚ�����������ʱ��ȡ������ٶȱȽϿ죬�̰߳�ȫ
 *      ����ģʽ���ص��Ǽ�����ʱ�ȽϿ죬������ʱ��ȡ������ٶȱȽ������̲߳���ȫ
 */
public class Singleton2 {
	//1.�����췽ʽ˽�л������������ֱ�Ӵ�������
	private Singleton2(){
	}
	
	//2.�������Ψһʵ����ʹ��private static����
	private static Singleton2 instance;
	
	//3.�ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static Singleton2 getInstance(){
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}
}
