/**
 *
 * 举天气预报的例子，目标是:天气预报；观察者是需要知道天气预报的人
 * Created by codingBoy on 17/2/16.
 */
public class ClientTest {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //2.创建观察者
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteObserver.setObserverState("观察者适合使用目标");

        //3.注册观察者
        concreteSubject.attach(concreteObserver);

        //4.目标发布天气
        concreteSubject.setSubjectState("目标状态良好");

    }
}
