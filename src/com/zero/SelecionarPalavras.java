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
public class SelecionarPalavras {

    private ArrayList<String> palavraUnica = new ArrayList();

    public ArrayList<String> runN(String[] arrayWords) {

        for (int i = 0; i < (arrayWords.length-1); i++) {
            
            boolean achou = false;
            
            for (int j = 0; j < arrayWords.length; j++) {
                
                if(arrayWords[i].equals(null) == false)
                {
                    if( arrayWords[i].equals(arrayWords[j]) == true  && palavraUnica.contains(arrayWords[j]) == false )
                    {

                        palavraUnica.add(arrayWords[i]);
                        achou = true;



                    }
                }
            }

        }

        return this.palavraUnica;
    }

}
