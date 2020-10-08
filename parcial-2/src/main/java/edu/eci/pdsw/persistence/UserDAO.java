package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.User;

public interface UserDAO {

    User load(String login, String name) throws PersistenceException;

    public void save(User user) throws PersistenceException;

	public List<User> loadAll(String title) throws PersistenceException;

    public User load(String title) throws PersistenceException;

	
}
