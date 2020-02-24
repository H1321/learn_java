/**
 * Project Name:计软18-2-44作业2
 * File Name:Serviceinterfaceimpl.java
 * Package Name:service
 * Date:下午4:57:50
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package homework2;

/**
 * Description: <br/>
 * Date: 下午4:57:50 <br/>
 * 
 * @author 黄福强
 * @version
 * @see
 */
public class Serviceinterfaceimpl implements Serviceinterface {
    private Interface interface1;

    public Serviceinterfaceimpl(Interface interface1) {
        this.interface1 = interface1;

    }

    @Override
    public void Sayhello() {
        interface1.Sayhello();
        System.out.println("我是元素2");
        System.out.println("----------------------------------");
    }

}
