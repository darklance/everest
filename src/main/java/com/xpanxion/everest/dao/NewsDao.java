package com.xpanxion.everest.dao;

import java.util.List;

public interface NewsDao {
	
	/**
	 * 
	 * @param keywords
	 * @return
	 */
	List<String> getNews(List<String> keywords);
}
