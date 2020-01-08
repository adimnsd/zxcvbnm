package zxcvbnm.Entity;
/**
 * 户型表实体类
 * @author 谢洪波
 *
 */
public class FamilytableEntity {
	//户型id
	private int familytable_id;
	//户型套型
	private String familyTableS;
	//客厅数量
	private int drawing;
	//阳台数量
	private int balcony;
	//储藏室数量
	private int storeroom;
	//阁楼数量
	private int attic;
	//卧室数量
	private int bedroom;
	//卫生间数量
	private int toilet;
	//入户花园数量
	private int garden;
	//厨房数量
	private int kitchen;
	//备注
	private String table_reamk;
	//房款总价
	private double housePayment;
	//每平方价格
	private double unitPrice;
	public int getFamilytable_id() {
		return familytable_id;
	}
	public void setFamilytable_id(int familytable_id) {
		this.familytable_id = familytable_id;
	}
	public String getFamilyTableS() {
		return familyTableS;
	}
	public void setFamilyTableS(String familyTableS) {
		this.familyTableS = familyTableS;
	}
	public int getDrawing() {
		return drawing;
	}
	public void setDrawing(int drawing) {
		this.drawing = drawing;
	}
	public int getBalcony() {
		return balcony;
	}
	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}
	public int getStoreroom() {
		return storeroom;
	}
	public void setStoreroom(int storeroom) {
		this.storeroom = storeroom;
	}
	public int getAttic() {
		return attic;
	}
	public void setAttic(int attic) {
		this.attic = attic;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getToilet() {
		return toilet;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public int getGarden() {
		return garden;
	}
	public void setGarden(int garden) {
		this.garden = garden;
	}
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}
	public String getTable_reamk() {
		return table_reamk;
	}
	public void setTable_reamk(String table_reamk) {
		this.table_reamk = table_reamk;
	}
	public double getHousePayment() {
		return housePayment;
	}
	public void setHousePayment(double housePayment) {
		this.housePayment = housePayment;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
