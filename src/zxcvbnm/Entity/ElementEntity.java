package zxcvbnm.Entity;
/**
 * С����Ԫʵ����
 * @author л�鲨
 *
 */
public class ElementEntity {
	//С����Ԫid
	private int element_id;
	//������Ŀ
	private HousesEntity houses_Id;
	//��Ԫ����
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
