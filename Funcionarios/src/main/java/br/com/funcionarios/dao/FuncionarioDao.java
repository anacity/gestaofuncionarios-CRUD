package br.com.funcionarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.funcionarios.model.Funcionario;

public class FuncionarioDao {
	private Connection conexao;
	
	public FuncionarioDao() {
		conexao = ConnectionFactory.conectar();
	}
	
	public void inserir(Funcionario funcionario) {
		String sql = "INSERT INTO funcionarios (nome, cargo, idade)" + "VALUES (?, ?, ?)";
		
		PreparedStatement smtp;
		try {
			
			smtp = conexao.prepareStatement(sql);
			
			smtp.setString(1, funcionario.getNome());
			smtp.setString(2, funcionario.getCargo());
			smtp.setInt(3, funcionario.getIdade());
			
			smtp.execute();
			smtp.close();
			conexao.close();
		}catch (Exception e) {
			System.out.println("Deu erro: " + e.getMessage());
		}
		
	}
	
	public List<Funcionario> listar(){
		String sql = "SELECT * FROM funcionarios";
		
		PreparedStatement smtp;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try {
			smtp = conexao.prepareStatement(sql);
			
			ResultSet resultado = smtp.executeQuery();
			
			while(resultado.next()){
				Funcionario fi = new Funcionario();
				
				fi.setId(resultado.getLong("id"));
				fi.setNome(resultado.getString("nome"));
				fi.setCargo(resultado.getString("cargo"));
				fi.setIdade(resultado.getInt("idade"));
				funcionarios.add(fi);
			}
			resultado.close();
			smtp.close();
			conexao.close();
			return funcionarios;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
	}
	
	public Funcionario buscar(Long id) {
		String sql = "SELECT * FROM funcionarios WHERE id = ?";
		
		PreparedStatement smtp;
		try {
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, id);
			ResultSet resultado = smtp.executeQuery();
			Funcionario f = null;
			
			while(resultado.next()) {
				f = new Funcionario();
				f.setId(resultado.getLong("id"));
				f.setNome(resultado.getString("nome"));
				f.setCargo(resultado.getString("cargo"));
				f.setIdade(resultado.getInt("idade"));
			}
			
			smtp.close();
			resultado.close();
			conexao.close();
			return f;
			
		} catch (Exception e) {
			System.out.println("Deu erro" + e.getMessage());
			throw new RuntimeException();
		}
	}
	
	public void excluir(Long id) {
		String sql = "DELETE FROM funcionarios WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, id);
			
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public void atualizar(Funcionario funcionario, Long id) {
		String sql = "UPDATE funcionarios SET nome = ?, cargo = ?, idade = ? WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			smtp = conexao.prepareStatement(sql);
			smtp.setString(1, funcionario.getNome());
			smtp.setString(2, funcionario.getCargo());
			smtp.setInt(3, funcionario.getIdade());
			smtp.setLong(4, id);
			
			smtp.execute();
			smtp.close();
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
