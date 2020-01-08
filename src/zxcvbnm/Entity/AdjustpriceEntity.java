package zxcvbnm.Entity;
/**
 * 价格调整表实体类
 * @author 谢洪波
 *
 */
public class AdjustpriceEntity {
	//调整表id
	private int adjustprice_id;
	//调整时间
	private String adTime;
	//调整管理员
	private AdminEntity admin_id;
	//调整类型 1:基价统一标准 0:相同基价
	private int adType;
	//原价
	private double originalCost;
	//现价
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
