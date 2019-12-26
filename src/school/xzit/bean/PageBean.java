package school.xzit.bean;

import java.util.List;

public class PageBean {
	
	// 5 个属性
	
	private int currentPage;//当前页
	
	private int totalPage; //总页数
	
	private int size; // 每页显示的记录数
	
	private List<User> list; //显示的数据集合
	
	private int start; //从那一页开始
	
	

}
