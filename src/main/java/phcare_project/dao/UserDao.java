package phcare_project.dao;

import phcare_project.entity.User;

public interface UserDao {
    User findById(Long id);
    void save(User user);
    void update(User user);
    void delete(User user);
}
