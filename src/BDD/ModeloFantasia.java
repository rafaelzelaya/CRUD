/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ModeloFantasia {
    public int Id;
    public String Nombre;
    public String Origen;
    public String Uniones;
    public void EliminarPorId()throws SQLException{
        String sql = "delete from fantasia where id = "+Id;
        BDD.EjecutarActualizacion(sql);
    }
    //Para que este insert funcione el id en la tabla de la base de datos
    //debe ser AI (Autoincrement).
    public void Insertar() throws SQLException{
        String sql = "insert into fantasia(nombre,origen,uniones)"+
                " values('"+Nombre+"','"+Origen+"','"+Uniones+"')";
        BDD.EjecutarActualizacion(sql);
    }
    public void Actualizar()throws SQLException{
        String sql = "update fantasia set nombre='"
                + Nombre + "', origen='" + Origen
                + "',uniones='" + Uniones + "' "
                + "where Id = " + Id;
        BDD.EjecutarActualizacion(sql);
    }
}
