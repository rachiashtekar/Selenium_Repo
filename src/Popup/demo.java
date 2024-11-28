package Popup;

public class demo {
//	Implicit Wait:
//		Not mandatory to wait the full time: If you set 5 seconds, Selenium will wait up to 5 seconds. If the element appears in 2 seconds, Selenium moves on right away and doesn't wait the full 5 seconds. It only waits until the element is found.
//		Keeps checking: During the wait time, Selenium keeps checking the page to see if the element is ready.
	
	
//		Thread.sleep():
//		Always waits the full time: If you set Thread.sleep(5000), it will wait for exactly 5 seconds no matter what, even if the page is already loaded.
//		Doesn’t check: Thread.sleep() doesn't care if the page has loaded or the element is ready—it just stops everything for the given time.
	
//So, with implicit wait, Selenium is smarter and faster because it stops waiting once the element is found. Thread.sleep() just pauses for a fixed time, which could slow things down if the page loads faster.

}
