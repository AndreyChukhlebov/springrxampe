package brans.impl;

import brans.JdbcTemplate;

public class JdbcTemplateImpl implements JdbcTemplate {

    private String url;
    private String name;
    private String qwert;


    @Override
    public String getConnection() {
        return new String("asdfvoimnu");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQwert(String qwert) {
        this.qwert = qwert;
    }
}
