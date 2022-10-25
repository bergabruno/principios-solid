package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {


    public void promover(Funcionario funcionario, Boolean meta){
        Cargo cargo = funcionario.getCargo();
        if(Cargo.GERENTE == cargo){
            throw new ValidacaoException("Gerentes nao podem ser promovidos");
        }

        if(meta){
            Cargo novoCargo = cargo.getNextCargo();
            funcionario.promote(novoCargo);
        }else{
            throw new ValidacaoException("Funcionario nao bateu a meta");
        }
    }
}
