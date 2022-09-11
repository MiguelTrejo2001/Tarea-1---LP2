package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Inventory_trans;

@Component
public class Inventory_transDaoIMpl implements Todo<Inventory_trans> {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Inventory_trans t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Inventory_trans t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Inventory_trans read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory_trans> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from inventory_transaction_types", new BeanPropertyRowMapper<Inventory_trans>(Inventory_trans.class));
	}

}
