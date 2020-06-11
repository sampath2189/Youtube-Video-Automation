package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class BaseClass {
	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Screen s = new Screen();
		
		Pattern playButton = new Pattern("./sikulix/playButton.png");
		Pattern nextVideoButton = new Pattern("./sikulix/nextVideoButton.png");
		
		Pattern mute  = new Pattern("./sikulix/muteButton.png");
		
		Pattern settings = new Pattern("./sikulix/settings.png");
		Pattern theatreMode = new Pattern("./sikulix/theatreMode.png");
		
		driver.get("https://www.youtube.com/watch?v=GhH_x-Hpu8U");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		s.click(playButton);
		System.out.println("clicked on play button");
		s.click(nextVideoButton);
		System.out.println("clicked on upnext video button");
		s.click(mute);
		System.out.println("clicked on mute button");
		s.click(theatreMode);
		System.out.println("theatre mode activated");
		Thread.sleep(2000);
		s.click(settings);
		System.out.println("clicked on settings");
		
	}
}
