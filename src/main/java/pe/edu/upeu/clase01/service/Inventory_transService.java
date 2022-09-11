package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.Inventory_transDaoIMpl;
import pe.edu.upeu.clase01.entity.Inventory_trans;

@Service
public class Inventory_transService implements Todo<Inventory_trans> {
	@Autowired
	private Inventory_transDaoIMpl daoIMpl;

	@Override
	public int create(Inventory_trans t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
