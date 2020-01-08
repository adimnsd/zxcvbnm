package zxcvbnm.Entity;
/**
 * 装修状态实体类
 * @author 谢洪波
 *
 */
public class DecoratestateEntity {
	//装修状态id
	private int department_id;
	//装修状态 1：精装房 2：简装房 3：毛坯房 4：豪华房
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
