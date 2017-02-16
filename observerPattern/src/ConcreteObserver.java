/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * Created by codingBoy on 17/2/16.
 */
public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observerState;

    //目标的状态，从目标处获取
    private String subjectState;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        subjectState = ((ConcreteSubject) subject).getSubjectState();
        System.out.println(subjectState + "," + observerState);

    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

}
