package zxcvbnm.Entity;
/**
 * ¥��ʵ����
 * @author л�鲨
 *
 */
public class HousesEntity {
	//¥��id
	private int houses_id;
	//¥������
	private String houses_name;
	//��������
	private String area;
	//�滮����
	private int houseNumber;
	//��λ����
	private int stallNumber;
	//�ܽ��������λ:ƽ��
	private double grossArea;
	//װ��״̬(װ��״̬ʵ����)
	private DecoratestateEntity decorateState_id;
	//����ʱ��
	private String timeCompleted;
	//����ʱ��
	private String timeOpening;
	//��ռ����� ��λ:ƽ��
	private double totalFloorArea;
	//¥�̽���
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
