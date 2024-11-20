package br.com.funcionarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.funcionarios.dao.ConnectionFactory;
import br.com.funcionarios.dao.FuncionarioDao;
import br.com.funcionarios.model.Funcionario;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String inicio() {
		//Conectar ao banco de dados
		ConnectionFactory.conectar();
		//Redirecionar para rota /home
		return "redirect:home";
	}

	@RequestMapping("/home")
	// String -> retorno de uma página
	public String index(Model model) {
		FuncionarioDao dao = new FuncionarioDao();
		
		model.addAttribute("funcionarios", dao.listar());
		
		return "home";
	}
	
	@RequestMapping("/form")
	public String form(Long idFuncionario, Model model) {
		FuncionarioDao dao = new FuncionarioDao();
		
		Funcionario f = new Funcionario();
		
		if(idFuncionario != null) {
			f = dao.buscar(idFuncionario);
		}
		
		model.addAttribute("funcionario", f);
		
		return "form";
	}
	
	@RequestMapping("/funcionario")
	public String funcionario(Long idFuncionario, Model model) {
		FuncionarioDao dao = new FuncionarioDao();
		
		model.addAttribute("funcionario", dao.buscar(idFuncionario));
		
		return "funcionario";
	}
	
	@RequestMapping(value = "adicionarFuncionario", method = RequestMethod.POST)
	public String adicionarFuncionario(Funcionario funcionario) {
		FuncionarioDao dao = new FuncionarioDao();
		dao.inserir(funcionario);
		return "redirect:home";
	}
	
	@RequestMapping(value = "atualizarFuncionario", method = RequestMethod.POST)
	public String atualizarFuncionario(Long idFuncionario, Funcionario funcionario) {
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.atualizar(funcionario, idFuncionario);
		
		return "redirect:home";
	}
	
	@RequestMapping("deletarFuncionario")
	public String deletarFuncionario(Long idFuncionario) {
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.excluir(idFuncionario);
		
		return "home";
	}
}
