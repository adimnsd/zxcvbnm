package com.rpt.dao;

import java.util.List;

import com.rpt.entity.rpt;

public interface rptDao {
	
	/**
	 * ��
	 * @return
	 */
	public int addSinvestigate(rpt obj);
	
	/**
	 * ��
	 * @param chk
	 * @return
	 */
	public List<rpt> findSInv(String chk,int id);
	
	/**
	 * ɾ
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * ��
	 * @param id
	 * @return
	 */
	public int revision(rpt obj);
}
