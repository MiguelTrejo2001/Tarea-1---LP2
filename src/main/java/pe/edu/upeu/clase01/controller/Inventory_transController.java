package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Inventory_trans;
import pe.edu.upeu.clase01.service.Inventory_transService;

@RestController
public class Inventory_transController {
	
	@Autowired
	private Inventory_transService inventory_transService;
	
	@GetMapping("/inventory")
	public List<Inventory_trans> getList(){
		return inventory_transService.readAll();
	}
}
