/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.DbUtil;
import Conexion.conexion;
import Modelo.Carro;
import Modelo.genericoVentas;
import Modelo.ventas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Labing
 */
public class ventasDao {
 
       private Connection connection;
       
    public ventasDao(){
        connection = DbUtil.getConnection();
    
    }
    
    public List<genericoVentas> Listarventas() {
        List<genericoVentas> users = new ArrayList<genericoVentas>();
        
        
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select distinct Marca,color,precio,tipo from ventas  join carro on (ventas.idCarro=carro.idCarro)");
            while (rs.next()) {
            genericoVentas v = new genericoVentas();
            Carro c=new Carro();
           
           // v.setIdCarro(rs.getInt("idCarro"));
             
           v.setMarca(rs.getString("Marca"));
           v.setColor(rs.getString("color"));
           v.setPrecio(rs.getInt("precio"));
           v.setTipo(rs.getString("tipo"));
                
           users.add(v);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
        
    }
    
    
    
    
}
