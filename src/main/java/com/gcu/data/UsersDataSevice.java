package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.UserEntity;
import com.gcu.data.repository.UsersRepository;

@Service
public class UsersDataSevice implements DataAccessInterface<UserEntity> {

    @Autowired
    private UsersRepository usersRepository;

    public UsersDataSevice(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    
    /** 
     * @return List<UserEntity>
     */
    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> users = new ArrayList<UserEntity>();
        try {
            Iterable<UserEntity> usersIterable = usersRepository.findAll();
            usersIterable.forEach(users::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public UserEntity FindById(long id) {
        return null;
    }

    @Override
    public boolean create(UserEntity user) {
        try {
            this.usersRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(UserEntity t) {
        return true;
    }

    @Override
    public boolean delete(UserEntity t) {
        return true;
    }
    
}
