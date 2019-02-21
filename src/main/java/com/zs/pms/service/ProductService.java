package com.zs.pms.service;

import java.util.List;

import com.zs.pms.exception.AppException;
import com.zs.pms.po.TProduct;

public interface ProductService {
	
	public List<TProduct> queryByAll();
	public TProduct queryById(int id);
	public int insert(TProduct product)throws AppException;
	public void update(TProduct product) throws AppException;
	public void deleteById(int id);
	public void deleteByIds(int[] ids);

}
