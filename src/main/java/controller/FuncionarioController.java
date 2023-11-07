package controller;

import data.FuncionarioDAO;
import domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {

    private final FuncionarioDAO funcionarioDAO;

    public FuncionarioController() {
        funcionarioDAO = new FuncionarioDAO();
    }

    public void createFuncionario(Funcionario funcionario) throws SQLException {
        funcionarioDAO.createFuncionario(funcionario);
    }

    public List<Funcionario> getFuncionarios() throws SQLException {
        return funcionarioDAO.getAllFuncionarios();
    }

    public Funcionario getFuncionarioById(Long id_funcionario) throws SQLException {
        return funcionarioDAO.getFuncionario(id_funcionario);
    }

    public void updateFuncionario(long id_funcionario, Funcionario funcionario) throws SQLException {
        funcionarioDAO.updateFuncionario(id_funcionario, funcionario);
    }

    public void deleteFuncionario(long id_funcionario) throws SQLException {
        funcionarioDAO.deleteFuncionario(id_funcionario);
    }

}
