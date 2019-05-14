package cn.zzzcr.springboots.dao.model;

import java.util.Date;

public class UserInfoDO {
    private Integer id;

    private String userId;

    private String userAccount;

    private String userName;

    private String userPwd;

    private Byte userType;

    private Byte userStatus;

    private String phoneNum;

    private String address;

    private String remark;

    private Date sysCtime;

    private Date sysUtime;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getSysCtime() {
        return sysCtime;
    }

    public void setSysCtime(Date sysCtime) {
        this.sysCtime = sysCtime;
    }

    public Date getSysUtime() {
        return sysUtime;
    }

    public void setSysUtime(Date sysUtime) {
        this.sysUtime = sysUtime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}