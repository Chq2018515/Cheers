package com.cheers.dao;

import com.cheers.dataobject.OotdDO;

public interface OotdDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    int insert(OotdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    int insertSelective(OotdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    OotdDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    int updateByPrimaryKeySelective(OotdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ootd
     *
     * @mbg.generated Thu May 25 00:21:57 CST 2023
     */
    int updateByPrimaryKey(OotdDO record);
}