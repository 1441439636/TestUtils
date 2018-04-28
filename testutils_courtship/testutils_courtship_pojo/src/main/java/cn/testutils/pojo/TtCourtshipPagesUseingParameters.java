package cn.testutils.pojo;

import java.io.Serializable;

public class TtCourtshipPagesUseingParameters implements Serializable {
    private Integer cuId;

    private Integer cpId;

    private Integer cpupIndex;

    private String cpupContent;

    private static final long serialVersionUID = 1L;

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getCpupIndex() {
        return cpupIndex;
    }

    public void setCpupIndex(Integer cpupIndex) {
        this.cpupIndex = cpupIndex;
    }

    public String getCpupContent() {
        return cpupContent;
    }

    public void setCpupContent(String cpupContent) {
        this.cpupContent = cpupContent == null ? null : cpupContent.trim();
    }
}