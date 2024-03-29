package cm.spring.microservice.pojo;
/**
 * 商品标签
 * @author Administrator
 *
 */
public class Item {
	
	private Long id;
	
	private String title;
	
	private String pic;
	
	private String desc;
	
	private Long price;
	
	
	

	public Item() {
		super();
	}

	public Item(Long id, String title, String pic, String desc, Long price) {
		super();
		this.id = id;
		this.title = title;
		this.pic = pic;
		this.desc = desc;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	
	
	

}
