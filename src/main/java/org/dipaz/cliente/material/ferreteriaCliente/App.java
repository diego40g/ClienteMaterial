package org.dipaz.cliente.material.ferreteriaCliente;

import java.util.List;

import org.dipaz.material.service.CrearMaterial;
import org.dipaz.material.service.Material;

/**
 * Hello world!
 *
 *carpeta E:\API_Cloud_Course_JAVA\TarjetasClientes\src\main\java
 *wsimport -keep -verbose http://materiadp.herokuapp.com/MaterialService?wsdl
 *
 *carpeta E:\API_Cloud_Course_JAVA\TarjetasClientes\
 *mvn clean install
 *
 *carpeta E:\API_Cloud_Course_JAVA\TarjetasClientes\target
 *java -jar TarjetasClientes-0.0.1-SNAPSHOT.jar crear 123 Tuberia PVC 5 3 None
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClienteFerreteria cliente = new ClienteFerreteria();
        
        if(args[0].equals("crear")) {
        	Material material = new Material();
        	
        	material.setCodigo(Integer.parseInt(args[1]));
        	material.setNombre(args[2]);
        	material.setDescripcion(args[3]);
        	material.setCantidad(Integer.parseInt(args[4]));
        	material.setCantidadMin(Integer.parseInt(args[5]));
        	material.setFabricante(args[6]);
        	
        	cliente.crearMaterial(material);
        }else {
        	List<Material> materiales = cliente.obtenerTodas();
        	
        	for(Material material : materiales) {
        		System.out.println(material);
        	}
        }
    }
}
