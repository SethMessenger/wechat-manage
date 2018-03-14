package com.wxmp.wxcms.service;

import com.wxmp.wxcms.common.BaseJunit4Test;
import com.wxmp.wxcms.domain.Account;
import com.wxmp.wxcms.mapper.AccountDao;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xunbo.xu
 * @desc
 * @date 18/3/14
 */
public class AccountServiceTest extends BaseJunit4Test{

    @Resource
    private AccountDao entityDao;

    @Test
    public Account getById(String id){
        System.out.println("start");
        Account account = entityDao.getById(id);
        System.out.println("start");
        return account;
    }

    public Account getByAccount(String account){
        return entityDao.getByAccount(account);
    }

    public List<Account> listForPage(Account searchEntity){
        return entityDao.listForPage(searchEntity);
    }

    public void add(Account entity){
        entityDao.add(entity);
    }

    public void update(Account entity){
        entityDao.update(entity);
    }

    public void delete(Account entity){
        entityDao.delete(entity);
    }

}
