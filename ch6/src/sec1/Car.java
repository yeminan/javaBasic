package sec1;

public class Car {
	private String name;
	private String style;
	private String company;
	private String fuel;
	private int tire;
	private String speed;
	private String num;
	private String usetime;
	Car(){
		this("벤츠");
	}
	Car(String name){
		this(name,"경차,승용차,승합차,화물차");
	}
	Car(String name, String style){
		this(name,style,"samsung");
	}
	Car(String name, String style, String company){
		this(name,style,company,"등유,휘발유,가스,전기,수소");
	}
	Car(String name, String style, String company,String fuel){
		this(name,style,company,fuel,4);
	}
	Car(String name, String style, String company,String fuel, int tire){
		this(name,style,company,fuel,tire,"100km/s");
	}
		Car(String name, String style, String company,String fuel, int tire, String speed){
		this(name,style,company,fuel,tire,speed,"33서3454");
	}
		Car(String name, String style, String company,String fuel, int tire, String speed, String num){
		this(name,style,company,fuel,tire,speed,num,"15분");
	}
	Car(String name, String style, String company,String fuel, int tire, String speed, String num, String usetime){
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	public void Fuel() {
		System.out.println("차가 잘나갑니다 ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getUsetime() {
		return usetime;
	}
	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}
	
	
	
}
