package org.jspiders.setterinjectionforcollection;


import org.jspiders.setterinjectionforcollection.bean.CollectionType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//1.Container
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setterinjectionforcollectionconfig.xml");
    	
    	//2.Get the bean
    	
    	CollectionType coll1 = (CollectionType) context.getBean("collection1");
    	
    	//3.Use the bean
    	
    	System.out.println(coll1);
    	
    	
    }
}
