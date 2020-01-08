package zxcvbnm.Entity;
/**
 * 小区单元实体类
 * @author 谢洪波
 *
 */
public class ElementEntity {
	//小区单元id
	private int element_id;
	//所属项目
	private HousesEntity houses_Id;
	//单元名称
	private String element_name;
	public int getElement_id() {
		return element_id;
	}
	public void setElement_id(int element_id) {
		this.element_id = element_id;
	}
	public HousesEntity getHouses_Id() {
		return houses_Id;
	}
	public void setHouses_Id(HousesEntity houses_Id) {
		this.houses_Id = houses_Id;
	}
	public String getElement_name() {
		return element_name;
	}
	public void setElement_name(String element_name) {
		this.element_name = element_name;
	}
}
