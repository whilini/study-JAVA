package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("1234");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Kim");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			 userInfoDao = new UserInfoOracleDao();
		} else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("db error");
			return;
		}
		
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
