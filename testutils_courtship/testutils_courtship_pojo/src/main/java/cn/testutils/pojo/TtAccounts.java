package cn.testutils.pojo;

import java.io.Serializable;

public class TtAccounts implements Serializable {
    private Integer aId;

    private String aAccountEmail;

    private String aPasswd;

    private String aAccountPhone;

    private String aName;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaAccountEmail() {
        return aAccountEmail;
    }

    public void setaAccountEmail(String aAccountEmail) {
        this.aAccountEmail = aAccountEmail == null ? null : aAccountEmail.trim();
    }

    public String getaPasswd() {
        return aPasswd;
    }

    public void setaPasswd(String aPasswd) {
        this.aPasswd = aPasswd == null ? null : aPasswd.trim();
    }

    public String getaAccountPhone() {
        return aAccountPhone;
    }

    public void setaAccountPhone(String aAccountPhone) {
        this.aAccountPhone = aAccountPhone == null ? null : aAccountPhone.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }
}