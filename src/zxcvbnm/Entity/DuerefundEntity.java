package zxcvbnm.Entity;
/**
 * �˶�����ʵ����
 * @author л�鲨
 *
 */
public class DuerefundEntity {
	//�˶�����id
	private int dueRefund_id;
	//�˶�ҵ��Ա
	private SalesmanEntity salesman_id;
	//�˶�����
	private String unReason;
	//�˶��ͻ�()
	private CustomertableEntity customerTable_id;
	//�˶�����
	private DueorderEntity dueOrder_id;
	public DueorderEntity getDueOrder_id() {
		return dueOrder_id;
	}
	public void setDueOrder_id(DueorderEntity dueOrder_id) {
		this.dueOrder_id = dueOrder_id;
	}
	public int getDueRefund_id() {
		return dueRefund_id;
	}
	public void setDueRefund_id(int dueRefund_id) {
		this.dueRefund_id = dueRefund_id;
	}
	public SalesmanEntity getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(SalesmanEntity salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getUnReason() {
		return unReason;
	}
	public void setUnReason(String unReason) {
		this.unReason = unReason;
	}
	public CustomertableEntity getCustomerTable_id() {
		return customerTable_id;
	}
	public void setCustomerTable_id(CustomertableEntity customerTable_id) {
		this.customerTable_id = customerTable_id;
	}
}
