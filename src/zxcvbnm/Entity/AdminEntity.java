package zxcvbnm.Entity;
/**
 * 管理员实体类
 * @author 谢洪波
 *
 */
public class AdminEntity {
	//管理员id
	private int admin_id;
	//管理员姓名(账户)
	private String admin_Name;
	//管理员密码
	private String admin_pwd;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_Name() {
		return admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	
}
