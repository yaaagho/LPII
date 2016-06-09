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

import br.com.herbertrausch.domain.Produto;
import br.com.herbertrausch.domain.ProdutoService;
import br.com.herbertrausch.domain.Response;

@Path("/produto")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ProdutoResource{
	
	public ProdutoService produtoService = new ProdutoService();
	

	@GET
	public List<Produto> get() {
		List<Produto> produto = produtoService.getProdutos();
		return produto;
	}

	@GET
	@Path("{id}")
	public Produto get(@PathParam("id") long id) {
		Produto c = produtoService.getProduto(id);
		return c;
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		produtoService.delete(id);
		return Response.Ok("Produto deletado com sucesso.");
	}

	@POST
	public Response post(Produto c) {
		produtoService.save(c);
		return Response.Ok("Produto salvo com sucesso.");
	}

	@PUT
	public Response put(Produto c) {
		produtoService.save(c);
		return Response.Ok("Produto atualizado com sucesso.");
	}

}