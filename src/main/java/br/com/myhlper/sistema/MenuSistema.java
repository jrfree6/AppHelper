package br.com.myhlper.sistema;

import java.util.List;

import javax.persistence.Query;

import br.com.myhelper.repository.entity.MenuSitemaEntity;
import br.com.myhelper.uteis.Uteis;

public class MenuSistema {
	
	public MenuSistema() {
		System.out.println("Usuario logado...");
		action2();
		
	}
	
	/** sql query native exemplo ...*/
	private void action2() {
//		Connection jpa = ((oracle.toplink.essentials.ejb.cmp3.EntityManager) em).getServerSession().getDefaultConnectionPool().acquireConnection().getConnection();
//		Query query  = Uteis.JpaEntityManager().createNativeQuery("insert into tb_usuario values(2,'estagirario',12345);");
//		List lista = query.getResultList();
		

		try {
			 
			Query query = Uteis.JpaEntityManager().createNativeQuery("select id, idpai, nome, descricao, novajanela from modulo order by id, idpai");
			List results = query.getResultList();
			// 0     1    2      3            4       
			//id, idpai, nome, descricao, novajanela
			String itemAnterior="";
			String item="";
			String menuBar = new String("");
			int id=0, idpai=0, idAnterior=0;
			for (int i=0; i < results.size(); i++) {
				Object[] obj =(Object[]) results.get(i);
				
			}
			/*
			 <p:menubar>
			<p:submenu label="File" icon="ui-icon-document">
	            <p:submenu label="New" icon="ui-icon-contact">
	                <p:menuitem value="Project" url="#" />
	                <p:menuitem value="Other" url="#" />
	            </p:submenu>
	            <p:menuitem value="Open" url="#" />
	            <p:separator />
	            <p:menuitem value="Quit" url="#" />
	        </p:submenu>
			<p:menuitem value="Home" icon="ui-icon-home" url="home.xhtml" />
			<p:menuitem value="Cadastro" icon="ui-icon-document" url="cadastrarPessoa.xhtml"/>
			<p:menuitem value="Consulta" icon="ui-icon-document" />
			<p:menuitem value="Lancamentos" icon="ui-icon-document" />
			<p:menuitem value="Relatórios" icon="ui-icon-document" />
			<p:menuitem value="Exportar XML Pessoa" icon="ui-icon-document" />
 
			 */
	 
		} catch (Exception e) {
			System.out.println("Deu merda...");
			e.printStackTrace();
		}
	}

}
