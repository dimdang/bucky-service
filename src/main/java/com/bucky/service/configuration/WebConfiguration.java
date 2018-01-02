package com.bucky.service.configuration;

/**
 * Created by Dang Dim
 * Date     : 02-Jan-18, 2:49 PM
 * Email    : d.dim@gl-f.com
 */

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:/config/database.properties", "classpath:/config/hibernate.properties"})
public class WebConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(environment.getProperty("bucky.db.driver"));
        ds.setUrl(environment.getProperty("bucky.db.url"));
        ds.setUsername(environment.getProperty("bucky.db.username"));
        ds.setPassword(environment.getProperty("bucky.db.password"));
        return ds;
    }

    @Bean
    @Autowired
    public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan(new String[]{"com.bucky.service.model"});
        sessionFactory.setHibernateProperties(getHibernateProperties());
        return sessionFactory;
    }

    @Bean(name = "transactionManager")
    @Autowired
    public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }

    public Properties getHibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", environment.getProperty("bucky.hibernate.dialect"));
        hibernateProperties.put("hibernate.hbm2ddl.auto", environment.getProperty("bucky.hibernate.hbm2ddl.auto"));
        hibernateProperties.put("hibernate.show_sql", environment.getProperty("bucky.hibernate.show_sql"));
        hibernateProperties.put("hibernate.enable_lazy_load_no_trans", true);
        return hibernateProperties;
    }
}
