package zxcvbnm.Entity;
/**
 * 楼盘实体类
 * @author 谢洪波
 *
 */
public class HousesEntity {
	//楼盘id
	private int houses_id;
	//楼盘名称
	private String houses_name;
	//所在区域
	private String area;
	//规划套数
	private int houseNumber;
	//车位数量
	private int stallNumber;
	//总建筑面积单位:平方
	private double grossArea;
	//装修状态(装修状态实体类)
	private DecoratestateEntity decorateState_id;
	//竣工时间
	private String timeCompleted;
	//开盘时间
	private String timeOpening;
	//总占地面积 单位:平方
	private double totalFloorArea;
	//楼盘介绍
	private String houreamk;
	public int getHouses_id() {
		return houses_id;
	}
	public void setHouses_id(int houses_id) {
		this.houses_id = houses_id;
	}
	public String getHouses_name() {
		return houses_name;
	}
	public void setHouses_name(String houses_name) {
		this.houses_name = houses_name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getStallNumber() {
		return stallNumber;
	}
	public void setStallNumber(int stallNumber) {
		this.stallNumber = stallNumber;
	}
	public double getGrossArea() {
		return grossArea;
	}
	public void setGrossArea(double grossArea) {
		this.grossArea = grossArea;
	}
	public DecoratestateEntity getDecorateState_id() {
		return decorateState_id;
	}
	public void setDecorateState_id(DecoratestateEntity decorateState_id) {
		this.decorateState_id = decorateState_id;
	}
	public String getTimeCompleted() {
		return timeCompleted;
	}
	public void setTimeCompleted(String timeCompleted) {
		this.timeCompleted = timeCompleted;
	}
	public String getTimeOpening() {
		return timeOpening;
	}
	public void setTimeOpening(String timeOpening) {
		this.timeOpening = timeOpening;
	}
	public double getTotalFloorArea() {
		return totalFloorArea;
	}
	public void setTotalFloorArea(double totalFloorArea) {
		this.totalFloorArea = totalFloorArea;
	}
	public String getHoureamk() {
		return houreamk;
	}
	public void setHoureamk(String houreamk) {
		this.houreamk = houreamk;
	}
}
