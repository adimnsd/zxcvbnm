package zxcvbnm.Entity;
/**
 * �ͻ���ʵ����
 * @author л�鲨
 *
 */
public class CustomertableEntity {
	//�ͻ�id
	private int customerTable_id;
	//�ͻ�����
	private String customerTableName;
	//���ʱ��
	private String addtime;
	//���ҵ��Ա(ҵ��Աʵ��ͼ��)
	private SalesmanEntity salesman_id;
	//��ע
	private String remake;
	//�ֻ���
	private String phone;
	//֤����
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
