package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPAddress {

	public static void main(String[] args) {
		Map<String, Integer> ipAddressMap = new HashMap<String, Integer>();
		String[] stringArr = { "10.0.0.2 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-20",
				"10.0.0.1 - GET 2020-09-20" };
		String string = null;
		for (int i = 0; i <= stringArr.length - 1; i++) {
			string = stringArr[i];
			String[] splitArr = string.split("-");
			String ipAddress = splitArr[0];
			ipAddressMap.put(ipAddress, ipAddressMap.getOrDefault(ipAddress, 0) + 1);
		}
		List<String> ipAddressList = new ArrayList<>(ipAddressMap.keySet());
		ipAddressList.sort((a, b) -> ipAddressMap.get(b) - ipAddressMap.get(a));
		String maxIp = ipAddressList.get(0);
		int max = ipAddressMap.get(maxIp);
		List<String> resultList=new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : ipAddressMap.entrySet()) {	
			if (entry.getValue() == max) {
				resultList.add(entry.getKey());
			}
			else {
				break;
			}
		}
		/*for(String string1 : resultList) {
			System.out.println(string1+",");
		}*/
		String result=String.join(",", resultList);
		System.out.println(result);
	}
}
