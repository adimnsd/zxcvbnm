package zxcvbnm.Entity;
/**
 * 客户表实体类
 * @author 谢洪波
 *
 */
public class CustomertableEntity {
	//客户id
	private int customerTable_id;
	//客户姓名
	private String customerTableName;
	//添加时间
	private String addtime;
	//添加业务员(业务员实体图类)
	private SalesmanEntity salesman_id;
	//备注
	private String remake;
	//手机号
	private String phone;
	//证件号
	private String card;
	public int getCustomerTable_id() {
		return customerTable_id;
	}
	public void setCustomerTable_id(int customerTable_id) {
		this.customerTable_id = customerTable_id;
	}
	public String getCustomerTableName() {
		return customerTableName;
	}
	public void setCustomerTableName(String customerTableName) {
		this.customerTableName = customerTableName;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public SalesmanEntity getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(SalesmanEntity salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getRemake() {
		return remake;
	}
	public void setRemake(String remake) {
		this.remake = remake;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}
