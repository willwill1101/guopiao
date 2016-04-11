package org.guopiao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.guopiao.util.ContentUtil;

public class Main {
	static String infoUrl = ContentUtil.getValue(ContentUtil.KEY.GET_INFO_URL);
	static List<String> codes = new ArrayList<String>();
	static int groutNums = 800;
	static String path="F:\\GP";

	static {
		InputStream input = null;
		try {
			input = Thread.currentThread().getContextClassLoader().getResourceAsStream("code");
			List<String> list = IOUtils.readLines(input);
			String partUrl = "";
			for (int index = 1; index <= list.size(); index++) {
				String line = list.get(index - 1);
				String[] s = line.split("~");
				if ((index % groutNums == 0) || index == list.size()) {
					partUrl += s[0];
					codes.add(partUrl);
					partUrl = "";
				} else {
					partUrl += s[0] + ",";
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void main() throws IOException, InterruptedException {
		
			InputStream input=null;
			OutputStream output=null;
			try {
				File file = new File(path+"\\"+System.currentTimeMillis()+".txt");
				 output = new FileOutputStream(file);
				for (String ss : codes) {
					URL url = new URL(infoUrl + ss);
					 input = url.openStream();
					IOUtils.copy(input, output);
					input.close();
				}
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					input.close();
				} catch (Exception e) {
				}
				try {
					output.close();
				} catch (Exception e) {
				}
			}


	}
}
