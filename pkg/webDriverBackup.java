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

public class webDriverBackup {

	public static WebElement audioButton = null;
	public static FirefoxDriver Selenium2, Selenium, Selenium3;
	public int watchListCounter = 0;
	public String email;
	public boolean exited = false;
	public int botCounter = 1;
	public List<String> chatGroups1, chatGroups2;
	public String message1 = null, message2 = null, timestamp = null;

	public void run() throws InterruptedException, IOException {
		chatGroups1 = new ArrayList<String>();
		chatGroups2 = new ArrayList<String>();
		// chatchatGroups11.add("-1207243227");// @hulkgems
		chatGroups1.add("-1578486075"); // @UniSwapGemProject
		chatGroups1.add("-1276487238");// @HypeGemToken
		chatGroups1.add("-1549164370");// @NewTokenf
		chatGroups1.add("-1568729887");// @NewListToken
		chatGroups1.add("-1552680596");// @BscProjectShill
		// chatGroups1.add("-1283091788");// @Shampooloung

		chatGroups1.add("-1228162332"); // @bschiddengen
		chatGroups1.add("-1408455878"); // @shitcoinBSCHiedden
		chatGroups1.add("-1376683114"); // @hiddengemms
		chatGroups1.add("-1318198384"); // @cryptomoonshotsz
		chatGroups1.add("-1310700854"); // @defigemchatt
		chatGroups1.add("-1131831039"); // @hotgems_shill
		// chatGroups1.add("-1571438278"); // @legitpresalehunters
		chatGroups1.add("-1295033862"); // @defishillers
		chatGroups1.add("-1466093530"); // @bscgemhunterss

		chatGroups2.add("-1245641039"); // @uniswapgemspumpz
		// chatGroups2.add("-1324535284");// @infinitygainzz
		//chatGroups2.add("-1371461415");// @gemcollectors
		chatGroups2.add("-1154152172");// @uniswaplegit
		chatGroups2.add("-1384676502");// @uniswaptrollbox
		// chatGroups2.add("-1194391409");// @themoonboyschat SLOW
		chatGroups2.add("-1444345569"); // @uniswapone
		// chatGroups2.add("-1264952399");// @Pumpchads
		chatGroups2.add("-1422955407");// @uniswapgem123
		chatGroups2.add("-1430969640");// @gemsfordegensgroup
		//chatGroups2.add("-1191393895");// @moonhunters SLOW
		// chatGroups2.add("-1374257725");//@jumpsquad
		// chatGroups2.add("-1415725598");// @supergemhunter SLOW

		FirefoxOptions options = new FirefoxOptions();
		FirefoxOptions options2 = new FirefoxOptions();
		FirefoxOptions options3 = new FirefoxOptions();

		File file = new File("./profiles/Profile1");
		File file2 = new File("./profiles/Profile2");
		File file3 = new File("./profiles/Profile3");

		FirefoxProfile profile = new FirefoxProfile(file);
		FirefoxProfile profile2 = new FirefoxProfile(file);
		FirefoxProfile profile3 = new FirefoxProfile(file3);

		options.setProfile(profile);
		options2.setProfile(profile2);
		options3.setProfile(profile3);
		// File pathToBinary = new File("./firefox/firefox.exe");
		// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);

		// options.setBinary(ffBinary);
		// options2.setBinary(ffBinary);

		// TODO Auto-generated method stub

		options.setHeadless(false);
		options2.setHeadless(false);
		Selenium2 = new FirefoxDriver(options);
		// Selenium3 = new FirefoxDriver(options3);
		Selenium = new FirefoxDriver(options);
		// Selenium = new FirefoxDriver(options);
		Selenium.manage().window().maximize();
		Selenium2.manage().window().maximize();

		Selenium2.get("https://webk.telegram.org");
		// Selenium3.get("https://webk.telegram.org");
		Selenium.get("https://webk.telegram.org");
		// TimeUnit.MINUTES.sleep(10);

		timestamp = "1627040931";
		message1 = "4295819263";
		message2 = "4295884799";

		t2.start();
		tgBot(chatGroups1);

	}

	public void tgBot(List<String> groups) {
		FirefoxDriver SeleniumBot = null;
		if (botCounter == 1) {
			botCounter++;
			SeleniumBot = Selenium;

		} else if (botCounter == 2) {
			botCounter = 1;
			SeleniumBot = Selenium2;
		}

		while (true) {

			if (SeleniumBot == Selenium) {
				// botCounter++;
				SeleniumBot = Selenium2;

			} else if (SeleniumBot == Selenium2) {
				// botCounter = 1;
				SeleniumBot = Selenium;
			}

			// SeleniumBot = Selenium;

			JavascriptExecutor jse = (JavascriptExecutor) SeleniumBot;
			int errorcounter = 0;
			if (exited == true) {
				System.out.println("Newloop after exit Thread");

				try {
					TimeUnit.MINUTES.sleep(25);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				exited = false;
			}

			try {
				// File file = new File("./buster.xpi");

				TimeUnit.MILLISECONDS.sleep(500);
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

					try {
						SeleniumBot.get("https://webk.telegram.org");

						TimeUnit.MILLISECONDS.sleep(800);
						
						SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
								.sendKeys("TATABOT");
						TimeUnit.MILLISECONDS.sleep(500);
						SeleniumBot.findElement(By.xpath(
								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
								.click();

						SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
								.sendKeys("TATABOT");
						TimeUnit.MILLISECONDS.sleep(1000);
						SeleniumBot.findElement(By.xpath(
								"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
								.click();

						// TimeUnit.SECONDS.sleep(5);
						// Slowmode groups
						if (group== "-1131831039" || group == "-1207243227" || group == "-1283091788" || group == "-1415725598"
								|| group == "-1191393895" || group == "-1194391409") {
/*
							SeleniumBot.get("https://webk.telegram.org");
							TimeUnit.MILLISECONDS.sleep(500);

							SeleniumBot
									.findElement(
											By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
									.sendKeys("TATABOT");
							TimeUnit.MILLISECONDS.sleep(500);
							SeleniumBot.findElement(By.xpath(
									"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
									.click();

							SeleniumBot
									.findElement(
											By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input"))
									.sendKeys("TATABOT");
							TimeUnit.MILLISECONDS.sleep(500);
							SeleniumBot.findElement(By.xpath(
									"/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/ul/li"))
									.click();
							*/

							SeleniumBot
									.findElement(By
											.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div"))
									.click();
							// SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div")).click();
							TimeUnit.MILLISECONDS.sleep(500);
							List<WebElement> forwardedMessages = SeleniumBot
									.findElements(By.cssSelector("div[data-timestamp='" + timestamp + "']"));
							WebElement messageZee = forwardedMessages.get(2);
							actions.moveToElement(messageZee);
							actions.contextClick(messageZee).build().perform();
							TimeUnit.MILLISECONDS.sleep(1000);

							WebElement selectButton = SeleniumBot
									//.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[5]/div[18]"));
									.findElement(By.xpath("//div[@id='bubble-contextmenu']/div[18]/div"));
							//actions.moveToElement(selectButton);
							//actions.click(selectButton).build().perform();
							selectButton.click();
							TimeUnit.MILLISECONDS.sleep(1000);

							WebElement forwardButton = SeleniumBot.findElement(
									By.xpath("//div[@id='column-center']/div/div/div[4]/div/div[5]/div/button[2]/div"));
							actions.moveToElement(forwardButton);
							actions.click(forwardButton).build().perform();
							TimeUnit.MILLISECONDS.sleep(500);
							WebElement selector = SeleniumBot.findElement(By.className("selector"));
							WebElement scroller = selector.findElement(By.className("scrollable"));
							WebElement groupElement;
							int scrollCounter = 0;
							while (scrollCounter < 8) {
								scrollCounter++;
								try {

									groupElement = selector.findElement(By.cssSelector(groupName));
									groupElement.click();
									break;
								}

								catch (Exception scrollError) {
									scroller.sendKeys(Keys.PAGE_DOWN);
									TimeUnit.SECONDS.sleep(0);

								}

							}
							TimeUnit.MILLISECONDS.sleep(500);
							SeleniumBot
									.findElement(
											By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div[4]"))
									.click();
							System.out.println("Msg1 sent to group: " + group);
							driver.shillCounter++;
							driver.counterTabs.setText("Total Shills: " + driver.shillCounter);

							continue;
						}
						// SeleniumBot.findElement(By.cssSelector("li[data-peer-id='1233356217']")).click();
						//js.executeScript("window.scrollTo(0,0)", "");
						TimeUnit.SECONDS.sleep(1);
						WebElement pinnedButton = SeleniumBot
								.findElement(
										By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div"));
								
						actions.moveToElement(pinnedButton);
						actions.click(pinnedButton).build().perform();
						TimeUnit.MILLISECONDS.sleep(500);
						
						actions.moveToElement(pinnedButton);
						actions.click(pinnedButton).build().perform();
								
						TimeUnit.MILLISECONDS.sleep(500);

						List<WebElement> forwardedMessages = SeleniumBot
								.findElements(By.cssSelector("div[data-timestamp='" + timestamp + "']"));
						WebElement videoZee = forwardedMessages.get(0);
						WebElement video2Zee = forwardedMessages.get(1);
						WebElement messageZee = forwardedMessages.get(2);
						// WebElement videoZee =
						// SeleniumBot.findElement(By.cssSelector("div[data-saved-from='133838929_4305780735']"));
						// WebElement messageZee =
						// SeleniumBot.findElement(By.cssSelector("div[data-saved-from='133838929_4305911807']"));
						actions.moveToElement(videoZee);
						actions.contextClick(videoZee).build().perform();
						TimeUnit.SECONDS.sleep(1);
						System.out.println("TESTSTSTESTSTESTEST");
						
						WebElement selectButton = SeleniumBot
								//.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[5]/div[18]"));
								.findElement(By.xpath("//div[@id='bubble-contextmenu']/div[18]/div"));
						//actions.moveToElement(selectButton);
						//actions.click(selectButton).build().perform();
						selectButton.click();
						
						TimeUnit.MILLISECONDS.sleep(1000);
						SeleniumBot
								.findElement(
										By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div"))
								.click();
						TimeUnit.MILLISECONDS.sleep(500);
						actions.moveToElement(video2Zee);
						actions.click(video2Zee).build().perform();
						TimeUnit.MILLISECONDS.sleep(1000);

						actions.moveToElement(messageZee);
						actions.click(messageZee).build().perform();
						TimeUnit.MILLISECONDS.sleep(1000);
						
						WebElement forwardButton = SeleniumBot.findElement(
								By.xpath("//div[@id='column-center']/div/div/div[4]/div/div[5]/div/button[2]/div"));
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
						TimeUnit.MILLISECONDS.sleep(500);
						// ((Object) selector).scrollTop(250);
						// actions.moveToElement(selector).build().perform();
						// actions.click(forwardButton).build().perform();

						TimeUnit.MILLISECONDS.sleep(500);
						// SeleniumBot.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div[6]/div[1]/div[1]")).sendKeys("Forwarded
						// By @Reapazz shilling bot (even this message :P)");
						SeleniumBot
								.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div[4]"))
								.click();

						System.out.println("Msg1 sent to group: " + group);
						driver.shillCounter++;
						driver.counterTabs.setText("Total Shills: " + driver.shillCounter);
						TimeUnit.SECONDS.sleep(2);

					}

					catch (Exception loopError) {

						System.out.println("T1: Failed for group: " + group);
						System.out.println(loopError);
						loopError.printStackTrace();

						continue;

					}

				}

				TimeUnit.MINUTES.sleep(40);
			}

			catch (Exception error) {
				exited = true;
				continue;

			}
		}

	}

	Thread t2 = new Thread(new Runnable() {
		public void run() {

			tgBot(chatGroups2);
		}
	});

	public void closeTabs() {
		try {
			// Selenium.close();
			// Selenium2.close();
			Selenium3.quit();
			Selenium2.quit();
			Selenium.quit();
			// Selenium.quit();
		} catch (Exception error2) {
		}

	}

}
