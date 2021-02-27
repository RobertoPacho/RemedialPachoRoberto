package ec.edu.ups.remedialPachoRoberto.Services;

import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("empleado")
public class ClienteServiceREST {

	/*

	@GET
	@Path("multiplicacion/{a}/{b}")
	public int multi(@PathParam("a") int a, @PathParam("b") int b) {
		return a * b;
	}

	@GET
	@Path("anadirproducto/{codigo}/{cantidad}")
	public String guardarProducto(@PathParam("codigo") String codigo, @PathParam("cantidad") int cantidad)throws Exception {
		String estado="";
		List<Producto> listap=new ArrayList<Producto>();
		listap=productoON.findAll();
		for (int i = 0; i < listap.size(); i++) {
			if (listap.get(i).getCodigoproducto().equals(codigo)) {
				
				estado=listap.get(i).getNombre();
				
			}else { 
			estado="Producto no existente";
			}
			
		}
		return estado;
	}
*/
}
