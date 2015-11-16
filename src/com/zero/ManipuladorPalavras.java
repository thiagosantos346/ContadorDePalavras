
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

        int t = param.length;
        int i, j, l;
        String[] listaPalavras = param;

        String[] novaListaPalavras = new String[t];
        ArrayList<String> newArray = new ArrayList(); 
        ArrayList<Integer> newArrayId = new ArrayList();

        Integer[] quantidadeItemPalvra = new Integer[t];

        ArrayList<String> tabela = new ArrayList();
        ArrayList<String> quantidade = new ArrayList();

        for (int r = 0; r < t; r++) {

            quantidadeItemPalvra[r] = 0;
            //inicialisando os itens do vetor;

        }

        for (i = 0; i < listaPalavras.length; i++) {
            try {
                
                boolean acho = false;
                
                if (listaPalavras[i] != null) {
                    
                    for (j = 0 ; j < listaPalavras.length; j++) {
                        newArray.add("");
                        if (listaPalavras[i].equals(listaPalavras[j])) {
                            
                            l = 0;

                            while ((l < listaPalavras.length) && (acho == false)) {

                               
                                
                                if (!newArray.get(j).equals(novaListaPalavras[l]) && acho == false) {

                                    //novaListaPalavras[j] = listaPalavras[j];
                                    newArray.add(listaPalavras[j]);
                                    
                                    acho = true;

                                }

                                l++;

                            }
                        }

                    }

                }
            } catch (NullPointerException e) {

                System.out.println(e.getMessage()+": Line 75\n "+e.getLocalizedMessage());

            }
        }

        for (int a = 0; a < newArray.size(); a++) {
            int add = 0;
            for(int b = 0; b < listaPalavras.length; b++) {

                try {
                    if (newArray.get(a).equals(listaPalavras[b]) == true) {

                        //quantidadeItemPalvra[a]++;
                        newArrayId.add(add++);

                    }
                } catch (NullPointerException e) {
                    System.out.print(e.getMessage());
                }

            }

        }

        for (int n = 0; n < listaPalavras.length; n++) {
            if (!(novaListaPalavras[n] == null)) {

                try {

                    tabela.add( newArray.get(n));
                    quantidade.add( newArrayId.get(n).toString());

                    formulario.setPalavra(newArray.get(n));
                    formulario.setQuantidade(newArrayId.get(n));

                } catch (NullPointerException e) {

                    System.out.printf(e.getMessage());

                }

            }

        }

    }

}
