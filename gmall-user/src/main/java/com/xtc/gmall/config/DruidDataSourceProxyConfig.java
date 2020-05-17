package com.xtc.gmall.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.proxy.jdbc.DataSourceProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author xtc
 * @create 2020-05-17 15:43
 */
@Configuration
public class DruidDataSourceProxyConfig {

    @Value("${mybatis.mapper-locations}")
    String mapperLocations;

    @Value("${mybatis.type-aliases-package}")
    String typeAliasesPackage;

    @Bean
    @ConfigurationProperties("spring.datasource")
    DataSource dataSource(){
        return new DruidDataSource();
    }

    @Bean
    DataSourceProxy dataSourceProxy(){
        return new DruidDataSource();
    }

    @Bean
    SqlSessionFactory sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResource(mapperLocations));
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        return sqlSessionFactoryBean.getObject();
    }

}
