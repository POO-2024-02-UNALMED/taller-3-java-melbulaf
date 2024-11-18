package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV Tv) {
		tv = Tv;
		tv.control = this;
	}
	public void setTv(TV Tv) {
		tv = Tv;
	}
	public TV getTv() {
		return tv;
	}
}
