package com.etc.tool;

import net.sf.json.JSONObject;

/*
 * JsonTool 是将Java对象和容器对象转换为Json数据类型。
 */
public class JsonTool {
	public static String createJsonString(String key,Object value)
	{
		//1.实例化一个JSONObject对象
		JSONObject jsonObject =  new JSONObject();
		
		//2.将参数添加对象中
		jsonObject.put(key, value);
		
		
		//3.返回 jsonObject对象
		return jsonObject.toString();
	
		
	}

}
