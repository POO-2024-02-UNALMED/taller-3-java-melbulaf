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
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
	public void canalUp() {
		if (tv.estado == true) {
			if (tv.canal >= 1 && tv.canal < 120){
				tv.canal++;
			}
		}
	}
	public void canalDown() {
		if (tv.estado == true) {
			if (tv.canal > 1 && tv.canal <= 120){
				tv.canal--;
			}
		}
	}
	public void volumenUp() {
		if (tv.estado == true) {
			if (tv.volumen >= 0 && tv.volumen < 7){
				tv.volumen++;
			}
		}
	}
	public void volumenDown() {
		if (tv.estado == true) {
			if (tv.volumen > 0 && tv.volumen <= 7){
				tv.volumen--;
			}
		}
	}
	public void setCanal(int cl){
		if(tv.estado == true) {
			if(cl >= 1 && cl <= 120) {
				tv.canal = cl;
			}
		}
	}
	public void setVolumen(int vol){
		if(tv.estado == true) {
			if (vol >= 0 && vol <= 7){
				tv.volumen = vol;
			}
		}
	}
}
