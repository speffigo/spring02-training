package com.springframework.allgame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole gamcon;

	public GameRunner(@Qualifier("ValorantFirst") GamingConsole gamcon) {
		this.gamcon = gamcon;
	}

	public void run() {
		gamcon.up();
		gamcon.down();
		gamcon.right();
		gamcon.left();

	}

}
