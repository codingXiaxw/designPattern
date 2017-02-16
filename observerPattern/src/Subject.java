import java.util.ArrayList;
import java.util.List;

/**
 * Created by codingBoy on 17/2/16.
 */
public class Subject {
    //用来保存注册的观察者
    private List<Observer> observers = new ArrayList<>();

    //attach dettach observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //删除集合中的指定观察者
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    //通知所有注册的观察者对象
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
