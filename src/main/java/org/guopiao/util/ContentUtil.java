package org.guopiao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class ContentUtil 
{	
	private static	Logger log = LoggerFactory.getLogger(ContentUtil.class);
	private static  Properties properties = new Properties();
	
   static{
	   InputStream input = null;
	   try {
		input=Thread.currentThread().getContextClassLoader().getResourceAsStream("conf.properties");
		   properties.load(input);
		   log.info("配置文件加载成功！");
	} catch (IOException e) {
		 log.debug("配置文件加载失败！",e);
	}finally {
		if(input!=null){
			try {
				input.close();
			} catch (IOException e) {
			}
		}
	}
   }
   /**
    * 获取配置文件
    * @param key
    * @return
    */
    public static  String getValue(KEY key){
    	return properties.getProperty(key.toString());
    }
    /**
     * 
     * 配置文件枚举
     *
     */
    public static  enum KEY{
    	GET_CODE_URL,
    	GET_INFO_URL
    }
   
}
