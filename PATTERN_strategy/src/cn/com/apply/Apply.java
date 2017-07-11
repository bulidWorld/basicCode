package cn.com.apply;

import cn.com.api.impl.Defense;
import cn.com.api.impl.Fight;
import cn.com.api.impl.Heap;
import cn.com.api.impl.Move;
import cn.com.service.King;

public class Apply {
	public static void main(String[] args) {
		King king = new King();
		king.setDefenseAble(new Defense());
		king.setFightAble(new Fight());
		king.setHeapAble(new Heap());
		king.setMoveAble(new Move());
		
		king.fight();
		king.move();
		king.defense();
		king.heap();
	}
}
