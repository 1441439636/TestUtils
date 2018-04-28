package cn.testutils.dao;

import cn.testutils.pojo.TtAccounts;
import cn.testutils.pojo.TtAccountsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TtAccountsMapper {
    long countByExample(TtAccountsExample example);

    int deleteByExample(TtAccountsExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(TtAccounts record);

    int insertSelective(TtAccounts record);

    List<TtAccounts> selectByExample(TtAccountsExample example);

    TtAccounts selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") TtAccounts record, @Param("example") TtAccountsExample example);

    int updateByExample(@Param("record") TtAccounts record, @Param("example") TtAccountsExample example);

    int updateByPrimaryKeySelective(TtAccounts record);

    int updateByPrimaryKey(TtAccounts record);
}