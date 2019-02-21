package com.zs.pms.dao;

import java.util.List;

import com.zs.pms.po.TProduct;

public interface ProductDao {
	
	public List<TProduct> queryByAll();
	public TProduct queryById(int id);
	public int insert(TProduct product);
	public void update(TProduct product);
	public void deleteById(int id);
	public void deleteByIds(int[] ids);
	
}
