package zxcvbnm.Entity;
/**
 * 员工表实体类
 * @author 谢洪波
 *
 */
public class SalesmanEntity {
	//员工id
	private int salesman_id;
	//员工姓名
	private String salesman_name;
	//员工所在部门(部门实体类)
	private DepartmentEntity department_id;
	//入职时间
	private String saleTime;
	//手机号码
	private String salePhone;
	//备注
	private String salereamk;
	//性别1男 0女
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
