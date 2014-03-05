package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.RoleDao;
import com.java.task11.model.Role;

import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class RoleService implements IBaseService<Role> {
    private RoleDao roleDao = DaoFactory.getInstance().getRoleDao();

    @Override
    public Role getByID(Integer id) {
        return roleDao.getByID(id);
    }

    @Override
    public void save(Role element) {
        roleDao.save(element);
    }

    @Override
    public void update(Role element) {
        roleDao.update(element);
    }

    @Override
    public void delete(Role element) {
        roleDao.delete(element);
    }

    @Override
    public List<Role> getListOfObjects() {
        return roleDao.getListOfObjects();
    }
}
