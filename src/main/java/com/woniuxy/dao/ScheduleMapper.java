package com.woniuxy.dao;

import com.woniuxy.pojo.Schedule;
import com.woniuxy.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther: 秦浦华
 * @DATE: 2020/3/31   19:39
 */
@Mapper
public interface ScheduleMapper {
    int countAll(PageBean pageBean);
    List<Schedule> findAllByPage(PageBean pageBean);
    List<Schedule> findAll();
    void delete(int scheduleId);
    void save(Schedule schedule);
    Schedule findOne(int scheduleId);
    void update (Schedule schedule);
    List<Schedule> findAllByPageBean(PageBean pageBean);
}