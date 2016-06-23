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
import br.com.lp2.spring.mongo.Produto;
import br.com.lp2.spring.mongo.ProdutoService;
import br.com.lp2.spring.mongo.Response;

@Path("/produto")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class ProdutoResource {

	ProdutoService service = new ProdutoService();
	
	@GET
	public List<Produto> getAll() {
		return service.findAll(new Sort(new Order(Direction.ASC, "nome")));
	}
	
	@GET
	@Path("/quantidade/")
	public List<Produto> getByQuantidade() {
		return service.findByQuantidade(new Sort(new Order(Direction.DESC, "quantidade")));
	}
	
	@GET
	@Path("{id}")
	public Produto getOne(@PathParam("id") String id) {
		return service.findOne(id);
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Produto> getByNome(@PathParam("nome") String nome) {
		return service.findByNome(nome);
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id){
		service.delete(id);
		return Response.Ok("Produto deletado com sucesso.");
	}
	
	@POST
	public Response save(Produto produto){
		service.save(produto);
		return Response.Ok("Produto salvo com sucesso.");
	}
	
	@PUT
	public Response put(Produto produto) {
		service.save(produto);
		return Response.Ok("Produto atualizado com sucesso.");
	}

}