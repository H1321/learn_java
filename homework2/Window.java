/**
 * Project Name:计软18-2-44作业2
 * File Name:Window.java
 * Package Name:service
 * Date:下午5:32:07
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 下午5:32:07 <br/>
 * 
 * @author 黄福强
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Serviceinterface serviceinterface = (Serviceinterface) context.getBean("test2");
        serviceinterface.Sayhello();
    }

}
