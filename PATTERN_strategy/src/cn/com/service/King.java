package cn.com.service;

import cn.com.api.DefensAble;
import cn.com.api.FightAble;
import cn.com.api.HeapAble;
import cn.com.api.MoveAble;

public class King extends Character{
	private FightAble fightAble;
	
	private MoveAble moveAble;
	
	private HeapAble heapAble;
	
	private DefensAble defenseAble;
	
	@Override
	public void fight() {
		fightAble.fight();
	}

	@Override
	public void move() {
		moveAble.move();
	}

	@Override
	public void heap() {
		heapAble.heap();
	}

	@Override
	public void defense() {
		defenseAble.defense();
	}

	public void setFightAble(FightAble fightAble) {
		this.fightAble = fightAble;
	}

	public void setMoveAble(MoveAble moveAble) {
		this.moveAble = moveAble;
	}

	public void setHeapAble(HeapAble heapAble) {
		this.heapAble = heapAble;
	}

	public void setDefenseAble(DefensAble defenseAble) {
		this.defenseAble = defenseAble;
	}

}
