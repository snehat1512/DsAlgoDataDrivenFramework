package com.Ds_Algo_Portal.Utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v101.media.model.Timestamp;

import com.Ds_Algo_Portal.testcases.BaseClass;

public class GetScreenShots extends BaseClass{
	
	String stepName = "FailureTest";
	
	public static void takeScreenshot(WebDriver driver, String stepName) throws IOException, HeadlessException, AWTException {

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Timestamp time = new Timestamp(System.currentTimeMillis());
        File destFile = new File("/Users/sneha/eclipse-workspace/DsAlgoProject/screenshot/TC_002"+stepName+"_"+time+".png");

  
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			//e.printStackTrace();
			/*BufferedImage alertScreenShot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        	Timestamp time1 = new Timestamp(System.currentTimeMillis());
            File destFile1 = new File("/Users/sneha/eclipse-workspace/DsAlgoProject/screenshot/TC_002"+stepName+"_"+time1+".png");
            ImageIO.write(alertScreenShot, "png", destFile1);*/

            //if it fails to take screenshot then this block will execute
            System.out.println("Failure to take screenshot "+e);
		}

	}

}
