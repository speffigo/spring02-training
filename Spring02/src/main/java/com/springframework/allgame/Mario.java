package com.springframework.allgame;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GamingConsole {

	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("jump into hole");
	}

	public void right() {
		System.out.println("Accelerate");
	}

	public void left() {
		System.out.println("Break");
	}
}
