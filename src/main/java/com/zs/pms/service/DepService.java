package com.zs.pms.service;

import java.util.List;

import com.zs.pms.po.TDep;

public interface DepService {

	// 根据上级部门获取下级部门pid
	public List<TDep> queryByPid(int pid);

}
