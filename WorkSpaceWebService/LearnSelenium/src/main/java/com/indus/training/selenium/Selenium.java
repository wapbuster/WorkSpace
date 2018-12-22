package com.indus.training.selenium;

import com.indus.training.exception.IndusException;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Selenium {

    //static Logger logger = Logger.getLogger("Selenium.class");

    WebDriver driver;


    public void kickBrowser() throws IndusException {

        try {
            System.setProperty("webdriver.chrome.driver",
                    "F:\\Softwares\\IDE's\\Selenium\\chromedriver_win32\\chromedriver.exe");

            driver = new ChromeDriver();

            String baseUrl = "http://automationpractice.com/index.php";

            driver.manage().window().maximize();


            driver.get(baseUrl);
        } catch (Exception e) {
            //logger.error("Something went wrong..!", e);
            throw new IndusException("Something went wrong", e);
        }

    }

    private void signIn() throws IndusException {

        driver.findElement(By.linkText("Sign in")).click();

        WebElement email = driver.findElement(By.id("email"));
        email.clear();

        WebElement password = driver.findElement(By.id("passwd"));
        password.clear();

        email.sendKeys("wapbuster@gmail.com");
        password.sendKeys("qwertyop");

        WebElement loginBtn = driver.findElement(By.id("SubmitLogin"));
        loginBtn.click();

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: "+list.size());


        for(int i = 0; i < list.size(); i++){

            System.out.println(list.get(i).getText());



            if(list.get(i).getText()==null || list.get(i).getText().equalsIgnoreCase("")
                    || list.get(i).getText().replaceAll("\\s+","").length()==0) {
                list.removeAll(Collections.singleton(list.get(i)));
            }
            System.out.println(list.get(i).getText().replaceAll("\\s+","").length());
            System.out.println(list.get(i).getLocation());

        }
        System.out.println("Number of links: "+list.size());

        for(int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getText());
        }
    }

    public void viewOrders() throws IndusException {

        driver.findElement(By.cssSelector("a[title=\"Orders\"] > span")).click();

    }

    public void signOut() throws IndusException {

        driver.findElement(By.linkText("Sign out")).click();

        driver.close();
    }

    public static void main(String[] args) throws IndusException {


        //DOMConfigurator.configure("log4j.xml");

        // System.setProperty("webdriver.gecko.driver","F:\\Softwares\\IDE's\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");

        // WebDriver driver = new FirefoxDriver();


        try {

            //String expectedTitle = "University at Albany - State University of New York";
            //String actualTitle = "";

            // launch Fire fox and direct it to the Base URL

            // get the actual value of the title
            //actualTitle = driver.getTitle();

            /*
             * if (actualTitle.contentEquals(expectedTitle)) {
             * System.out.println("Test Passed!");
             * } else {
             * System.out.println("Test Failed"); }
             */

            Selenium selObj = new Selenium();
            selObj.kickBrowser();
            selObj.signIn();
            selObj.viewOrders();
            selObj.signOut();


        } catch (Exception ex) {
            //logger.error("Something went wrong..!", ex);
            throw new IndusException("Something went wrong", ex);

        } finally {
            System.out.println("Test Completed..!");
            //System.exit(0);
        }
    }

}
