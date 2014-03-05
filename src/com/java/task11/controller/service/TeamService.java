package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.TeamDao;
import com.java.task11.model.Team;

import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class TeamService implements IBaseService<Team> {
    private TeamDao teamDao = DaoFactory.getInstance().getTeamDao();

    @Override
    public Team getByID(Integer id) {
        return teamDao.getByID(id);
    }

    @Override
    public void save(Team element) {
        teamDao.save(element);
    }

    @Override
    public void update(Team element) {
        teamDao.update(element);
    }

    @Override
    public void delete(Team element) {
        teamDao.delete(element);
    }

    @Override
    public List<Team> getListOfObjects() {
        return teamDao.getListOfObjects();
    }
}
