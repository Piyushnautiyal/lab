package com.google.play.developerapi.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.play.developerapi.samples.ApplicationConfig;
import com.google.play.developerapi.samples.BasicUploadApk;
import com.google.play.developerapi.samples.ListApks;
import com.google.play.developerapi.samples.UpdateListing;
import com.google.play.developerapi.samples.UploadApkWithListing;
public class CallDeveloperApiMain {
	public static void main(String[] args) throws Exception {
		final Log log = LogFactory.getLog(CallDeveloperApiMain.class);
		
		ApplicationConfig.readConfig();

		String reqType = args[0];

		switch(reqType)
		{
		case "Basic" :
			BasicUploadApk.uploadBasicApk();
			break;
		case "List" :
			ListApks.apkList();
			break;
		case "Update" :
			UpdateListing.listUpdate();
			break;
		case "Upload" :
			UploadApkWithListing.apkUploadWithListing();
			break;
		default :
			log.info("Wrong Input Type, Should be ---->{Basic,List,Update,Upload}");
		}
	}
}
