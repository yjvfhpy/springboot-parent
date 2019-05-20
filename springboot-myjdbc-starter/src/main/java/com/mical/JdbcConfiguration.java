package com.mical;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.Map;

/**
 */
@Configuration
@AutoConfigureAfter(JdbcTemplateAutoConfiguration.class)
@ConditionalOnClass({DataSource.class, JdbcTemplate.class})
@Import(JdbcTemplateAutoConfiguration.class)
@Log4j2
@ComponentScan(value ="com.mical")
public class JdbcConfiguration implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Bean
    public BaseDao registerBaseDao(NamedParameterJdbcTemplate namedJdbcTemplate, JdbcTemplate jdbcTemplate){
        BaseDao baseDao = new BaseDao();
        baseDao.setNamedJdbcTemplate(namedJdbcTemplate);
        baseDao.setJdbcTemplate(jdbcTemplate);
        Map<String, BaseDao> daoMap = applicationContext.getBeansOfType(BaseDao.class);
        //初始化子类
        if(daoMap != null && daoMap.size() > 0 ) {
            daoMap.values().stream().filter(dao -> !dao.getClass().getName().equals(BaseDao.class.getName())).forEach(dao -> {
                log.info("fill jdbc template properties, class: {} ", dao.getClass().getName());
                dao.setNamedJdbcTemplate(namedJdbcTemplate);
                dao.setJdbcTemplate(jdbcTemplate);
            });
        }
        return baseDao;
    }
}
