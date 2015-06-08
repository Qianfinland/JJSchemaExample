package com.github.Qianfinland.jjSchemaExample;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.JsonSchemaGenerator;
import com.github.reinert.jjschema.SchemaGeneratorBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Generate Schema from Java class!" );
        JsonSchemaGenerator v4generator = SchemaGeneratorBuilder.draftV4Schema().build();
        JsonNode productSchema = v4generator.generateSchema(Product.class);
        System.out.println(productSchema);
    }
}
