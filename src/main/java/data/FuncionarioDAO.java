package data;

import domain.Funcionario;
import util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private static final String CREATE_FUNCIONARIO = "insert into funcionario values (?,?,?,?,?,?,?,?,?,?)";
    
    private static final String DELETE_FUNCIONARIO = "delete from funcionario where id_funcionario = ?";
    
    private static final String UPDATE_FUNCIONARIO = "update funcionario set id_tipo_id=?, numero_id=?,"
            
            + " nombres=?, apellidos=?, direccion=?, telefono=?,fecha_nacimiento=?, id_estado_civil=?, id_sexo=? "
            + " where id_funcionario = ?";
    
    private static final String GET_FUNCIONARIOS = "select * from funcionario";
    
    private static final String GET_FUNCIONARIO_BY_ID = "select * from funcionario where id_funcionario= ? ";

    public void createFuncionario(Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement pr = null;
        try {
            connection = Conexion.getConnection();
            pr = connection.prepareCall(CREATE_FUNCIONARIO);
            pr.setLong(1, funcionario.getId_funcionario());
            pr.setLong(2, funcionario.getTipo_id());
            pr.setLong(3, funcionario.getNumero_id());
            pr.setString(4, funcionario.getNombres());
            pr.setString(5, funcionario.getApellidos());
            pr.setString(6, funcionario.getDireccion());
            pr.setString(7, funcionario.getTelefono());
            pr.setString(8, funcionario.getFecha_nacimiento().toString());
            pr.setLong(9, funcionario.getId_estado_civil());
            pr.setInt(10, funcionario.getId_sexo());
            pr.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (pr != null) {
                pr.close();
            }
        }

    }

    public List<Funcionario> getAllFuncionarios() throws SQLException {

        Connection connection = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            connection = Conexion.getConnection();
            pr = connection.prepareStatement(GET_FUNCIONARIOS);
            rs = pr.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(rs.getLong("id_funcionario"));
                funcionario.setTipo_id(rs.getLong("id_tipo_id"));
                funcionario.setNumero_id(rs.getLong("numero_id"));
                funcionario.setNombres(rs.getString("nombres"));
                funcionario.setApellidos(rs.getString("apellidos"));
                funcionario.setDireccion(rs.getString("direccion"));
                funcionario.setTelefono(rs.getString("telefono"));
                funcionario.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                funcionario.setId_estado_civil(rs.getLong("id_estado_civil"));
                funcionario.setId_sexo(rs.getInt("id_sexo"));
                funcionarios.add(funcionario);
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (pr != null) {
                pr.close();
            }

            if (rs != null) {
                rs.close();
            }
        }

        return funcionarios;

    }

    public Funcionario getFuncionario(long id_funcionario) throws SQLException {
        Connection connection = null;
        Funcionario funcionario = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            connection = Conexion.getConnection();
            pr = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            pr.setLong(1, id_funcionario);
            rs = pr.executeQuery();

            if (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setId_funcionario(rs.getLong("id_funcionario"));
                funcionario.setTipo_id(rs.getLong("id_tipo_id"));
                funcionario.setNumero_id(rs.getLong("numero_id"));
                funcionario.setNombres(rs.getString("nombres"));
                funcionario.setApellidos(rs.getString("apellidos"));
                funcionario.setDireccion(rs.getString("direccion"));
                funcionario.setTelefono(rs.getString("telefono"));
                funcionario.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                funcionario.setId_estado_civil(rs.getLong("id_estado_civil"));
                funcionario.setId_sexo(rs.getInt("id_sexo"));
            }
            return funcionario;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (pr != null) {
                pr.close();
            }

            if (rs != null) {
                rs.close();
            }
        }

    }

    public void updateFuncionario(long id_funcionario, Funcionario funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement pr = null;
        try {
            connection = Conexion.getConnection();
            pr = connection.prepareStatement(UPDATE_FUNCIONARIO);
            pr.setLong(1, funcionario.getTipo_id());
            pr.setLong(2, funcionario.getNumero_id());
            pr.setString(3, funcionario.getNombres());
            pr.setString(4, funcionario.getApellidos());
            pr.setString(5, funcionario.getDireccion());
            pr.setString(6, funcionario.getTelefono());
            pr.setString(7, funcionario.getFecha_nacimiento().toString());
            pr.setLong(8, funcionario.getId_estado_civil());
            pr.setLong(9, funcionario.getId_sexo());
            pr.setLong(10, id_funcionario);
            pr.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (pr != null) {
                pr.close();
            }
        }
    }

    public void deleteFuncionario(long idFuncionario) throws SQLException {
        Connection connection = null;
        PreparedStatement pr = null;
        try {
            connection = Conexion.getConnection();
            pr = connection.prepareStatement(DELETE_FUNCIONARIO);
            pr.setLong(1, idFuncionario);
            pr.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (pr != null) {
                pr.close();
            }
        }

    }
}
