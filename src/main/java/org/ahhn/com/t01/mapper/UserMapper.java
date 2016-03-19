package org.ahhn.com.t01.mapper;

import org.ahhn.com.t01.domain.User;

import java.util.List;

/**
 * Created by XJX on 2016/3/19.
 */
public interface UserMapper {
	void save(User user);

	void update(User user);

	void delete(int id);

	User findById(int id);

	List<User> findAll();

}
