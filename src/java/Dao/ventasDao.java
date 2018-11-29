/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.DbUtil;
import Conexion.conexion;
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
    
    public List<ventas> Listarventas() {
        List<ventas> users = new ArrayList<ventas>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select distinct idVentas,Marca,color,precio,idConcesionario,Carro.idCarro,tipo from ventas  join carro on (ventas.idCarro=carro.idCarro)");
            while (rs.next()) {
            ventas v = new ventas();
            v.setIdVentas(rs.getInt("idVentas"));
            v.setIdConsecionario(rs.getInt("idConcesionario"));
            v.setIdCarro(rs.getInt("idCarro"));
//               v.setUbicacionEspa(rs.getString("ubicacionEspacial"));
               
               
                users.add(v);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    
    
    
}
