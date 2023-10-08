package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.business.ProductsBusinessService;
import com.gcu.data.entity.UserEntity;
import com.gcu.data.repository.UsersRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class UsersDataSevice implements DataAccessInterface<UserEntity> {

    @Autowired
    private UsersRepository usersRepository;


    private static final Logger logger = LoggerFactory.getLogger(UsersDataSevice.class);

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
    	logger.info("Entering UsersDataService.create()");
    	logger.info("This is a pipeline test.");
        
        try {
            this.usersRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("UsersDataService.create() failed: "+ e);
            logger.info("Exiting UsersDataService.create()");
            return false;
        }
        logger.info("UsersDataService.create(). User successfuly created");
        logger.info("Exiting UsersDataService.create()");
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
