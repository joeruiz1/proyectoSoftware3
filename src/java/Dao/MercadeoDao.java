/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.DbUtil;
import Modelo.Carro;
import Modelo.genericoMercadeo;
import Modelo.genericoVentas;
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
public class MercadeoDao {

    private Connection connection;

    public MercadeoDao() {

        connection = DbUtil.getConnection();

    }

    public List<genericoMercadeo> Listarmercadeo() {
        List<genericoMercadeo> users = new ArrayList<genericoMercadeo>();

        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select distinct color,marca,tipo from ventas join carro on(ventas.idVentas=carro.idCarro)");
            while (rs.next()) {
                genericoMercadeo v = new genericoMercadeo();

                // v.setIdCarro(rs.getInt("idCarro"));
                v.setColor(rs.getString("color"));
                v.setMarca(rs.getString("Marca"));
                v.setTipo(rs.getString("tipo"));

                users.add(v);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;

    }

}
