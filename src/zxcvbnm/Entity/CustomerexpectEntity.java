package zxcvbnm.Entity;
/**
 * �ͻ�������ʵ����
 * @author л�鲨
 *
 */
public class CustomerexpectEntity {
	//�ͻ�������id
	private int customerexpect_id;
	//�ͻ���������
	private double cusunit;
	//�ͻ���������1
	private FamilytableEntity familytable_id1;
	//�ͻ���������2
	private FamilytableEntity familytable_id2;
	//�ͻ������ܼ�
	private double cusTotal;
	//�ͻ�����¥��
	private int cusFloor;
	//�ͻ���ע
	private String cusReamk;
	//�ͻ�(�ͻ�ʵ����)
	private CustomertableEntity customertable_id;
	public int getCustomerexpect_id() {
		return customerexpect_id;
	}
	public void setCustomerexpect_id(int customerexpect_id) {
		this.customerexpect_id = customerexpect_id;
	}
	public double getCusunit() {
		return cusunit;
	}
	public void setCusunit(double cusunit) {
		this.cusunit = cusunit;
	}
	public FamilytableEntity getFamilytable_id1() {
		return familytable_id1;
	}
	public void setFamilytable_id1(FamilytableEntity familytable_id1) {
		this.familytable_id1 = familytable_id1;
	}
	public FamilytableEntity getFamilytable_id2() {
		return familytable_id2;
	}
	public void setFamilytable_id2(FamilytableEntity familytable_id2) {
		this.familytable_id2 = familytable_id2;
	}
	public double getCusTotal() {
		return cusTotal;
	}
	public void setCusTotal(double cusTotal) {
		this.cusTotal = cusTotal;
	}
	public int getCusFloor() {
		return cusFloor;
	}
	public void setCusFloor(int cusFloor) {
		this.cusFloor = cusFloor;
	}
	public String getCusReamk() {
		return cusReamk;
	}
	public void setCusReamk(String cusReamk) {
		this.cusReamk = cusReamk;
	}
	public CustomerexpectEntity getCustomertable_id() {
		return customertable_id;
	}
	public void setCustomertable_id(CustomerexpectEntity customertable_id) {
		this.customertable_id = customertable_id;
	}
}
