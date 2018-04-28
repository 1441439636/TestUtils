package cn.testutils.dao;

import cn.testutils.pojo.TtCourtshipPagesUseingParameters;
import cn.testutils.pojo.TtCourtshipPagesUseingParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtCourtshipPagesUseingParametersMapper {
    long countByExample(TtCourtshipPagesUseingParametersExample example);

    int deleteByExample(TtCourtshipPagesUseingParametersExample example);

    int insert(TtCourtshipPagesUseingParameters record);

    int insertSelective(TtCourtshipPagesUseingParameters record);

    List<TtCourtshipPagesUseingParameters> selectByExample(TtCourtshipPagesUseingParametersExample example);

    int updateByExampleSelective(@Param("record") TtCourtshipPagesUseingParameters record, @Param("example") TtCourtshipPagesUseingParametersExample example);

    int updateByExample(@Param("record") TtCourtshipPagesUseingParameters record, @Param("example") TtCourtshipPagesUseingParametersExample example);
}