package org.dipaz.cliente.material.ferreteriaCliente;

import java.util.List;

import org.dipaz.material.service.Material;
import org.dipaz.material.service.MaterialService;
import org.dipaz.material.service.MaterialServiceImplService;


public class ClienteFerreteria {
	private MaterialService materialService = new MaterialServiceImplService().getMaterialServiceImplPort();
	
	public Material crearMaterial(Material material) {
		return materialService.crearMaterial(material);
	}
	
	public List<Material> obtenerTodas(){
		return materialService.obtnerTodas();
	}
}
