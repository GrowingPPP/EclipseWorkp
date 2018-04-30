package com.shang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;
import com.shang.common.pojo.EUDataGridResult;
import com.shang.pojo.TbItem;
import com.shang.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemservice;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem geTbItemById(@PathVariable Long itemId){
		TbItem item = itemservice.geTbItemById(itemId);
		return item;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page,Integer rows){
		EUDataGridResult result = itemservice.getItemList(page, rows);
		return result;
	}
}
