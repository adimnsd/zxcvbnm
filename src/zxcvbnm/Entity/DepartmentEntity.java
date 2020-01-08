package zxcvbnm.Entity;
/**
 * 部门表实体类
 * @author 谢洪波
 *
 */
public class DepartmentEntity {
	//部门id
	private int department_id;
	//部门名称
	private String dep_name;
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
}
