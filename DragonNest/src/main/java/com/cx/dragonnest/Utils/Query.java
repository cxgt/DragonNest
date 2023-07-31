package com.cx.dragonnest.Utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Map;

/**
 * @author chenxin
 * @date 2023/07/19 17:30
 */
public class Query<T> {
	public static final String PAGE = "page";
	public static final String LIMIT = "limit";
	public static final String ORDER_FIELD = "sidx";
	public static final String ORDER = "order";
	public static final String ASC = "asc";

	public Query() {
	}

	public IPage<T> getPage(Map<String, Object> params) {
		return this.getPage(params, (String)null, false);
	}

	public IPage<T> getPage(Map<String, Object> params, String defaultOrderField, boolean isAsc) {
		long curPage = 1L;
		long limit = 10L;
		if (params.get("page") != null) {
			curPage = (long)(Integer)params.get("page");
		}

		if (params.get("limit") != null) {
			limit = (long)(Integer)params.get("limit");
		}

		Page<T> page = new Page(curPage, limit);
		params.put("page", page);
		String orderField = SQLFilter.sqlInject((String)params.get("sidx"));
		String order = (String)params.get("order");
		if (StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(order)) {
			return "asc".equalsIgnoreCase(order) ? page.addOrder(new OrderItem[]{OrderItem.asc(orderField)}) : page.addOrder(new OrderItem[]{OrderItem.desc(orderField)});
		} else if (StringUtils.isEmpty(defaultOrderField)) {
			return page;
		} else {
			if (isAsc) {
				page.addOrder(new OrderItem[]{OrderItem.asc(defaultOrderField)});
			} else {
				page.addOrder(new OrderItem[]{OrderItem.desc(defaultOrderField)});
			}

			return page;
		}
	}
}
