package com.wwl.storage.mappers;

import com.wwl.entity.GroupsAppendTrain;

public interface GroupsAppendTrainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer gATrainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    int insert(GroupsAppendTrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    int insertSelective(GroupsAppendTrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    GroupsAppendTrain selectByPrimaryKey(Integer gATrainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupsAppendTrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_append_train
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupsAppendTrain record);
}