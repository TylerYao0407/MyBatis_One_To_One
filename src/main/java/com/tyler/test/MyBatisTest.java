package com.tyler.test;

import com.tyler.mapper.HusbandMapper;
import com.tyler.mapper.WifeMapper;
import com.tyler.pojo.Husband;
import com.tyler.pojo.Wife;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by tyler on 2016/12/12.
 */
public class MyBatisTest {
    private SqlSession sqlSession = null;
    @Test
    public void select(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSessionFactory();
            WifeMapper wifeMapper = sqlSession.getMapper(WifeMapper.class);
            Wife wife = wifeMapper.getWife(1);
            System.out.println(wife.getWname());
            Husband husband = wife.getHusband();
            System.out.println(wife.getHusband().getHname());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null)
                sqlSession.close();
        }
    }
    @Test
    public void add(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSessionFactory();
            HusbandMapper husbandMapper = sqlSession.getMapper(HusbandMapper.class);
            Husband husband = new Husband("丈夫");
            husbandMapper.addHusband(husband);
            husband.setHid(husband.getHid());
            WifeMapper wifeMapper = sqlSession.getMapper(WifeMapper.class);
            Wife wife = new Wife("妻子",husband);
            wifeMapper.addWife(wife);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null)
                sqlSession.close();
        }
    }
    @Test
    public void delete(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSessionFactory();
            HusbandMapper husbandMapper = sqlSession.getMapper(HusbandMapper.class);
            WifeMapper wifeMapper = sqlSession.getMapper(WifeMapper.class);
            wifeMapper.deleteWife(2);
            husbandMapper.deleteHusband(2);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession!=null)
                sqlSession.close();
        }
    }
}
