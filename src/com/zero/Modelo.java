/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zero;

import java.util.ArrayList;

/**
 *
 * @author thiago
 */
public class Modelo {

    private ArrayList<String> palavra = new ArrayList();
    private ArrayList<Integer> quantidade = new ArrayList();

    public void clear() {
        for (int i = 0; i < palavra.size(); i++) {
            this.palavra.remove(i);
        }
        for (int i = 0; i < quantidade.size(); i++) {
            this.quantidade.remove(i);
        }
    }

    public Integer getSize() {
        int size = 0;

        try {

            size = this.palavra.size();

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());
            return null;

        }

        return size;
    }

    public void setPalavra(String aPalavra) {
        try {

            this.palavra.add(aPalavra);

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());

        }

    }

    public void setQuantidade(Integer aQuantidade) {

        try {

            this.quantidade.add(aQuantidade);

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());

        }
    }

    public String getPalavra(int index) {
        return palavra.get(index);
    }

    public Integer getQuantidade(int index) {
        return quantidade.get(index);
    }

}
