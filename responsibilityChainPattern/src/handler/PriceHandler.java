package handler;

/*
 * �۸����ˣ�������ͻ��ۿ�����
 */
public abstract class PriceHandler {
	
	/*
	 * ֱ�Ӻ�̣����ڴ�������
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	/*
	 * �����ۿ�����
	 */
	public abstract  void processDiscount(float discount);

}
