/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:11
 */
package com.example.test.controller;

import com.example.test.vo.SerchVo;
import com.example.test.model.TMeeting;
import com.example.test.service.TMeetingService;
import com.example.test.stucks.PageUtil;
import com.example.test.stucks.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class TMeetingController {
    @Resource
    private TMeetingService tMeetingService;

    @RequestMapping("/getAll")
    public PageUtil<TMeeting> list(Integer pageNum, Integer pageSize/*, @RequestBody SerchVo serchVo*/){
        PageUtil<TMeeting> all = tMeetingService.getAll(pageNum, pageSize, null);
        return all;
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TMeeting tMeeting){
        boolean update = tMeetingService.updateById(tMeeting);

        if (update){
            return Result.ok();
        }
        return new Result(500,"error");
    }
    @RequestMapping("/add")
    public Result add(@RequestBody TMeeting tMeeting){
        boolean save = tMeetingService.save(tMeeting);

        if (save){
            return Result.ok();
        }
        return new Result(500,"error");
    }
    @RequestMapping("/delete")
    public Result delete(@RequestBody TMeeting tMeeting){
        boolean delete = tMeetingService.removeById(tMeeting);

        if (delete){
            return Result.ok();
        }
        return new Result(500,"error");
    }
}
