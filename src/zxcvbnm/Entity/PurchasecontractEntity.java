package zxcvbnm.Entity;
/**
 * ������ͬʵ����
 * @author л�鲨
 *
 */
public class PurchasecontractEntity {
	//������ͬid
	private int purchaseContract_id;
	//ҵ��Ա(ҵ��Աʵ����)
	private SalesmanEntity salesman_id;
	//��ע
	private String purReamk;
	//���ʽ1 �ֽ� 0 ���п�
	private int paymentMethod;
	//�׸���
	private double purMoney;
	//ʵ�۷���
	private double actualPrice;
	//���ҳ��� ���㷽�������ҳ���=����Ķ��/�����ܶ�
	private double restrictedMortgages;
	//�̴����
	private double comLoanMoney;
	//�̴����޵�λ����
	private String comLoanTime;
	//��������
	private float accFund;
	//����������
	private int accFundTime;
	//����������(����������ʵ����)
	private BankEntity accFundBank;
	//�̴�����(�̴�����ʵ����)
	private BankEntity comLoanBank;
	//�ͻ�(�ͻ�ʵ����)
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
