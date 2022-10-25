package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReajustePeriodicidade implements ValidacaoReajuste{
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dateToday = LocalDate.now();
        LocalDate dateEmployee = funcionario.getDataUltimoReajuste();
        long periodicity = ChronoUnit.MONTHS.between(dateEmployee,dateToday);
        if(periodicity < 6){
            throw new ValidacaoException("A periodicidade tem que ser mais de 6 meses");
        }
    }
}
