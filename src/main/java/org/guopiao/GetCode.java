package org.guopiao;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.guopiao.util.ContentUtil;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class GetCode {
	public static void main(String[] args) {

		Gson gson  = new Gson();
		try {
			URL url =  new URL(ContentUtil.getValue(ContentUtil.KEY.GET_CODE_URL));
			InputStream input =  url.openStream();
			List<String > list =IOUtils.readLines(input, "GBK");
			input.close();
			if(list.size()>0){
				List list2 =  gson.fromJson(list.get(0), List.class);
				for(Object ss:list2){
					Map<String, String> map =(Map<String, String>) ss;
					System.out.println(map.get("symbol")+"~"+map.get("code")+"~"+map.get("name"));
				}
			}
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
