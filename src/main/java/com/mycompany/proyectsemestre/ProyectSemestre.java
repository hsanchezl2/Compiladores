/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectsemestre;

import com.mycompany.proyectocup.ProyectoCup;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import umg.compiladores.parser;
import umg.compiladores.Lexer;
import umg.compiladores.parser;


/**
 *
 * @author PC
 */
public class ProyectSemestre {

    public static void main(String[] args) throws FileNotFoundException {
      String javaCode = "/* Código fuente en Java */";
        String pythonCode = JavaToPythonTranslator.translate(javaCode);
        System.out.println(pythonCode);
        try {
            Reader r = new FileReader("/Users/PC/Desktop/prueba.txt");
            umg.compiladores.Lexer lex = new umg.compiladores.Lexer(r);
            parser p = new parser(lex);
            p.parse();
        } catch (Exception ex) {
            Logger.getLogger(ProyectoCup.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    } 
}
        
    
    
        
    

