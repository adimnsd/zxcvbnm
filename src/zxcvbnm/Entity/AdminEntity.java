package zxcvbnm.Entity;
/**
 * ����Աʵ����
 * @author л�鲨
 *
 */
public class AdminEntity {
	//����Աid
	private int admin_id;
	//����Ա����(�˻�)
	private String admin_Name;
	//����Ա����
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
