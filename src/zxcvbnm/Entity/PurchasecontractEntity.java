package zxcvbnm.Entity;
/**
 * 购房合同实体类
 * @author 谢洪波
 *
 */
public class PurchasecontractEntity {
	//购房合同id
	private int purchaseContract_id;
	//业务员(业务员实体类)
	private SalesmanEntity salesman_id;
	//备注
	private String purReamk;
	//付款方式1 现金 0 银行卡
	private int paymentMethod;
	//首付款
	private double purMoney;
	//实售房款
	private double actualPrice;
	//按揭成数 计算方法：按揭成数=贷款的额度/房款总额
	private double restrictedMortgages;
	//商贷金额
	private double comLoanMoney;
	//商贷年限单位：年
	private String comLoanTime;
	//公积金金额
	private float accFund;
	//公积金年限
	private int accFundTime;
	//公积金银行(公积金银行实体类)
	private BankEntity accFundBank;
	//商贷银行(商贷银行实体类)
	private BankEntity comLoanBank;
	//客户(客户实体类)
	private CustomertableEntity customerTable_id;
	public int getPurchaseContract_id() {
		return purchaseContract_id;
	}
	public void setPurchaseContract_id(int purchaseContract_id) {
		this.purchaseContract_id = purchaseContract_id;
	}
	public SalesmanEntity getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(SalesmanEntity salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getPurReamk() {
		return purReamk;
	}
	public void setPurReamk(String purReamk) {
		this.purReamk = purReamk;
	}
	public int getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getPurMoney() {
		return purMoney;
	}
	public void setPurMoney(double purMoney) {
		this.purMoney = purMoney;
	}
	public double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}
	public double getRestrictedMortgages() {
		return restrictedMortgages;
	}
	public void setRestrictedMortgages(double restrictedMortgages) {
		this.restrictedMortgages = restrictedMortgages;
	}
	public double getComLoanMoney() {
		return comLoanMoney;
	}
	public void setComLoanMoney(double comLoanMoney) {
		this.comLoanMoney = comLoanMoney;
	}
	public String getComLoanTime() {
		return comLoanTime;
	}
	public void setComLoanTime(String comLoanTime) {
		this.comLoanTime = comLoanTime;
	}
	public float getAccFund() {
		return accFund;
	}
	public void setAccFund(float accFund) {
		this.accFund = accFund;
	}
	public int getAccFundTime() {
		return accFundTime;
	}
	public void setAccFundTime(int accFundTime) {
		this.accFundTime = accFundTime;
	}
	public BankEntity getAccFundBank() {
		return accFundBank;
	}
	public void setAccFundBank(BankEntity accFundBank) {
		this.accFundBank = accFundBank;
	}
	public BankEntity getComLoanBank() {
		return comLoanBank;
	}
	public void setComLoanBank(BankEntity comLoanBank) {
		this.comLoanBank = comLoanBank;
	}
	public CustomertableEntity getCustomerTable_id() {
		return customerTable_id;
	}
	public void setCustomerTable_id(CustomertableEntity customerTable_id) {
		this.customerTable_id = customerTable_id;
	}
}
