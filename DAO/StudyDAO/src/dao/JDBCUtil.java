package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/***
 * 
 * 1 从配置文件中获取信息
 * 
 * 2 封装获取连接的方法
 * 3 封装关闭资源的方法
 * 
 * 
 *
 */
public class JDBCUtil
{
	private static Properties p = new Properties();
	
	static
	{
		InputStream is = null ;

		try
		{
			is = JDBCUtil.class.getResourceAsStream("/JDBC.properties");

			p.load(is);
		} catch (IOException e)
		{
			e.printStackTrace();
		}finally
		{
			if(is != null)
			{
				try 
				{
					is.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static Connection getConnection() throws Exception
	{

		Class.forName(p.getProperty("Driver"));
			
		Connection con = DriverManager.getConnection(p.getProperty("Url"),p.getProperty("username"),p.getProperty("password"));
			
			
		return con ;
		
	}
	
	public static void close(ResultSet rs, PreparedStatement ps , Connection con) throws Exception
	{
		if(rs != null)
		{
			rs.close();
		}
		
		if(ps != null)
		{
			ps.close();
		}
		
		if(con != null)
		{
			con.close();
		}
		
	}
	
}
