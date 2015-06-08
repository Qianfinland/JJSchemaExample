package com.github.Qianfinland.jjSchemaExample;

import com.github.reinert.jjschema.Attributes;

@Attributes(title="Product", description="A product from Acme's catalog")
public class Product {
	@Attributes(required=true, description="The unique identifier for a product")
    private long id;
    @Attributes(required=true, description="Name of the product")
    private String name;
    @Attributes(required=true, minimum=0, exclusiveMinimum=true)
    private BigDecimal price;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }   
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
   
}

class BigDecimal
{
	private int year;
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
}