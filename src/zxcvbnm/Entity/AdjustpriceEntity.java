package zxcvbnm.Entity;
/**
 * �۸������ʵ����
 * @author л�鲨
 *
 */
public class AdjustpriceEntity {
	//������id
	private int adjustprice_id;
	//����ʱ��
	private String adTime;
	//��������Ա
	private AdminEntity admin_id;
	//�������� 1:����ͳһ��׼ 0:��ͬ����
	private int adType;
	//ԭ��
	private double originalCost;
	//�ּ�
	private double currentPrice;
	public int getAdjustprice_id() {
		return adjustprice_id;
	}
	public void setAdjustprice_id(int adjustprice_id) {
		this.adjustprice_id = adjustprice_id;
	}
	public String getAdTime() {
		return adTime;
	}
	public void setAdTime(String adTime) {
		this.adTime = adTime;
	}
	public AdminEntity getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(AdminEntity admin_id) {
		this.admin_id = admin_id;
	}
	public int getAdType() {
		return adType;
	}
	public void setAdType(int adType) {
		this.adType = adType;
	}
	public double getOriginalCost() {
		return originalCost;
	}
	public void setOriginalCost(double originalCost) {
		this.originalCost = originalCost;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
}
