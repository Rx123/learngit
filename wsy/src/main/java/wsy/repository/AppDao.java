package wsy.repository;

import java.util.List;
import java.util.Map;

public interface AppDao {
	@SuppressWarnings("rawtypes")
	public List findAll();
	public Map<String,Object> findOne(String keyId);
}
