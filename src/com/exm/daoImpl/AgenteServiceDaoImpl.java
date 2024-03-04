package com.exm.daoImpl;

import java.util.List;

import com.exm.dao.AgenteServiceDao;
import com.exm.model.Agente;
import com.exm.util.Utilerias;

public class AgenteServiceDaoImpl implements AgenteServiceDao{
	
	Utilerias util = null;
	
	public List<Agente> getAgentes() throws Exception{
		try {
			return util.obtAgentes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception(e);
		}
	} 

}
