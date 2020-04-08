package brans.impl;

import brans.JdbcTemplate;
import brans.UserDao;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void dooo() {
        System.out.println("dpkmnarjn");
    }

    @Override
    public void save() {
        System.out.println(jdbcTemplate.getConnection());
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
