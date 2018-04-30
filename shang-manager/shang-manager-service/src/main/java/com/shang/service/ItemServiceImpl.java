package com.shang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shang.common.pojo.EUDataGridResult;
import com.shang.mapper.TbItemMapper;
import com.shang.pojo.TbItem;
import com.shang.pojo.TbItemExample;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	private com.shang.pojo.TbItemExample.Criteria createCriteria;

	@Override
	public TbItem geTbItemById(long itemId) {
		// 根据主键id查询，返回item对象
		// TbItem item = itemMapper.selectByPrimaryKey(itemId);

		// 根据查询条件查询
		TbItemExample example = new TbItemExample();
		// 添加查询条件
		createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}
/**
 * 商品列表查询
 */
	@Override
	public EUDataGridResult getItemList(int page, int  rows) {
		//查询商品列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		//返回查询得到的列表
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageinfo = new PageInfo<>(list);
		result.setTotal(pageinfo.getTotal());
		return result;
		
		
	}

}
