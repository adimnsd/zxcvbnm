package zxcvbnm.Entity;
/**
 * ������Ϣ��
 * @author л�鲨
 *
 */
public class HometableEntity {
	//������Ϣ��id
	private int homeTable_id;
	//С����Ԫ(С����Ԫʵ����)
	private ElementEntity element_id;
	//����¥��
	private int floor;
	//װ��״̬(״̬״̬ʵ����)
	private DecoratestateEntity decorateState_id;
	//��;
	private String purpose;
	//ռ����� ��λ:ƽ��
	private double floorSpace;
	//���۽������ ��λ:ƽ��
	private double SalesFloorSpace;
	//ʵ����� ��λ:ƽ��
	private double actualArea;
	//��̯��� ��λ:ƽ��
	private double residentialArea;
	//����״̬(����״̬ʵ����)
	private HomestateEntity homestate_id;
	//���ݻ���(���ݻ���ʵ����)
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
