package com.example.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.vo.SerchVo;
import com.example.test.model.TMeeting;
import com.example.test.stucks.PageUtil;

public interface TMeetingService extends IService<TMeeting> {
    PageUtil<TMeeting> getAll(Integer pageNum,Integer pageSize,SerchVo serchVo);

}
