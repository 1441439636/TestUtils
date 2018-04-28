package cn.testutils.pojo;

import java.io.Serializable;

public class TtCourtshipPagesParameters implements Serializable {
    private Integer cpId;

    private Integer cppIndex;

    private String cppDescription;

    private String cppContent;

    private static final long serialVersionUID = 1L;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getCppIndex() {
        return cppIndex;
    }

    public void setCppIndex(Integer cppIndex) {
        this.cppIndex = cppIndex;
    }

    public String getCppDescription() {
        return cppDescription;
    }

    public void setCppDescription(String cppDescription) {
        this.cppDescription = cppDescription == null ? null : cppDescription.trim();
    }

    public String getCppContent() {
        return cppContent;
    }

    public void setCppContent(String cppContent) {
        this.cppContent = cppContent == null ? null : cppContent.trim();
    }
}