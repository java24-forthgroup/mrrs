package com.woniuxy.service;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Schedule;

import java.util.List;

/**
 * @auther: 秦浦华
 * @DATE: 2020/3/31   19:39
 */
public interface ScheduleService {
    int countAll(PageBean pageBean);

    List<Schedule> findAllByPage(PageBean pageBean);
    List<Schedule> findAll();
    void delete(int scheduleId);
    void save(Schedule schedule);
    Schedule findOne(int scheduleId);
    void update (Schedule schedule);
    List<Schedule> findAllByPageBean(PageBean pageBean);
}