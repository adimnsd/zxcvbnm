package zxcvbnm.Entity;
/**
 * 房屋信息表
 * @author 谢洪波
 *
 */
public class HometableEntity {
	//房屋信息表id
	private int homeTable_id;
	//小区单元(小区单元实体类)
	private ElementEntity element_id;
	//所在楼层
	private int floor;
	//装修状态(状态状态实体类)
	private DecoratestateEntity decorateState_id;
	//用途
	private String purpose;
	//占地面积 单位:平方
	private double floorSpace;
	//销售建筑面积 单位:平方
	private double SalesFloorSpace;
	//实际面积 单位:平方
	private double actualArea;
	//公摊面积 单位:平方
	private double residentialArea;
	//销售状态(销售状态实体类)
	private HomestateEntity homestate_id;
	//房屋户型(房屋户型实体类)
	private FamilytableEntity familyTable_id;
	public int getHomeTable_id() {
		return homeTable_id;
	}
	public void setHomeTable_id(int homeTable_id) {
		this.homeTable_id = homeTable_id;
	}
	public ElementEntity getElement_id() {
		return element_id;
	}
	public void setElement_id(ElementEntity element_id) {
		this.element_id = element_id;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public DecoratestateEntity getDecorateState_id() {
		return decorateState_id;
	}
	public void setDecorateState_id(DecoratestateEntity decorateState_id) {
		this.decorateState_id = decorateState_id;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getFloorSpace() {
		return floorSpace;
	}
	public void setFloorSpace(double floorSpace) {
		this.floorSpace = floorSpace;
	}
	public double getSalesFloorSpace() {
		return SalesFloorSpace;
	}
	public void setSalesFloorSpace(double salesFloorSpace) {
		SalesFloorSpace = salesFloorSpace;
	}
	public double getActualArea() {
		return actualArea;
	}
	public void setActualArea(double actualArea) {
		this.actualArea = actualArea;
	}
	public double getResidentialArea() {
		return residentialArea;
	}
	public void setResidentialArea(double residentialArea) {
		this.residentialArea = residentialArea;
	}
	public HomestateEntity getHomestate_id() {
		return homestate_id;
	}
	public void setHomestate_id(HomestateEntity homestate_id) {
		this.homestate_id = homestate_id;
	}
	public FamilytableEntity getFamilyTable_id() {
		return familyTable_id;
	}
	public void setFamilyTable_id(FamilytableEntity familyTable_id) {
		this.familyTable_id = familyTable_id;
	}
}
