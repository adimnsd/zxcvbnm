package com.sale.dao;

import java.util.List;

import com.sale.entity.FinancingProduct;

public interface FinancingProductDao {
	/**
	 * ��ѯ������Ϣ
	 * @param id
	 * @param risk
	 * @return
	 */
	public List<FinancingProduct> getMain(String id,int risk);
	
	/**
	 * ������Ϣ
	 * @param financingProduct
	 * @return
	 */
	public int getXz(FinancingProduct financingProduct);
	
	/**
	 * �޸���Ϣ
	 * @param financingProduct
	 * @return
	 */
	public int getXg(FinancingProduct financingProduct);
	
	/**
	 * ɾ��
	 * @param id
	 * @return
	 */
	public int getSc(String id);
}
