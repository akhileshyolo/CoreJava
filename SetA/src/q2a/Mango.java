package q2a;

public class Mango implements Comparable<Mango> {

	private String type;
	private int quality;
	private int price;
	
	public Mango() {

	}
	
	public Mango(String type, int quality, int price) {
		super();
		this.type = type;
		this.quality = quality;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int compareTo(Mango mango) {
		
		Integer c1 = new Integer(this.getQuality());
		Integer c2 = new Integer(mango.getQuality());

		return c1.compareTo(c2);
	}

	@Override
	public String toString() {
		return "Mango [type=" + type + ", quality=" + quality + ", price="
				+ price + "]";
	}
	
	
	
	
	
	
	
}
