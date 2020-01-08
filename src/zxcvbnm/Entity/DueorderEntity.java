package zxcvbnm.Entity;
/**
 * 房屋预定订单实体类
 * @author 谢洪波
 *
 */
public class DueorderEntity {
	//预定订单id
	private int dueOrder_id;
	//预定客户(客户实体类)
	private CustomertableEntity customertable_id;
	//备注
	private String dueReamk;
	//预定时间
	private String dueTime;
	//预定编号
	private String dueSerial;
	//预定类型(预定类型实体类)
	private ReserveEntity reserve_id;
	//定金
	private double dueMoney;
	//预定房屋(预定房屋实体类)
	private HometableEntity hometable_id;
	//预定业务员(预定业务员实体类)
	private SalesmanEntity salesman_id;
	public int getDueOrder_id() {
		return dueOrder_id;
	}
	public void setDueOrder_id(int dueOrder_id) {
		this.dueOrder_id = dueOrder_id;
	}
	public CustomertableEntity getCustomertable_id() {
		return customertable_id;
	}
	public void setCustomertable_id(CustomertableEntity customertable_id) {
		this.customertable_id = customertable_id;
	}
	public String getDueReamk() {
		return dueReamk;
	}
	public void setDueReamk(String dueReamk) {
		this.dueReamk = dueReamk;
	}
	public String getDueTime() {
		return dueTime;
	}
	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}
	public String getDueSerial() {
		return dueSerial;
	}
	public void setDueSerial(String dueSerial) {
		this.dueSerial = dueSerial;
	}
	public ReserveEntity getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(ReserveEntity reserve_id) {
		this.reserve_id = reserve_id;
	}
	public double getDueMoney() {
		return dueMoney;
	}
	public void setDueMoney(double dueMoney) {
		this.dueMoney = dueMoney;
	}
	public HometableEntity getHometable_id() {
		return hometable_id;
	}
	public void setHometable_id(HometableEntity hometable_id) {
		this.hometable_id = hometable_id;
	}
	public SalesmanEntity getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(SalesmanEntity salesman_id) {
		this.salesman_id = salesman_id;
	}
}
