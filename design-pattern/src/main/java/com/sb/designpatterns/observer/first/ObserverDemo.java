/**
 * 
 */
package com.sb.designpatterns.observer.first;

/**
 * @author amahajan
 * 
 */
public class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create subject
		MyTopic topic = new MyTopic();

		// create observers
		Observer observer1 = new MyTopicSubscriber("observer1");
		Observer observer2 = new MyTopicSubscriber("observer2");
		Observer observer3 = new MyTopicSubscriber("observer3");
		Observer observer4 = new MyTopicSubscriber("observer4");

		// register observers to the subject
		topic.registerObserver(observer1);
		topic.registerObserver(observer2);
		topic.registerObserver(observer3);
		topic.registerObserver(observer4);

		// attach observer to subject
		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		observer4.setSubject(topic);

		// check if any update is available
		observer1.update();

		// now send message to subject
		topic.postMessage("Hi There.");
	}

}
