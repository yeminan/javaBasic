package sec1;

public class Bread {
	private String name;
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	
	Bread(){}
	Bread(String name, String matrial, int gram, int price, int cut){
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}
	public int computeTotal() {
		return this.price*this.cnt;
	}
	public int computeTotal(int price) {
		return price*this.cnt;
	}
	public int computeTotal(int price,int cnt) {
		return price*cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatrial() {
		return matrial;
	}
	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}
	public int getGram() {
		return gram;
	}
	public void setGram(int gram) {
		this.gram = gram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
