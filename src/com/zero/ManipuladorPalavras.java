
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zero;

import java.util.ArrayList;

/**
 *
 * @author thiag
 */

public class ManipuladorPalavras {

    private Modelo formulario = new Modelo();

    public Modelo getFormulario() {
        return formulario;
    }

    public void run(String[] param) {

        formulario.clear();
        SelecionarPalavras run = new SelecionarPalavras();
        int t = param.length;
        int i, j, l;
        String[] listaPalavras = param;

        String[] novaListaPalavras = new String[t];
        ArrayList<String> newArray = new ArrayList();
        ArrayList<Integer> newArrayId = new ArrayList();

        Integer[] quantidadeItemPalvra = new Integer[t];

        newArray = run.runN(param);
        
        for (int a = 0; a < newArray.size(); a++) {
            int add = 0;
            for (int b = 0; b < listaPalavras.length; b++) {

                try {
                    if (newArray.get(a).equals(listaPalavras[b]) == true) {

                        //quantidadeItemPalvra[a]++;
                        //newArrayId.add(add++);
                       // newArrayId.add(add++, a );
                        add++;

                    }
                } catch (NullPointerException e) {
                    System.out.print(e.getMessage());
                }
                
                if(a == (newArray.size()) - 1)
                {
                    newArrayId.add(add);
                }
            }

        }

        for (int n = 0; n < newArrayId.size()-1; n++) {
            try {

                //tabela.add(newArray.get(n-1));
                //quantidade.add(newArrayId.get(n-1).toString());

                formulario.setPalavra(newArray.get(n));
                formulario.setQuantidade(newArrayId.get(n));

            } catch (NullPointerException e) {

                System.out.printf(e.getMessage());

            }

        }

    }

}
