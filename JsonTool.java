package com.etc.tool;

import net.sf.json.JSONObject;

/*
 * JsonTool �ǽ�Java�������������ת��ΪJson�������͡�
 */
public class JsonTool {
	public static String createJsonString(String key,Object value)
	{
		//1.ʵ����һ��JSONObject����
		JSONObject jsonObject =  new JSONObject();
		
		//2.��������Ӷ�����
		jsonObject.put(key, value);
		
		
		//3.���� jsonObject����
		return jsonObject.toString();
	
		
	}

}
