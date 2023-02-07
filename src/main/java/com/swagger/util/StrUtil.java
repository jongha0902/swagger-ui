package com.swagger.util;

import java.util.Map;

public class StrUtil {

	public Float getFloat(Object obj) {
		return obj == null || "".equals(obj.toString()) ? 0.0f : Float.parseFloat(obj.toString());
	}

	public Float getFloat(String str) {
		return "".equals(getStr(str)) ? 0.0f : Float.parseFloat(str);
	}

	public Integer getInt(Object obj) {
		return obj == null || "".equals(obj.toString()) ? 0 : Integer.parseInt(obj.toString());
	}

	public Integer getInt(String str) {
		return "".equals(getStr(str)) ? 0 : Integer.parseInt(str);
	}

	public Integer getInt(Object obj,int deNum) {
		return obj == null ? deNum : Integer.parseInt(obj.toString());
	}

	public Integer getInt(String str,int deNum) {
		return "".equals(getStr(str)) ? deNum : Integer.parseInt(str);
	}

	public String getStr(Object obj) {
		return obj == null ? "" : String.valueOf(obj).trim();
	}

	public String getStr(Object obj, String deStr) {
		return obj == null ? deStr : String.valueOf(obj).trim();
	}

	public String getStr(String str) {
		if (str == null) str = "";
		return str.trim();
	}

	public String getStr(String str, String deStr) {
		if (str == null || "".equals(str)) str = deStr;
		return str.trim();
	}
	
	public String getEmpty(Map<String, ?> map, String key) {
	    Object value = map.get(key);
	    return value == null ? "0" : value.toString();
	}

}
