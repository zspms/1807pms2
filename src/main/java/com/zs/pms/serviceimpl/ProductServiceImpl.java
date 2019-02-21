package com.zs.pms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zs.pms.dao.ProductDao;
import com.zs.pms.exception.AppException;
import com.zs.pms.po.TProduct;
import com.zs.pms.service.ProductService;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	public List<TProduct> queryByAll() {
		// TODO Auto-generated method stub
		return dao.queryByAll();
	}

	public TProduct queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}

	@Transactional(rollbackFor=Exception.class)
	public int insert(TProduct product) throws AppException {
		// TODO Auto-generated method stub
		if ("".equals(product.getPname())) {
			throw new AppException(1003, "名称不能为空");
		}
		dao.insert(product);
		return product.getId();
	}

	@Transactional(rollbackFor=Exception.class)
	public void update(TProduct product) throws AppException {
		// TODO Auto-generated method stub
		if ("".equals(product.getPname())) {
			throw new AppException(1003, "名称不能为空");
		}
		dao.update(product);
	}

	@Transactional(rollbackFor=Exception.class)
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Transactional(rollbackFor=Exception.class)
	public void deleteByIds(int[] ids) {
		// TODO Auto-generated method stub
		dao.deleteByIds(ids);
	}

}
