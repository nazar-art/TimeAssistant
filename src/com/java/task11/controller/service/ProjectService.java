package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.ProjectDao;
import com.java.task11.model.Project;

import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class ProjectService implements IBaseService<Project> {
    private ProjectDao projectDao = DaoFactory.getInstance().getProjectDao();

    @Override
    public Project getByID(Integer id) {
        return projectDao.getByID(id);
    }

    @Override
    public void save(Project element) {
        projectDao.save(element);
    }

    @Override
    public void update(Project element) {
        projectDao.update(element);
    }

    @Override
    public void delete(Project element) {
        projectDao.delete(element);
    }

    @Override
    public List<Project> getListOfObjects() {
        return projectDao.getListOfObjects();
    }
}
