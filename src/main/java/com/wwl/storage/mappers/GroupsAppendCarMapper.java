package com.wwl.storage.mappers;

import com.wwl.entity.GroupsAppendCar;

public interface GroupsAppendCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer gACarId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    int insert(GroupsAppendCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    int insertSelective(GroupsAppendCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    GroupsAppendCar selectByPrimaryKey(Integer gACarId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupsAppendCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_car
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupsAppendCar record);
}