package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipPagesParameters;
import cn.testutils.pojo.TtCourtshipPagesParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipPagesParametersMapper {
    long countByExample(TtCourtshipPagesParametersExample example);

    int deleteByExample(TtCourtshipPagesParametersExample example);

    int insert(TtCourtshipPagesParameters record);

    int insertSelective(TtCourtshipPagesParameters record);

    List<TtCourtshipPagesParameters> selectByExample(TtCourtshipPagesParametersExample example);

    int updateByExampleSelective(@Param("record") TtCourtshipPagesParameters record, @Param("example") TtCourtshipPagesParametersExample example);

    int updateByExample(@Param("record") TtCourtshipPagesParameters record, @Param("example") TtCourtshipPagesParametersExample example);
}