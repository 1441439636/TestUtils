package cn.testutils.pojo;

import java.io.Serializable;
import java.util.Date;

public class TtCourtshipUseing implements Serializable {
    private Integer cuId;

    private Integer aId;

    private Integer cpId;

    private Date cuStarttime;

    private static final long serialVersionUID = 1L;

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

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

    public Date getCuStarttime() {
        return cuStarttime;
    }

    public void setCuStarttime(Date cuStarttime) {
        this.cuStarttime = cuStarttime;
    }
}