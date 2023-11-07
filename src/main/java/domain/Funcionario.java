package domain;

import java.time.LocalDate;

public class Funcionario {

    private long id_funcionario;
    private long tipo_id;
    private long numero_id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private LocalDate fecha_nacimiento;
    private long id_estado_civil;
    private int id_sexo;

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public long getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(long tipo_id) {
        this.tipo_id = tipo_id;
    }

    public long getNumero_id() {
        return numero_id;
    }

    public void setNumero_id(long numero_id) {
        this.numero_id = numero_id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public long getId_estado_civil() {
        return id_estado_civil;
    }

    public void setId_estado_civil(long id_estado_civil) {
        this.id_estado_civil = id_estado_civil;
    }

    public int getId_sexo() {
        return id_sexo;
    }

    public void setId_sexo(int id_sexo) {
        this.id_sexo = id_sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id_funcionario=" + id_funcionario + ", tipo_id=" + tipo_id + ", numero_id=" + numero_id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", id_estado_civil=" + id_estado_civil + ", id_sexo=" + id_sexo + '}';
    }

}
