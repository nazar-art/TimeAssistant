package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.TaskDao;
import com.java.task11.model.Task;

import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class TaskService implements IBaseService<Task> {
    private TaskDao taskDao = DaoFactory.getInstance().getTaskDao();

    @Override
    public Task getByID(Integer id) {
        return taskDao.getByID(id);
    }

    @Override
    public void save(Task element) {
        taskDao.save(element);
    }

    @Override
    public void update(Task element) {
        taskDao.update(element);
    }

    @Override
    public void delete(Task element) {
        taskDao.delete(element);
    }

    @Override
    public List<Task> getListOfObjects() {
        return taskDao.getListOfObjects();
    }
}
