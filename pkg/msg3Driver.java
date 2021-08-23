package pkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.SystemTray;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Timer;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.edge.EdgeOptions;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class msg3Driver {

	public static WebElement audioButton = null;
	public static FirefoxDriver Selenium2, Selenium, Selenium3, Selenium4, Selenium5, Selenium6;
	public int watchListCounter = 0;
	public String email;
	public boolean exited = false;
	public static int botCounter = 1;
	public int botStart = 1;
	public List<String> chatGroups1, chatGroups2;
	public String message1 = null, message2 = null, timestamp = null;
	
	//public  static FirefoxProfile profile,profile2,profile3,profile4, profile5, profile6;
	
	
	public int waitTime;

	public msg3Driver(String messageTimestamp, int wait) {
		
		timestamp = messageTimestamp;
		waitTime = wait;
	}

	
	public void run() throws InterruptedException, IOException {
		chatGroups1 = new ArrayList<String>();
		chatGroups2 = new ArrayList<String>();
		// chatchatGroups11.add("-1207243227");// @hulkgems
		
		chatGroups1.add("-1578486075"); // @UniSwapGemProject
		chatGroups1.add("-1276487238");// @HypeGemToken
		chatGroups1.add("-1549164370");// @NewTokenf
		chatGroups1.add("-1568729887");// @NewListToken
		chatGroups1.add("-1552680596");// @BscProjectShill
		chatGroups1.add("-1131831039");  // @hotgems_shill
		chatGroups1.add("-1283091788");// @Shampooloung

		chatGroups1.add("-1228162332"); // @bschiddengen
		chatGroups1.add("-1408455878"); // @shitcoinBSCHiedden
		chatGroups1.add("-1376683114"); // @hiddengemms SLOW
		chatGroups1.add("-1318198384"); // @cryptomoonshotsz SLOW
		chatGroups1.add("-1310700854"); // @defigemchatt SLOW
	
		// chatGroups1.add("-1571438278"); // @legitpresalehunters
		chatGroups1.add("-1295033862"); // @defishillers SLOW
		chatGroups1.add("-1466093530"); // @bscgemhunterss

		//chatGroups2.add("-1245641039"); // @uniswapgemspumpz
		// chatGroups2.add("-1324535284");// @infinitygainzz
		//chatGroups2.add("-1371461415");// @gemcollectors
		chatGroups2.add("-1154152172");// @uniswaplegit
		chatGroups2.add("-1384676502");// @uniswaptrollbox
		// chatGroups2.add("-1194391409");// @themoonboyschat SLOW
		chatGroups2.add("-1444345569"); // @uniswapone
		// chatGroups2.add("-1264952399");// @Pumpchads
		chatGroups2.add("-1422955407");// @uniswapgem123
		//chatGroups2.add("-1430969640");// @gems4degensgroup
		//chatGroups2.add("-1191393895");// @moonhunters SLOW
		// chatGroups2.add("-1374257725");//@jumpsquad
		// chatGroups2.add("-1415725598");// @supergemhunter SLOW
		//ADD CryptoHunters group
		chatGroups2.add("-1471670592");// @cryptoblank (Crypto Hunter Elite) SLOWMODE
		chatGroups2.add("-1302251331"); //@DragonInfi_VN 
		chatGroups2.add("-1468215011");	//@cyber1group 
		chatGroups2.add("-1280216424");	//@TRMS_group 
		chatGroups2.add("-1593002832");	//@DashDP 
		chatGroups2.add("-1324968929");	//@marketinggroupg 
		chatGroups2.add("-1571313961");	//@shillcoinnow 
		chatGroups2.add("-1375454050");	//@ShillingInfinity
	
	
		
		

		

		
		
		// File pathToBinary = new File("./firefox/firefox.exe");
		// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);

		// options.setBinary(ffBinary);
		// options2.setBinary(ffBinary);

		// TODO Auto-generated method stub

		
		

		
		message1 = "4295819263";
		message2 = "4295884799";
		//TimeUnit.MINUTES.sleep(10);
		
		tgBot();
		//t2.join();

	}
	
	
	
	
	

	public void tgBot() throws InterruptedException {
		/*
		if (botStart == 1) {
			botStart++;
			SeleniumBot = Selenium;

		} else if (botStart == 2) {
			botStart = 1;
			SeleniumBot = Selenium2;
		}
		
		*/TimeUnit.MINUTES.sleep(waitTime);
	
		while (true) {
			
			
			
			webDriver.chooseProfile();
			
			if (exited == true) {
				System.out.println("Newloop after exit Thread");

				try {
					TimeUnit.MINUTES.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				exited = false;
			}
			
			try {
				MyThread t2 = new MyThread();
				t2.start();
				//testProfiles();
				sendMessages(chatGroups1);
				TimeUnit.MINUTES.sleep(90);
			}
			
			catch (Exception error) {
				//t2.join();
				error.printStackTrace();
				exited = true;
				continue;

			}
			//Selenium2 = new FirefoxDriver(options2);
			// Selenium3 = new FirefoxDriver(options3);
			//Selenium = new FirefoxDriver(options);
			// Selenium = new FirefoxDriver(options);
			

			// TimeUnit.MINUTES.sleep(10);
			
		}
	}
	
	
	 public class MyThread extends Thread {

		    public void run(){
		    	
		    	try {
					//testProfiles();
					//t2.stop();
					sendMessages(chatGroups2);
				} catch (InterruptedException e) {
					//t2.suspend();
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		    
		    }
		  }
	
	public void testProfiles() throws InterruptedException {
		System.out.println("teststart");
		FirefoxDriver SeleniumBot = null;
		SeleniumBot = new FirefoxDriver(webDriver.options);
		
		SeleniumBot.manage().window().maximize();
		//Selenium2.manage().window().maximize();

		//Selenium2.get("https://webk.telegram.org");
		// Selenium3.get("https://webk.telegram.org");
		SeleniumBot.get("https://webk.telegram.org");
		
		TimeUnit.SECONDS.sleep(25);
		SeleniumBot.quit();
		System.out.println("testend");
	}
		
	public void sendMessages(List<String> groups) throws InterruptedException {
	
			FirefoxDriver SeleniumBot = null;
			SeleniumBot = new FirefoxDriver(webDriver.options);
			
			SeleniumBot.manage().window().maximize();
			TimeUnit.MILLISECONDS.sleep(3000);
			//Selenium2.manage().window().maximize();

			//Selenium2.get("https://webk.telegram.org");
			// Selenium3.get("https://webk.telegram.org");
			SeleniumBot.get("https://webk.telegram.org");
		

			Selenium = SeleniumBot;
			TimeUnit.MILLISECONDS.sleep(3500);
		

			JavascriptExecutor jse = (JavascriptExecutor) SeleniumBot;
			int errorcounter = 0;
			

			
			

				TimeUnit.MILLISECONDS.sleep(100);
				// -1552680596
				// -1276487238
				// -1549164370
				// -1568729887
				// -1578486075
				Actions actions = new Actions(SeleniumBot);
				JavascriptExecutor js = (JavascriptExecutor) SeleniumBot;

				// WebElement elementLocator = SeleniumBot.findElement(By.id("ID"));

				for (String group : groups) {

					String groupName = "li[data-peer-id='" + group + "']";
					int tries = 0;
					while (tries <6) {
						tries++;
					try {
						SeleniumBot.get("https://webk.telegram.org");
						TimeUnit.MILLISECONDS.sleep(800);
						

						
//						SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
//								.sendKeys("TATABOT");
//						TimeUnit.MILLISECONDS.sleep(500);
						
						
						SeleniumBot.findElement(By.xpath(
								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/ul/li[1]"))
								.click();
						
						TimeUnit.MILLISECONDS.sleep(500);
						SeleniumBot.findElement(By.xpath(
								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/ul/li[2]"))
								.click();
						
						TimeUnit.MILLISECONDS.sleep(500);
						
						SeleniumBot.findElement(By.xpath(
								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/ul/li[1]"))
								.click();
						
						TimeUnit.MILLISECONDS.sleep(3000);
						
						
						WebElement scrollerChat = SeleniumBot.findElement(By.xpath
								("/html/body/div[2]/div[1]/div[2]/div/div/div[3]/div"));
						//scrollerChat.sendKeys(Keys.PAGE_UP);
						
						TimeUnit.MILLISECONDS.sleep(1000);
						WebElement pinnedButton = SeleniumBot
								.findElement(
								//(By.className("pinned-message-subtitle"));
//								.findElement(
//										By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div"));
								By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]"));
						
						
//						while (!pinnedButton.isDisplayed()) {
//							//waiting
//							System.out.println("stuck in loop pinned1");
//							
//						}
						
					
						pinnedButton.click();
						
						TimeUnit.MILLISECONDS.sleep(600);
						pinnedButton.click();
						
						TimeUnit.MILLISECONDS.sleep(600);
						pinnedButton.click();
						
						//jse.executeScript("arguments[0].click()", pinnedButton);
						TimeUnit.MILLISECONDS.sleep(2000);
						
						//SeleniumBot.get("https://webk.telegram.org");
						//TimeUnit.MILLISECONDS.sleep(800);
						
//						SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
//						.sendKeys("TATABOT");
//						TimeUnit.MILLISECONDS.sleep(500);
				
				
//				SeleniumBot.findElement(By.xpath(
//						"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
//						.click();
//				
//				TimeUnit.MILLISECONDS.sleep(1500);
						
						

//						SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
//								.sendKeys("TATABOT");
//						TimeUnit.MILLISECONDS.sleep(500);
//						SeleniumBot.findElement(By.xpath(
//								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
//								.click();
						//TimeUnit.MILLISECONDS.sleep(100000);
						// TimeUnit.SECONDS.sleep(5);
						// Slowmode groups
						if (group == "-1471670592" || group =="-1310700854" ||group== "-1131831039" || group == "-1207243227" || group == "-1415725598" || group == "-1376683114"
								|| group == "-1318198384"|| group == "-1191393895" || group == "-1194391409" || group == "-1295033862" || group == "-1466093530") {

////							WebElement pinnedButton = SeleniumBot
////											.findElement(By
////											.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div"));
////							//pinnedButton.click();
////							actions.moveToElement(pinnedButton);
////							actions.click(pinnedButton).build().perform();
//							// SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div")).click();
//							TimeUnit.MILLISECONDS.sleep(1000);
//							//pinnedButton.click();
//							actions.moveToElement(pinnedButton);
//							actions.click(pinnedButton).build().perform();
//							
							//TimeUnit.MILLISECONDS.sleep(1000);
							
							
							
							List<WebElement> forwardedMessages = SeleniumBot
									.findElements(By.cssSelector("div[data-timestamp='" + timestamp + "']"));
							WebElement zeeMessage = forwardedMessages.get(1);
							actions.moveToElement(zeeMessage);
							actions.contextClick(zeeMessage).build().perform();
							TimeUnit.MILLISECONDS.sleep(1000);

			
//							actions.moveToElement(zeeMessage);
//							actions.click(zeeMessage).build().perform();
//							TimeUnit.MILLISECONDS.sleep(300);
//							
//							actions.moveToElement(zeeMessage);
//							actions.contextClick(zeeMessage).build().perform();
//							TimeUnit.MILLISECONDS.sleep(1000);
							
							
							
							WebElement buttonPane = SeleniumBot.findElement(By.className("contextmenu"));
							WebElement selectButton = buttonPane
									
									.findElement(By.className("tgico-select"));
//							WebElement selectButton = SeleniumBot
//									//.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[5]/div[18]"));
//									.findElement(By.xpath("//div[@id='bubble-contextmenu']/div[18]"));
							//actions.moveToElement(selectButton);
							//actions.click(selectButton).build().perform()
							TimeUnit.MILLISECONDS.sleep(500);
//							WebElement  element=driver.findElement(By.xpath"");  
//							JavascriptExecutor ex=(JavascriptExecutor)driver;
						//jse.executeScript("arguments[0].click()", selectButton);
//							while (!selectButton.isDisplayed()) {
//								//waiting
//								
//								System.out.println("stuck loop1");
//							}
							selectButton.click();
							
				
							TimeUnit.MILLISECONDS.sleep(1000);

//							WebElement forwardButton = SeleniumBot.findElement(
//									By.className("selection-container-forward"));
//									//("//div[@id='column-center']/div/div/div[4]/div/div[5]/div/button[2]/div"));
//							actions.moveToElement(forwardButton);
//							actions.click(forwardButton).build().perform();
//							TimeUnit.MILLISECONDS.sleep(500);
//							WebElement selector = SeleniumBot.findElement(By.className("selector"));
//							WebElement scroller = selector.findElement(By.className("scrollable"));
//							WebElement groupElement;
//							int scrollCounter = 0;
//							while (scrollCounter < 8) {
//								scrollCounter++;
//								try {
//
//									groupElement = selector.findElement(By.cssSelector(groupName));
//									groupElement.click();
//									break;
//								}
//
//								catch (Exception scrollError) {
//									scroller.sendKeys(Keys.PAGE_DOWN);
//									TimeUnit.SECONDS.sleep(0);
//
//								}
//
//							}
//							TimeUnit.MILLISECONDS.sleep(500);
//							SeleniumBot
//									.findElement(
//											By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div[4]"))
//									.click();
//							System.out.println("Msg1 sent to group: " + group);
//							driver.shillCounter++;
//							driver.counterTabs.setText("Total Shills: " + driver.shillCounter);
//
//							continue;
						}
						
						else {
						// SeleniumBot.findElement(By.cssSelector("li[data-peer-id='1233356217']")).click();
						//js.executeScript("window.scrollTo(0,0)", "");
						TimeUnit.MILLISECONDS.sleep(500);
						
						
								
//						actions.moveToElement(pinnedButton);
//						actions.click(pinnedButton).build().perform();
//						TimeUnit.MILLISECONDS.sleep(1000);
//						actions.moveToElement(pinnedButton);
//						actions.click(pinnedButton).build().perform();
//						TimeUnit.MILLISECONDS.sleep(2000);
						
						//actions.moveToElement(pinnedButton);
						//actions.click(pinnedButton).build().perform();
								
						

						
						
						
						List<WebElement> forwardedMessages = SeleniumBot
								.findElements(By.cssSelector("div[data-timestamp='" + timestamp + "']"));
						WebElement pictureMascot = forwardedMessages.get(0);
					
						WebElement messageZee = forwardedMessages.get(1);
						
					
								
								actions.moveToElement(pictureMascot);
								actions.contextClick(pictureMascot).build().perform();
							
								TimeUnit.MILLISECONDS.sleep(1000);
							

						
//								
//								actions.moveToElement(messageZee);
//								actions.click(messageZee).build().perform();
//								//scrollerChat.sendKeys(Keys.PAGE_UP);
//								TimeUnit.MILLISECONDS.sleep(400);

				
						
						
//						actions.moveToElement(videoZee);
//						actions.contextClick(videoZee).build().perform();
//						TimeUnit.MILLISECONDS.sleep(1000);
						//System.out.println("TESTSTSTESTSTESTEST");
						
						WebElement buttonPane = SeleniumBot.findElement(By.className("contextmenu"));
						WebElement selectButton = buttonPane
								
								.findElement(By.className("tgico-select"));
						
//						WebElement selectButton = SeleniumBot
//								//.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[5]/div[18]"));
//								.findElement(By.xpath("//div[@id='bubble-contextmenu']/div[18]"));
						//actions.moveToElement(selectButton);
						//actions.click(selectButton).build().perform();
						TimeUnit.MILLISECONDS.sleep(500);

//						
						selectButton.click();
						
						TimeUnit.MILLISECONDS.sleep(500);
						actions.moveToElement(messageZee);
						actions.click(messageZee).build().perform();
						TimeUnit.MILLISECONDS.sleep(500);

						
						}
						
						WebElement forwardButton = SeleniumBot.findElement(
								By.className("selection-container-forward"));
								//By.xpath("//div[@id='column-center']/div/div/div[4]/div/div[5]/div/button[2]/div"));
						actions.moveToElement(forwardButton);
						actions.click(forwardButton).build().perform();
						TimeUnit.MILLISECONDS.sleep(500);

						WebElement selector = SeleniumBot.findElement(By.className("selector"));
						WebElement scroller = selector.findElement(By.className("scrollable"));
						// js.executeScript("arguments[0].scrollIntoView(true);", selector);
						// js.executeScript("document.getElementsByClassName('scroller')[0].scrollTop =
						// -450");
						
						int scrollCounter = 0;
						while (scrollCounter < 8) {
							scrollCounter++;
							try {
								
								WebElement groupElement = selector.findElement(By.cssSelector(groupName));
								groupElement.click();
								break;
							}

							catch (Exception scrollError) {
								scroller.sendKeys(Keys.PAGE_DOWN);
								TimeUnit.MILLISECONDS.sleep(400);

							}

						}

//			scroller.sendKeys(Keys.PAGE_DOWN);
//			TimeUnit.SECONDS.sleep(0);
//			scroller.sendKeys(Keys.PAGE_DOWN);
//			TimeUnit.SECONDS.sleep(0);
//			scroller.sendKeys(Keys.PAGE_DOWN);
//			TimeUnit.SECONDS.sleep(0);
//			scroller.sendKeys(Keys.PAGE_DOWN);
						//TimeUnit.MILLISECONDS.sleep(500);
						// ((Object) selector).scrollTop(250);
						// actions.moveToElement(selector).build().perform();
						// actions.click(forwardButton).build().perform();

						TimeUnit.MILLISECONDS.sleep(500);
						// SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div[6]/div[1]/div[1]")).sendKeys("Forwarded
						// By @Reapazz shilling bot (even this message :P)");
						SeleniumBot
								.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div[4]/button"))
								.click();
						
						System.out.println("MSG3 sent to group: " + group);
						driver.shillCounter3++;
						driver.counterTabs.setText("Total Shills: " +"1: "+ driver.shillCounter + " 2: "+ driver.shillCounter2+ " 3:"+ driver.shillCounter3+ 
								" 4:"+driver.shillCounter4  + "    Profile: " +webDriver.currentProfile);

						TimeUnit.SECONDS.sleep(2);
						break;
					}
					
					
					
					catch (Exception loopError) {

						System.out.println("Message 3 : Failed for group: " + group + "    Profile: " +webDriver.currentProfile);
						System.out.println(loopError);
						loopError.printStackTrace();

						continue;

					}

					
					
					
					}

					continue;
				}
					
				SeleniumBot.quit();
				//Selenium.quit();
				System.out.println("Closed afteer Msg3");
			

			
		}

	

//	Thread t2 = new Thread(new Runnable() {
//		public void run() {
//
//		
//		}
//	});

	public void closeTabs() {
		try {
			// Selenium.close();
			// Selenium2.close();
		
			//Selenium3.quit();
			//Selenium2.quit();
			Selenium.quit();
			// Selenium.quit();
		} catch (Exception error2) {
		}

	}

}
