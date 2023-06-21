package com.springframework.allgame;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CsGo implements GamingConsole {
	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("crawl");
	}

	public void right() {
		System.out.println("fire");
	}

	public void left() {
		System.out.println("walk");
	}
}
