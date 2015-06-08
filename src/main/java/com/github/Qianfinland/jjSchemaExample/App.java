package com.github.Qianfinland.jjSchemaExample;



import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.JsonSchemaGenerator;
import com.github.reinert.jjschema.SchemaGeneratorBuilder;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
        //save the schema file
        System.out.println("Schema file from Java Class is created successfully!");
        
        try {
			PrintWriter writer = new PrintWriter("schema.txt");
			writer.println(productSchema);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
    }
}
