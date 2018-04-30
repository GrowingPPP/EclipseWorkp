package com.shang.service;

import com.shang.common.pojo.EUDataGridResult;
import com.shang.pojo.TbItem;

public interface ItemService {
	TbItem geTbItemById(long itemId);
	EUDataGridResult getItemList(int page,int rows);
}
