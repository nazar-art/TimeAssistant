package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.SubtaskDao;
import com.java.task11.model.Subtask;

import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class SubtaskService implements IBaseService<Subtask> {
    private SubtaskDao subtaskDao = DaoFactory.getInstance().getSubtaskDao();

    @Override
    public Subtask getByID(Integer id) {
        return subtaskDao.getByID(id);
    }

    @Override
    public void save(Subtask element) {
        subtaskDao.save(element);
    }

    @Override
    public void update(Subtask element) {
        subtaskDao.update(element);
    }

    @Override
    public void delete(Subtask element) {
        subtaskDao.delete(element);
    }

    @Override
    public List<Subtask> getListOfObjects() {
        return subtaskDao.getListOfObjects();
    }
}
