package br.com.lp2.rest;

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
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import br.com.lp2.spring.mongo.Membro;
import br.com.lp2.spring.mongo.MembroService;
import br.com.lp2.spring.mongo.Response;

@Path("/membro")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class MembroResource {

	MembroService service = new MembroService();
	
	@GET
	public List<Membro> getAll() {
		return service.findAll(new Sort(new Order(Direction.ASC, "nome")));
	}
	
	@GET
	@Path("{id}")
	public Membro getOne(@PathParam("id") String id) {
		return service.findOne(id);
	}
	
	@GET
	@Path("/tipo/{tipo}")
	public List<Membro> getByTipo(@PathParam("tipo") boolean tipo) {
		return service.findByTipo(tipo);
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Membro> getByNome(@PathParam("nome") String nome) {
		return service.findByNome(nome);
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id){
		service.delete(id);
		return Response.Ok("Membro deletado com sucesso.");
	}
	
	@POST
	public Response save(Membro membro){
		service.save(membro);
		return Response.Ok("Membro salvo com sucesso.");
	}
	
	@PUT
	public Response put(Membro membro) {
		service.save(membro);
		return Response.Ok("Membro atualizado com sucesso.");
	}

}