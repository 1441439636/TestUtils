package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipPages;
import cn.testutils.pojo.TtCourtshipPagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipPagesMapper {
    long countByExample(TtCourtshipPagesExample example);

    int deleteByExample(TtCourtshipPagesExample example);

    int deleteByPrimaryKey(Integer cpId);

    int insert(TtCourtshipPages record);

    int insertSelective(TtCourtshipPages record);

    List<TtCourtshipPages> selectByExample(TtCourtshipPagesExample example);

    TtCourtshipPages selectByPrimaryKey(Integer cpId);

    int updateByExampleSelective(@Param("record") TtCourtshipPages record, @Param("example") TtCourtshipPagesExample example);

    int updateByExample(@Param("record") TtCourtshipPages record, @Param("example") TtCourtshipPagesExample example);

    int updateByPrimaryKeySelective(TtCourtshipPages record);

    int updateByPrimaryKey(TtCourtshipPages record);
}