package taller3.televisores;

public class Control {
	private TV tv;
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public void canalUp() {
		if (estado == true) {
			if (canal >= 1 && canal <= 120){
				canal++;
			}
		}
	}
	public void canalDown() {
		if (estado == true) {
			if (canal >= 1 && canal <= 120){
				canal--;
			}
		}
	}
	public void volumenUp() {
		if (estado == true) {
			if (volumen >= 0 && volumen <= 7){
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if (estado == true) {
			if (volumen >= 0 && volumen <= 7){
				volumen--;
			}
		}
	}
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
