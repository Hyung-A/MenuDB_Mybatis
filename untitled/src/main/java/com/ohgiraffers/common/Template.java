package com.ohgiraffers.common;


import com.ohgiraffers.dao.OrderMapper;
import com.ohgiraffers.dao.PaymentMapper;
import com.ohgiraffers.dao.MenuMapper;
import com.ohgiraffers.dao.CategoryMapper;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){
        if(sqlSessionFactory == null){
            Environment environment =
                    new Environment("dev" ,new JdbcTransactionFactory() ,new PooledDataSource(DRIVER, URL, USER, PASSWORD));

            Configuration configuration = new Configuration(environment);


            configuration.addMapper(PaymentMapper.class);
            configuration.addMapper(MenuMapper.class);
            configuration.addMapper(CategoryMapper.class);
            configuration.addMapper(OrderMapper.class);


            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        }

        return sqlSessionFactory.openSession(false);

    }

}

