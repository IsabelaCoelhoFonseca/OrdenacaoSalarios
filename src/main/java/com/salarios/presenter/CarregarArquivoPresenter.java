package com.salarios.presenter;

import com.salarios.model.SalariosModel;
import com.salarios.view.OrdenacaoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.salarios.model.SalariosModel.LerArquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarregarArquivoPresenter {
    private OrdenacaoView view;
    private SalariosModel Salarios;
    private final ArrayList<Object> salarios;
    
    public CarregarArquivoPresenter(OrdenacaoView view) {
        this.view = view;
        salarios = new ArrayList<>();
        
        view.getBtnCarregarArquivo().addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LerArquivo("teste.txt");
                } catch (IOException ex) {
                    Logger.getLogger(CarregarArquivoPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
         
            
           

        });
        
    }

}

