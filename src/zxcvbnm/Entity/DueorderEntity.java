package zxcvbnm.Entity;
/**
 * ����Ԥ������ʵ����
 * @author л�鲨
 *
 */
public class DueorderEntity {
	//Ԥ������id
	private int dueOrder_id;
	//Ԥ���ͻ�(�ͻ�ʵ����)
	private CustomertableEntity customertable_id;
	//��ע
	private String dueReamk;
	//Ԥ��ʱ��
	private String dueTime;
	//Ԥ�����
	private String dueSerial;
	//Ԥ������(Ԥ������ʵ����)
	private ReserveEntity reserve_id;
	//����
	private double dueMoney;
	//Ԥ������(Ԥ������ʵ����)
	private HometableEntity hometable_id;
	//Ԥ��ҵ��Ա(Ԥ��ҵ��Աʵ����)
	private SalesmanEntity salesman_id;
	public int getDueOrder_id() {
		return dueOrder_id;
	}
	public void setDueOrder_id(int dueOrder_id) {
		this.dueOrder_id = dueOrder_id;
	}
	public CustomertableEntity getCustomertable_id() {
		return customertable_id;
	}
	public void setCustomertable_id(CustomertableEntity customertable_id) {
		this.customertable_id = customertable_id;
	}
	public String getDueReamk() {
		return dueReamk;
	}
	public void setDueReamk(String dueReamk) {
		this.dueReamk = dueReamk;
	}
	public String getDueTime() {
		return dueTime;
	}
	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}
	public String getDueSerial() {
		return dueSerial;
	}
	public void setDueSerial(String dueSerial) {
		this.dueSerial = dueSerial;
	}
	public ReserveEntity getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(ReserveEntity reserve_id) {
		this.reserve_id = reserve_id;
	}
	public double getDueMoney() {
		return dueMoney;
	}
	public void setDueMoney(double dueMoney) {
		this.dueMoney = dueMoney;
	}
	public HometableEntity getHometable_id() {
		return hometable_id;
	}
	public void setHometable_id(HometableEntity hometable_id) {
		this.hometable_id = hometable_id;
	}
	public SalesmanEntity getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(SalesmanEntity salesman_id) {
		this.salesman_id = salesman_id;
	}
}
