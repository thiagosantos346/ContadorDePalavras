/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contador.gui;


import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author thiag
 */
public class FileDir {
    
   
    
    private String extension;
    private String nameExtension;
    private final String DIR_DEFAULT = System.getProperty("user.home")+"/desktop";
    private final File dir = new File(DIR_DEFAULT);
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo de Texto", "txt");
    
    FileDir( )
    {
        
      
        
    }
    
    public String getDIR_DEFAULT() {
        return DIR_DEFAULT;
    }

    public File getDir() {
        return dir;
    }
    
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNameExtension() {
        return nameExtension;
    }

    public void setNameExtension(String nameExtension) {
        this.nameExtension = nameExtension;
    }

    public FileNameExtensionFilter getFiltro() {
        return filtro;
    }

    public void setFiltro(FileNameExtensionFilter filtro) {
        this.filtro = filtro;
    }

    
    
    public String search()
    {
    
        FileDir fileExtention = new FileDir();
        
        JFileChooser choose = new JFileChooser();
        
        choose.setCurrentDirectory(fileExtention.getDir());
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        choose.setAcceptAllFileFilterUsed(false);
        choose.addChoosableFileFilter(fileExtention.getFiltro());
        String fileLocal = "";
        
        int retorno = choose.showOpenDialog(null);
        if(retorno  == JFileChooser.APPROVE_OPTION)
        {
            fileLocal = choose.getSelectedFile().getAbsolutePath();
            return fileLocal;
        }
        else
        {
            return null;
        }
        
    
    }
    
    
    
}
