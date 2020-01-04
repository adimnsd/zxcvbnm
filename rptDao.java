package com.rpt.dao;

import java.util.List;

import com.rpt.entity.rpt;

public interface rptDao {
	
	/**
	 * Ôö
	 * @return
	 */
	public int addSinvestigate(rpt obj);
	
	/**
	 * ²é
	 * @param chk
	 * @return
	 */
	public List<rpt> findSInv(String chk,int id);
	
	/**
	 * É¾
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * ¸Ä
	 * @param id
	 * @return
	 */
	public int revision(rpt obj);
}
