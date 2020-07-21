/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:10
 */
package com.example.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.vo.SerchVo;
import com.example.test.mapper.TMeetingMapper;
import com.example.test.model.TMeeting;
import com.example.test.service.TMeetingService;
import com.example.test.stucks.PageUtil;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class TMeetingServiceImpl extends ServiceImpl<TMeetingMapper,TMeeting> implements TMeetingService {
    @Resource
    private TMeetingMapper tMeetingMapper;
    @Override
    public PageUtil<TMeeting> getAll(Integer pageNum,Integer pageSize,SerchVo serchVo) {
        Page<TMeeting> page = new Page<>(pageNum,pageSize);
        QueryWrapper<TMeeting> wrapper = new QueryWrapper<>();
        if (Objects.nonNull(serchVo)){
            String code = serchVo.getCode();
            if (Strings.isEmpty(code)){
                wrapper.eq("code",code);
            }
            String name = serchVo.getName();
            if (Strings.isEmpty(name)){
                wrapper.like("name",name);
            }
            String statue = serchVo.getStatue();
            if (Strings.isEmpty(statue)){
                wrapper.eq("statue",statue);
            }
        }
        page = baseMapper.selectPage(page, wrapper);
//        Page<TMeeting> tMeetingPage = baseMapper.selectPage(null, null);

        return new PageUtil<>(page.getRecords(),page.getTotal());
    }
}
