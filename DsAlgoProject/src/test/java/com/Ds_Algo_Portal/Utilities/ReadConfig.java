package com.Ds_Algo_Portal.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception ex) {
			System.out.println("Exception is" + ex.getMessage());
		}
	}

	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		return url;

	}

	public String getUserName() {
		String userName = pro.getProperty("userName");
		return userName;
	}

	public String getPassword() {
		String passWord = pro.getProperty("password");
		return passWord;

	}

	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;

	}
}
