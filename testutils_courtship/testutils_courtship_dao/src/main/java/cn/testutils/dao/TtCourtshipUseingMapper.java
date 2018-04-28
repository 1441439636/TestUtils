package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipUseing;
import cn.testutils.pojo.TtCourtshipUseingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipUseingMapper {
    long countByExample(TtCourtshipUseingExample example);

    int deleteByExample(TtCourtshipUseingExample example);

    int deleteByPrimaryKey(Integer cuId);

    int insert(TtCourtshipUseing record);

    int insertSelective(TtCourtshipUseing record);

    List<TtCourtshipUseing> selectByExample(TtCourtshipUseingExample example);

    TtCourtshipUseing selectByPrimaryKey(Integer cuId);

    int updateByExampleSelective(@Param("record") TtCourtshipUseing record, @Param("example") TtCourtshipUseingExample example);

    int updateByExample(@Param("record") TtCourtshipUseing record, @Param("example") TtCourtshipUseingExample example);

    int updateByPrimaryKeySelective(TtCourtshipUseing record);

    int updateByPrimaryKey(TtCourtshipUseing record);
}