package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipUsingMsg;
import cn.testutils.pojo.TtCourtshipUsingMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipUsingMsgMapper {
    long countByExample(TtCourtshipUsingMsgExample example);

    int deleteByExample(TtCourtshipUsingMsgExample example);

    int insert(TtCourtshipUsingMsg record);

    int insertSelective(TtCourtshipUsingMsg record);

    List<TtCourtshipUsingMsg> selectByExample(TtCourtshipUsingMsgExample example);

    int updateByExampleSelective(@Param("record") TtCourtshipUsingMsg record, @Param("example") TtCourtshipUsingMsgExample example);

    int updateByExample(@Param("record") TtCourtshipUsingMsg record, @Param("example") TtCourtshipUsingMsgExample example);
}