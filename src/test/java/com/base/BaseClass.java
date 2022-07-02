package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	 public static Select select;

		public static WebDriver driver;

		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void loadUrl(String url) {
			driver.get(url);

		}

		public void inputText(WebElement element, String value) {
			element.sendKeys(value);

		}

		// 1
		public static void type(WebElement element, String text) {
			element.sendKeys(text);
		}// 2

		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;

		}

		public WebElement findLocatorById(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}// 3

		public WebElement findLocatorByName(String attributeValue) {
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}// 4

		public WebElement findLocatorByClassName(String attributeValue) {
			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}// 5

		public WebElement findLocatorByXpath(String xpath) {
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}// 6

		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}// 7

		public String getUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}// 8

		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}// 9

		public String getAttributeValue(WebElement element, String attributename) {
			String attribute = element.getAttribute(attributename);
			return attribute;
		}// 10

		public String getAttributeValue1(WebElement element, String attributename) {
			return element.getAttribute(attributename);
		}// 11

		public void selectOptionByText(WebElement element, String text) {
			new Select(element).selectByVisibleText(text);
		}// 12

		public void selectByIndex(WebElement element, int index) {
			new Select(element).selectByIndex(index);
		}// 13

		public void selectAttributeValue(WebElement element, String attributeValue) {
			new Select(element).selectByValue(attributeValue);
		}// 14

		public void typejs(WebElement element, String text) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','text')", element);
		}// 15
			// Navigate

		public void navigateUrl(String url) {
			driver.navigate().to(url);
		}

		// 16
		public void navigateRefresh() {
			driver.navigate().refresh();
		}

		// 17
		public void navigateForwrd() {
			driver.navigate().forward();
		}

		// 18
		public void navigateBack() {
			driver.navigate().back();
		}

		// 19
		public void click(WebElement element) {
			element.click();
		}

		// 20
		public static void maximize() {
			driver.manage().window().maximize();
		}

		// 21
		public void fullscreen() {
			driver.manage().window().fullscreen();
		}

		// Mouse overAction
		// 22
		public void moveToElement(WebElement element) {
			new Actions(driver).moveToElement(element).perform();
		}

		// DragAndDown
		// 23
		public void dragAndDrop(WebElement element) {
			new Actions(driver).dragAndDrop(element, element).perform();
		}

		// Doubleclick
		// 24
		public void doubleClick(WebElement element) {
			new Actions(driver).doubleClick().perform();
		}

		// RightClick
		// 25
		public void ContextClick(WebElement element) {
			new Actions(driver).contextClick().perform();
		}

		// keyup
		// 26
		public void keyup(String key) {
			new Actions(driver).keyUp(key).perform();
		}

		// keyDown
		// 27
		public void keyDown(String key) {
			new Actions(driver).keyDown(key).perform();
		}

		// Alert
		// 28
		public void accept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		// 29
		public void dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		// 30
		public void promptAlert(String text) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}

		// Screenshot
		// 31
		public void screenshot(String path) throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File d = new File(path);
			FileUtils.copyFile(s, d);
		}

		// JS insert value
		// 32
		public void jsinsertvalue(String text, WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
		}

		// 33
		public Object jsGetattribute(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			Object executeScript = executor.executeScript("returnarguments[0].getattribute('value')", element);
			return executeScript;
		}

		// 34
		public void jsClick(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}

		// 35
		public void jsScrollDown(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		// 36
		public void jsScrollUp(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		// 37
		public void ddnSelectByValue(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

		// 38
		public void ddnSelectByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		// 39
		public List<WebElement> ddnGetOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;
		}

		// 40
		public List<WebElement> ddnGetAllSelectedOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getAllSelectedOptions();
			return options;

		}

		// 41
		public WebElement ddnGetFirstSelectedOption(WebElement element) {
			Select select = new Select(element);
			WebElement options = select.getFirstSelectedOption();
			return options;
		}

		// 42
		public Boolean ddnIsMultiple(WebElement element) {
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}

		// 43
		public void ddnDeselecgtByIndex(WebElement element, int i) {
			Select select = new Select(element);
			select.deselectByIndex(i);
		}

		// 44
		public void ddnDeselectByValue(WebElement element, String value) {
			Select select = new Select(element);
			select.deselectByValue(value);
		}

		// 45
		public void ddnDeselectByText(WebElement element, String text) {
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}

		// 46
		public void ddnDeselectAll(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}

		// 47
		public void frameByIndex(int i) {
			driver.switchTo().frame(i);
		}

		// 48
		public void frameById(String id) {
			driver.switchTo().frame(id);
		}

		// 49
		public void frameByElement(WebElement element) {
			driver.switchTo().frame(element);
		}

		// 50
		public void parentFrame() {
			driver.switchTo().parentFrame();
		}

		// 51
		public void returnFrame() {
			driver.switchTo().defaultContent();

		}

		// 52
		public String getParentWindowId() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		// 53
		public Set<String> allWindowsId() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

		// 54
		public void closeCurrentWindow() {
			driver.close();
		}

		// 55
		public static void closeAllWindows() {
			driver.quit();
		}

		// 56
		public void implicitWait(Duration seconds) {
			driver.manage().timeouts().implicitlyWait(seconds);
		}

		// 57
		public void webDriverWait(Duration seconds) {
			WebDriverWait driverwait = new WebDriverWait(driver, seconds);
		}

		public void selectOptionText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);

		}

		public void updatData(String SheetName, int rownum, int cellnum, String Data) throws IOException {

			File file = new File("path");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			Data = cell.getStringCellValue();
			if (Data.equals("java")) {
				cell.setCellValue("sql");
			}
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			workbook.close();
		}

		public void writeData(String sheetname, int rownum, int cellnum, String Data) throws IOException {

			File file = new File("path");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.createRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(Data);

			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			workbook.close();

		}

		public String readData(String sheetName, int rowno, int cellno) throws IOException {

			String data = null;
			File file = new File("path");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowno);
			Cell cell = row.getCell(cellno);
			CellType type = cell.getCellType();

			switch (type) {
			case STRING:
				data = cell.getStringCellValue();

				break;

			case NUMERIC:

				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
					data = dateFormat.format(dateCellValue);
				} else {
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					data = b.toString();
				}
				break;

			default:
				break;

			}

			return data;

		}

	}

