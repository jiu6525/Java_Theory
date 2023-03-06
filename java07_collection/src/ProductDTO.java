
public class ProductDTO {
	private	int productCode;//	상품코드
	private String productName;//	상품명
	private int price;//	가격
	private int amount;//	수량
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int productCode, String productName, int price, int amount) {
		this.productCode = productCode; 
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return productCode + "\t" + productName + "\t" + price
				+ "\t" + amount;
	}
	
	public int getProductCode() {
		return productCode;
	}
	
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
	return price;
	}
	
	public void setPrice(int price) {
	this.price = price;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
