package cn.testutils.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ZLS on 2017/11/16.
 */
public class EasyUIDataGridResult implements Serializable {
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
