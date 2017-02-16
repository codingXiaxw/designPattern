/**
 * 这是一个观察者接口，定义一个更新的借口给那些在目标发生改变的时候被通知的对象
 * Created by codingBoy on 17/2/16.
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    void update(Subject subject);
}
