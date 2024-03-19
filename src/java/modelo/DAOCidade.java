/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 15937447654
 */
public class DAOCidade {
    String mensagem = "";
    
    public List<Cidade> listarCidade(){
        String sql = "select * from cidade";
        List<Cidade> listaCiade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objCidade = new Cidade();
                objCidade.setCodigoCidade(rs.getInt("codigo"));
                objCidade.setNomeCidade(rs.getString("nome"));
                objCidade.setUfCidade(rs.getString("uf"));
                listaCiade.add(objCidade);
            }
        }catch(SQLException ex){
            System.out.println("Erro no listaCidade do DAOCidade: ");
        }
        return listaCiade;
    }
    
    public String inserirCidade(Cidade objCidade){
        String sql = "insert into cidade (nome, uf) values(?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objCidade.getNomeCidade());
            pst.setString(2, objCidade.getUfCidade());
            if(pst.executeUpdate()>0){
                mensagem = "Cidade cadastrada com sucesso!";
            }else{
                mensagem = "Cidade não cadastrada";
            }
        }catch(SQLException ex){
            mensagem = "Erro de SQL no método 'inserirCidade' da classe 'DAOCIdade': "+ex.getMessage()+"\n Comando SQL: "+sql;
        }
        return mensagem;
    }
    
}
