package com.cx.dragonnest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author chenxin
 * @date 2023/07/20 19:27
 */
@Data
@AllArgsConstructor
public class testForEntity {
	private String name;
	private String number;

	private List<cxEntity> cxEntityList;
}
