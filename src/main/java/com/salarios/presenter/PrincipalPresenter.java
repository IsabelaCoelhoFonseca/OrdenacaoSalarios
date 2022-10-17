
package com.salarios.presenter;

import static com.salarios.model.SalariosModel.LerArquivo;
import com.salarios.view.OrdenacaoView;
import java.io.IOException;

public class PrincipalPresenter {
    
    public static void main(String args[]) throws IOException {
        new OrdenacaoView();
        LerArquivo("teste.txt");
         
    }
}
