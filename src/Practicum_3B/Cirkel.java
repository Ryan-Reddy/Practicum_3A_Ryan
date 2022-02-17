package Practicum_3B;

public class Cirkel {
	private int radius;
	private int xPositie;
	private int yPositie;

	public Cirkel(int rad, int xP, int yP) {
		radius = rad;
		xPositie = xP;
		yPositie = yP;
	}
	public void setRadius(int rad) {radius = rad; }
	public void setxPositie(int xP) {xPositie = xP; }
	public void setyPositie(int yP) {yPositie = yP; }

	public int getRadius() { return radius; }
	public int getxPositie() { return xPositie; }
	public int getyPositie() { return yPositie; }

	public String concatXY() {
		String xy = "(" + getxPositie() + ", " + getyPositie() + ")";
		return xy; }

	public int testradiusNotZero() {
		try {
			int radius = getRadius();
			int test = radius / 2;
			return radius;
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
	return 0;}

	public String toString() {
		String s = "cirkel " + concatXY() + " met radius: " + getRadius();
		return s;
	}
}