package com.cx.dragonnest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.dragonnest.entity.InfoNbrUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxin
 * @date 2023/06/30 10:57
 */
public interface InfoNbrUserService extends IService<InfoNbrUser> {
	List<InfoNbrUser> queryAllInfoNbrUser();
}
