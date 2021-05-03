package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingPlayer {
	private List<Car> players;

	public RacingPlayer() {
		this.players = new ArrayList<>();
	}

	public RacingPlayer(List<Car> players) {
		this.players = players;
	}

	public List<Car> calculateWinner() {
		List<Car> winners = new ArrayList<>(players);
		Collections.sort(winners);
		int idx = winners.size()-1;
		while (idx >= 0) {
		}
		System.out.println(players);
		return null;
	}
}
