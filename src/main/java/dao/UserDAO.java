package dao;

import models.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserDAO {
    public List<User> index();

    public User show(int id);

    public void save(User user);

    public void update(int id, User updateUser);

    public void delete(int id);

}


