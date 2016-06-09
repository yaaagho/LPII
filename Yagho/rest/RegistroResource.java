package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Registro;
import br.com.herbertrausch.domain.RegistroService;
import br.com.herbertrausch.domain.Response;

@Path("/registro")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class RegistroResource{
	
	public RegistroService produtoService = new RegistroService();
	

	@GET
	public List<Registro> get() {
		List<Registro> produto = produtoService.getRegistros();
		return produto;
	}

	@GET
	@Path("{id}")
	public Registro get(@PathParam("id") long id) {
		Registro c = produtoService.getRegistro(id);
		return c;
	}

	@GET
	@Path("/tipo/{tipo}")
	public List<Registro> getByTipo(@PathParam("tipo") String tipo) {
		List<Registro> produto = produtoService.getByTipo(tipo);
		return produto;
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		produtoService.delete(id);
		return Response.Ok("Registro deletado com sucesso.");
	}

	@POST
	public Response post(Registro c) {
		produtoService.save(c);
		return Response.Ok("Registro salvo com sucesso.");
	}

	@PUT
	public Response put(Registro c) {
		produtoService.save(c);
		return Response.Ok("Registro atualizado com sucesso.");
	}

}