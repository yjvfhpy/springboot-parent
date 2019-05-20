package com.mical;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 */
@Data
@Repository
public class BaseDao {

      @Autowired
      protected NamedParameterJdbcTemplate namedJdbcTemplate;

      @Autowired
      protected JdbcTemplate jdbcTemplate;

}
