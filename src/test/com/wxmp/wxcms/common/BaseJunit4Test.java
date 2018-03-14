package com.wxmp.wxcms.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Seth.Messenger
 * @desc    用于单元测试的基类，即用于加载spring的配置文件的
 * @date 18/3/14
 * 如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///
 * @Transactional：控制事务，如果不加入这个注解配置，事务控制就会完全失效！
 * @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)：这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），
 *      同时指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring.cfg.xml"}) //加载配置文件,保持和web.xml中的配置相同
public class BaseJunit4Test {



}



