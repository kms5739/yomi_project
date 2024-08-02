package kr.co.iei.restr.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.iei.restr.model.dto.Restaurant;
import kr.co.iei.restr.model.dto.RestaurantRowMapper;

@Repository
public class RestrDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Autowired
	private RestaurantRowMapper restaurantRowMapper;

	public Restaurant selectOneRestr(int restrNo) {
		String query = "select * from restaurant where restr_no = ?";
		Object[] params = {restrNo};
		List list = jdbc.query(query, restaurantRowMapper, params);
		if(list.isEmpty()) {
			return null;			
		}
		return (Restaurant)list.get(0);
	}
}
