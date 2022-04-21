package com.nowcoder.community.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoImpl implements AlphaDao{


    @Override
    public String select() {
        return "hello";
    }
}
