package zxcvbnm.Entity;
/**
 * 退订订单实体类
 * @author 谢洪波
 *
 */
public class DuerefundEntity {
	//退订订单id
	private int dueRefund_id;
	//退订业务员
	private SalesmanEntity salesman_id;
	//退订理由
	private String unReason;
	//退订客户()
	private CustomertableEntity customerTable_id;
	//退订订单
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
