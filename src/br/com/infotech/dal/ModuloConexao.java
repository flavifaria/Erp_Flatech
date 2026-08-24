/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotech.dal;
import java.sql.*;
/**
 *
 * @author Flávio
 */
public class ModuloConexao {
    public static Connection connector(){
        java.sql.Connection conexao = null;
        //linha chamando o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //armazenando informações do banco 
        String url="jdbc:mysql//localhost:3306/erp_vendas";
        String user="root";
        String password="123456";
        
        //estabelecendo a conexão
        try {
            //caso de certo 
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;        
        } catch (Exception e) {
            //caso de errado
            return null;
        }
    }
}
