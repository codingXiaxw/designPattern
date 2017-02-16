/*
 * ���ü̳з�ʽ�Ĳ���������
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		System.out.print("�����̳�������");
		this.powerWithTwo();

	}

}
