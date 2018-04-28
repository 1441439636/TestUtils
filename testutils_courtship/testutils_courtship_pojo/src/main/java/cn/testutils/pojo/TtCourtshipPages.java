package cn.testutils.pojo;

import java.io.Serializable;
import java.util.Date;

public class TtCourtshipPages implements Serializable {
    private Integer cpId;

    private String cpAddress;

    private Integer cpUsedCount;

    private Date cpStarttime;

    private Integer cpCollectedCount;

    private static final long serialVersionUID = 1L;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCpAddress() {
        return cpAddress;
    }

    public void setCpAddress(String cpAddress) {
        this.cpAddress = cpAddress == null ? null : cpAddress.trim();
    }

    public Integer getCpUsedCount() {
        return cpUsedCount;
    }

    public void setCpUsedCount(Integer cpUsedCount) {
        this.cpUsedCount = cpUsedCount;
    }

    public Date getCpStarttime() {
        return cpStarttime;
    }

    public void setCpStarttime(Date cpStarttime) {
        this.cpStarttime = cpStarttime;
    }

    public Integer getCpCollectedCount() {
        return cpCollectedCount;
    }

    public void setCpCollectedCount(Integer cpCollectedCount) {
        this.cpCollectedCount = cpCollectedCount;
    }
}