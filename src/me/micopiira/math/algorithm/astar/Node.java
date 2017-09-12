package me.micopiira.math.algorithm.astar;

import me.micopiira.math.Vector2;

public class Node implements Comparable<Node> {
	private int H;
	private int G = Integer.MAX_VALUE;
	private Node parent;
	private boolean walkable;
	private Vector2 coordinate;

	public Node(Vector2 coordinate, boolean walkable) {
		this.coordinate = coordinate;
		this.walkable = walkable;
	}

	public int getF() {
		return H + G;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public boolean isWalkable() {
		return walkable;
	}

	public void setWalkable(boolean walkable) {
		this.walkable = walkable;
	}

	public Vector2 getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Vector2 coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String toString() {
		return "Node{" +
				"G=" + G +
				",H=" + H +
				",F=" + getF() +
				", coordinate=" + coordinate +
				'}';
	}

	@Override
	public int compareTo(Node o) {
		return Integer.compare(this.getF(), o.getF());
	}
}
