package com.wwl.entity;

public class UserMenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_menu.u_menu_id
     *
     * @mbggenerated
     */
    private Integer uMenuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_menu.u_user_id
     *
     * @mbggenerated
     */
    private Integer uUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_menu.u_menu_code
     *
     * @mbggenerated
     */
    private String uMenuCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_menu.u_menu_id
     *
     * @return the value of user_menu.u_menu_id
     *
     * @mbggenerated
     */
    public Integer getuMenuId() {
        return uMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_menu.u_menu_id
     *
     * @param uMenuId the value for user_menu.u_menu_id
     *
     * @mbggenerated
     */
    public void setuMenuId(Integer uMenuId) {
        this.uMenuId = uMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_menu.u_user_id
     *
     * @return the value of user_menu.u_user_id
     *
     * @mbggenerated
     */
    public Integer getuUserId() {
        return uUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_menu.u_user_id
     *
     * @param uUserId the value for user_menu.u_user_id
     *
     * @mbggenerated
     */
    public void setuUserId(Integer uUserId) {
        this.uUserId = uUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_menu.u_menu_code
     *
     * @return the value of user_menu.u_menu_code
     *
     * @mbggenerated
     */
    public String getuMenuCode() {
        return uMenuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_menu.u_menu_code
     *
     * @param uMenuCode the value for user_menu.u_menu_code
     *
     * @mbggenerated
     */
    public void setuMenuCode(String uMenuCode) {
        this.uMenuCode = uMenuCode == null ? null : uMenuCode.trim();
    }
}