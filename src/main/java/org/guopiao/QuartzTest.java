//测试main函数
//QuartzTest.java
package org.guopiao;


import java.text.SimpleDateFormat;
import java.util.Date;

import job.QuartzManager;

public class QuartzTest {

    /** *//**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = new Date();
        String returnstr = DateFormat.format(d);    	
    	
        TestJob job = new TestJob();
        try {
            System.out.println(returnstr+ "【系统启动】");
            QuartzManager.addJob("11",job,"0/3 * 9,10,11,13,14 ? * MON-FRI"); //周一到周五 9 10 11 13 14 每3秒执行一次
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
