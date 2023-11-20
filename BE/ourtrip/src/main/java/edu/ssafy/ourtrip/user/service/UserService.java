package edu.ssafy.ourtrip.user.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.ssafy.ourtrip.user.dto.UserCheckDto;
import edu.ssafy.ourtrip.user.dto.UserDto;

public interface UserService {
	List<UserCheckDto> checkUserId(String userId) throws SQLException;
	void delete(String userId) throws SQLException;
	void update(UserDto userDto) throws SQLException;
	String find(UserDto userDto) throws SQLException;
	int check(UserDto userDto) throws SQLException;
	void join(UserDto userDto) throws SQLException;
	UserDto login(UserDto userDto) throws SQLException;
	UserDto userInfo(String userId) throws SQLException;
	void saveToken(String userId, String token) throws SQLException;
	Object getToken(String userId) throws SQLException;
	void deleteToken(String userId) throws SQLException;
}
