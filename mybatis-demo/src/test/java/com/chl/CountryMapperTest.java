package com.chl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.chl.entity.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;


public class CountryMapperTest extends BaseMapperTest{

	@Test
	public void testSelectAll(){
		SqlSession sqlSession = getSqlSession();
		try {
			List<Country> countryList = sqlSession.selectList("com.chl.mapper.CountryMapper.selectAll");
			printCountryList(countryList);
		} finally {
			sqlSession.close();
		}
	}

	private void printCountryList(List<Country> countryList){
		for(Country country : countryList){
			System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryName(), country.getCountryCode());
		}
	}
}