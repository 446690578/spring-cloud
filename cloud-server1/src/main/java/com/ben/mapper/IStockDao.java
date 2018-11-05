package com.ben.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IStockDao {

    @Select("select count from stock where name = #{name} ")
    Integer getMoney(String name);

    @Update({"update stock set count=count ${symbol} #{count} where name = #{name}"})
    Boolean updateStockCount(@Param("name") String name,@Param("count") String count,@Param("symbol") String symbol );

    @Update({"update stock set count=count + 1 where name = 'count'"})
    void updateCount();
}
