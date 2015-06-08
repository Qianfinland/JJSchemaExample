package com.github.Qianfinland.jjSchemaExample;

import com.github.reinert.jjschema.Attributes;

@Attributes(title="Product", description="A product from Acme's catalog")
public class Product {
	@Attributes(required=true, description="The unique identifier for a product")
    private long id;
    @Attributes(required=true, description="Name of the product")
    private String name;
    
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
   
}
