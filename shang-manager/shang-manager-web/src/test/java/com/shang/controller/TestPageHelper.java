package com.shang.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shang.mapper.TbItemMapper;
import com.shang.pojo.TbItem;
import com.shang.pojo.TbItemExample;

public class TestPageHelper {
	@Test
	public void testPageHelper(){
		//创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//从spring容器中获得mapper的代理对象 
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//执行查询，并分页
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(3, 10);
		List<TbItem> list = mapper.selectByExample(example);
		
		//取商品列表
		for(TbItem i : list){
			System.out.println(i.getTitle());
		}
		//取分页信息
		PageInfo<TbItem> pageinfo = new PageInfo<>(list);
		long total = pageinfo.getTotal();
		System.out.println("共有商品"+total);
	}
}
