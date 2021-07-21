/**
 * 
 */
package com.sb.designpatterns.observer.first;

/**
 * @author amahajan
 * 
 */
public class MyTopicSubscriber implements Observer {

	private String	name;

	private Subject	subject;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	public void update() {
		String message = (String) subject.getUpdate(this);
		if (message == null) {
			System.out.println(name + " , NO NEW MESSAGE!!");
		} else {
			System.out.println(name + " , CONSUMING MESSAGE!!  " + message);
		}
	}

	public void setSubject(Subject s) {
		this.subject = s;

	}

}
