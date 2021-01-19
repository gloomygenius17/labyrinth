package pth;

public class kletka {
	String proi;
	private boolean n;
	private boolean s;
	private boolean w;
	private boolean e;
	
	public kletka(String proi) {
		this.proi = proi;
	}

	
	public String getProi() {
		return proi;
	}

	
	public void setProi(String proi) {
		this.proi = proi;
	}

	
	public boolean isN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(boolean n) {
		this.n = n;
	}

	
	public boolean isS() {
		return s;
	}

	
	public void setS(boolean s) {
		this.s = s;
	}

	
	public boolean isW() {
		return w;
	}

	
	public void setW(boolean w) {
		this.w = w;
	}

	
	public boolean isE() {
		return e;
	}

	
	public void setE(boolean e) {
		this.e = e;
	}
}
