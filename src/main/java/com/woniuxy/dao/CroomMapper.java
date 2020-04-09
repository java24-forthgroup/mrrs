package com.woniuxy.dao;

import com.woniuxy.pojo.Croom;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.example.CroomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int countByExample(CroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int deleteByExample(CroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int deleteByPrimaryKey(Integer croomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int insert(Croom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int insertSelective(Croom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    List<Croom> selectByExample(CroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    Croom selectByPrimaryKey(Integer croomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") Croom record, @Param("example") CroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int updateByExample(@Param("record") Croom record, @Param("example") CroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int updateByPrimaryKeySelective(Croom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table croom
     *
     * @mbggenerated Thu Mar 26 16:26:36 CST 2020
     */
    int updateByPrimaryKey(Croom record);
    
    
	List<Croom> selectByPage(PageBean<Croom> pageBean);

	int countAll(PageBean<Croom> pageBean);

    
    
    
}