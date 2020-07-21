/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:08
 */
package com.example.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.model.TMeeting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TMeetingMapper extends BaseMapper<TMeeting> {
}
