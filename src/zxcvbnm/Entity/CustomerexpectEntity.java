package zxcvbnm.Entity;
/**
 * 客户期望表实体类
 * @author 谢洪波
 *
 */
public class CustomerexpectEntity {
	//客户期望表id
	private int customerexpect_id;
	//客户期望单价
	private double cusunit;
	//客户期望户型1
	private FamilytableEntity familytable_id1;
	//客户期望户型2
	private FamilytableEntity familytable_id2;
	//客户期望总价
	private double cusTotal;
	//客户期望楼层
	private int cusFloor;
	//客户备注
	private String cusReamk;
	//客户(客户实体类)
	private CustomertableEntity customertable_id;
	public int getCustomerexpect_id() {
		return customerexpect_id;
	}
	public void setCustomerexpect_id(int customerexpect_id) {
		this.customerexpect_id = customerexpect_id;
	}
	public double getCusunit() {
		return cusunit;
	}
	public void setCusunit(double cusunit) {
		this.cusunit = cusunit;
	}
	public FamilytableEntity getFamilytable_id1() {
		return familytable_id1;
	}
	public void setFamilytable_id1(FamilytableEntity familytable_id1) {
		this.familytable_id1 = familytable_id1;
	}
	public FamilytableEntity getFamilytable_id2() {
		return familytable_id2;
	}
	public void setFamilytable_id2(FamilytableEntity familytable_id2) {
		this.familytable_id2 = familytable_id2;
	}
	public double getCusTotal() {
		return cusTotal;
	}
	public void setCusTotal(double cusTotal) {
		this.cusTotal = cusTotal;
	}
	public int getCusFloor() {
		return cusFloor;
	}
	public void setCusFloor(int cusFloor) {
		this.cusFloor = cusFloor;
	}
	public String getCusReamk() {
		return cusReamk;
	}
	public void setCusReamk(String cusReamk) {
		this.cusReamk = cusReamk;
	}
	public CustomerexpectEntity getCustomertable_id() {
		return customertable_id;
	}
	public void setCustomertable_id(CustomerexpectEntity customertable_id) {
		this.customertable_id = customertable_id;
	}
}
