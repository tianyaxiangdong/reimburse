package com.wwl.entity;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.u_role_id
     *
     * @mbggenerated
     */
    private Integer uRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.u_role_name
     *
     * @mbggenerated
     */
    private String uRoleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.u_role_id
     *
     * @return the value of user_role.u_role_id
     *
     * @mbggenerated
     */
    public Integer getuRoleId() {
        return uRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.u_role_id
     *
     * @param uRoleId the value for user_role.u_role_id
     *
     * @mbggenerated
     */
    public void setuRoleId(Integer uRoleId) {
        this.uRoleId = uRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.u_role_name
     *
     * @return the value of user_role.u_role_name
     *
     * @mbggenerated
     */
    public String getuRoleName() {
        return uRoleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.u_role_name
     *
     * @param uRoleName the value for user_role.u_role_name
     *
     * @mbggenerated
     */
    public void setuRoleName(String uRoleName) {
        this.uRoleName = uRoleName == null ? null : uRoleName.trim();
    }
}