package cn.testutils.pojo;

import java.io.Serializable;

public class TtCourtshipUsingMsg implements Serializable {
    private Integer cuId;

    private String cumPasswd;

    private String cumLevelMsg;

    private static final long serialVersionUID = 1L;

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public String getCumPasswd() {
        return cumPasswd;
    }

    public void setCumPasswd(String cumPasswd) {
        this.cumPasswd = cumPasswd == null ? null : cumPasswd.trim();
    }

    public String getCumLevelMsg() {
        return cumLevelMsg;
    }

    public void setCumLevelMsg(String cumLevelMsg) {
        this.cumLevelMsg = cumLevelMsg == null ? null : cumLevelMsg.trim();
    }
}