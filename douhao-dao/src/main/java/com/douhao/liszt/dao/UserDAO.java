package com.douhao.liszt.dao;

import com.douhao.liszt.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDAO {
///
    List<User> findAll();
}
