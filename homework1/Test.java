/**
 * Project Name:计软18-2-44
 * File Name:Test.java
 * Package Name:test
 * Date:上午11:02:52
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 上午11:02:52 <br/>
 * 
 * @author 黄福强
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {

        // Auto-generated method stub
        ApplicationContext a = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TestDao td = (TestDao) a.getBean("test");
        td.sayhello();

    }

}
