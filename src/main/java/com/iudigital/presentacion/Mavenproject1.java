package com.iudigital.presentacion;

import controller.FuncionarioController;
import domain.Funcionario;
import java.sql.SQLException;
import java.util.Scanner;

public class Mavenproject1 {

    public static void crear(FuncionarioController funcionarioContrller) {
        Scanner sc = new Scanner(System.in);
        try {
            funcionarioContrller.createFuncionario(new Funcionario());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }
}
