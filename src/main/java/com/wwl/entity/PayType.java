package com.wwl.entity;

import java.util.Date;

public class PayType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_type.p_type_id
     *
     * @mbggenerated
     */
    private Integer pTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_type.p_type_name
     *
     * @mbggenerated
     */
    private String pTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_type.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_type.createuser
     *
     * @mbggenerated
     */
    private Integer createuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_type.p_type_id
     *
     * @return the value of pay_type.p_type_id
     *
     * @mbggenerated
     */
    public Integer getpTypeId() {
        return pTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_type.p_type_id
     *
     * @param pTypeId the value for pay_type.p_type_id
     *
     * @mbggenerated
     */
    public void setpTypeId(Integer pTypeId) {
        this.pTypeId = pTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_type.p_type_name
     *
     * @return the value of pay_type.p_type_name
     *
     * @mbggenerated
     */
    public String getpTypeName() {
        return pTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_type.p_type_name
     *
     * @param pTypeName the value for pay_type.p_type_name
     *
     * @mbggenerated
     */
    public void setpTypeName(String pTypeName) {
        this.pTypeName = pTypeName == null ? null : pTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_type.createtime
     *
     * @return the value of pay_type.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_type.createtime
     *
     * @param createtime the value for pay_type.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_type.createuser
     *
     * @return the value of pay_type.createuser
     *
     * @mbggenerated
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_type.createuser
     *
     * @param createuser the value for pay_type.createuser
     *
     * @mbggenerated
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }
}