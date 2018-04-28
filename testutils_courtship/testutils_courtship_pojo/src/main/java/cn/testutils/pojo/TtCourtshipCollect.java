package cn.testutils.pojo;

import java.io.Serializable;
import java.util.Date;

public class TtCourtshipCollect implements Serializable {
    private Integer aId;

    private Integer cpId;

    private Date ccStarttime;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Date getCcStarttime() {
        return ccStarttime;
    }

    public void setCcStarttime(Date ccStarttime) {
        this.ccStarttime = ccStarttime;
    }
}