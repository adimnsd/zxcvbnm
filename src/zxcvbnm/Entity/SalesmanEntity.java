package zxcvbnm.Entity;
/**
 * Ա����ʵ����
 * @author л�鲨
 *
 */
public class SalesmanEntity {
	//Ա��id
	private int salesman_id;
	//Ա������
	private String salesman_name;
	//Ա�����ڲ���(����ʵ����)
	private DepartmentEntity department_id;
	//��ְʱ��
	private String saleTime;
	//�ֻ�����
	private String salePhone;
	//��ע
	private String salereamk;
	//�Ա�1�� 0Ů
	private int saleGender;
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getSalesman_name() {
		return salesman_name;
	}
	public void setSalesman_name(String salesman_name) {
		this.salesman_name = salesman_name;
	}
	public DepartmentEntity getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(DepartmentEntity department_id) {
		this.department_id = department_id;
	}
	public String getSaleTime() {
		return saleTime;
	}
	public void setSaleTime(String saleTime) {
		this.saleTime = saleTime;
	}
	public String getSalePhone() {
		return salePhone;
	}
	public void setSalePhone(String salePhone) {
		this.salePhone = salePhone;
	}
	public String getSalereamk() {
		return salereamk;
	}
	public void setSalereamk(String salereamk) {
		this.salereamk = salereamk;
	}
	public int getSaleGender() {
		return saleGender;
	}
	public void setSaleGender(int saleGender) {
		this.saleGender = saleGender;
	}
}
