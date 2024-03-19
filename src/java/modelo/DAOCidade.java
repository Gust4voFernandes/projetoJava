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
    
    public String alterarCidade(Cidade objCidade){
        String sql = "update cidade set nome = ?, uf = ? where codigo=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objCidade.getNomeCidade());
            pst.setString(2, objCidade.getUfCidade());
            pst.setInt(3, objCidade.getCodigoCidade());
            if(pst.executeUpdate()>0){
                mensagem = "Cidade Alterada com sucesso!";
            }else{
                mensagem = "Cidade não Alterada";
            }
        }catch(SQLException ex){
            mensagem = "Erro de SQL no método 'alterarCidade' da classe 'DAOCIdade': "+ex.getMessage()+"\n Comando SQL: "+sql;
        }
        return mensagem;
    }
    
    public String excluirCidade(Cidade objCidade){
        String sql = "delete from cidade where codigo = ?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objCidade.getCodigoCidade());
            if(pst.executeUpdate()>0){
                mensagem = "Cidade excluida com sucesso!";
            }else{
                mensagem = "Cidade não excluida";
            }
        }catch(SQLException ex){
            mensagem = "Erro de SQL no método 'excluirCidade' da classe 'DAOCIdade': "+ex.getMessage()+"\n Comando SQL: "+sql;
        }
        return mensagem;
    }
    
}
