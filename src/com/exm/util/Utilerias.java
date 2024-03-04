package com.exm.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.exm.dbconfig.DbConfiguration;
import com.exm.model.Agente;



public class Utilerias {

	DbConfiguration dbConf = new DbConfiguration();;
	Connection conn = null;
	PreparedStatement ps= null;
	ResultSet rs = null;	
	
	public List<Agente> obtAgentes() throws Exception{
	
		List<Agente> lista = null;
		Agente a = null;
		try{
		conn = dbConf.getConnection();
		ps= conn.prepareStatement("Select * from agente");
		if((rs=ps.executeQuery()).next()){
			lista = new ArrayList<Agente>();
			do{
				a= new Agente();
				a.setAgenteId(rs.getInt("agenteid"));
				a.setAgentenombre(rs.getString("agentenombre"));
				a.setAgentefechacreacion(rs.getString("agentefechacreacion"));
				a.setAgentefechamodificacion(rs.getString("agentefechamodificacion"));
				lista.add(a);
			}while(rs.next());
		}
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}finally{
			dbConf.closeConnection(conn, ps, rs);
		}
		
		
		return null;
	}
	
	
}
