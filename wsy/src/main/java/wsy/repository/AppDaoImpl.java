package wsy.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AppDaoImpl implements AppDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> findAll() {
		String sql = "select * from t_app";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		
		return list;
	}

	@Override
	public Map<String, Object> findOne(String keyId) {
		String sql = "select * from t_app where key_id=?";
		Object[] params = {keyId};
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,params);
		if(list.size()>0){
			return	list.get(0);
		}
		return null;
	}
}
