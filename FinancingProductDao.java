package com.sale.dao;

import java.util.List;

import com.sale.entity.FinancingProduct;

public interface FinancingProductDao {
	/**
	 * 查询所有信息
	 * @param id
	 * @param risk
	 * @return
	 */
	public List<FinancingProduct> getMain(String id,int risk);
	
	/**
	 * 新增信息
	 * @param financingProduct
	 * @return
	 */
	public int getXz(FinancingProduct financingProduct);
	
	/**
	 * 修改信息
	 * @param financingProduct
	 * @return
	 */
	public int getXg(FinancingProduct financingProduct);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int getSc(String id);
}
