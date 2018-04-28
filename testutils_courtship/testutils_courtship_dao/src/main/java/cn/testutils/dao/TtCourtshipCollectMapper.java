package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipCollect;
import cn.testutils.pojo.TtCourtshipCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipCollectMapper {
    long countByExample(TtCourtshipCollectExample example);

    int deleteByExample(TtCourtshipCollectExample example);

    int insert(TtCourtshipCollect record);

    int insertSelective(TtCourtshipCollect record);

    List<TtCourtshipCollect> selectByExample(TtCourtshipCollectExample example);

    int updateByExampleSelective(@Param("record") TtCourtshipCollect record, @Param("example") TtCourtshipCollectExample example);

    int updateByExample(@Param("record") TtCourtshipCollect record, @Param("example") TtCourtshipCollectExample example);
}