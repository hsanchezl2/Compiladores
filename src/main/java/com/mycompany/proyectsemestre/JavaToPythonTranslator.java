/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectsemestre;

/**
 *
 * @author PC
 */
class JavaToPythonTranslator {

    static String translate(String javaCode){
    String pythonCode = javaCode
                .replaceAll("\\bpublic\\b", "")
                .replaceAll("\\bprivate\\b", "")
                .replaceAll("\\bprotected\\b", "")
                .replaceAll("\\bclass\\b", "class")
                .replaceAll("\\bint\\b", "int")
                .replaceAll("\\bfloat\\b", "float")
                .replaceAll("\\bdouble\\b", "float")
                .replaceAll("\\bString\\b", "str")
                .replaceAll("\\bboolean\\b", "bool")
                .replaceAll("\\bSystem\\.out\\.println\\b", "print");

        // Reemplazar tipos de datos y literales
        pythonCode = pythonCode
                .replaceAll("\\bInteger\\b", "int")
                .replaceAll("\\bDouble\\b", "float")
                .replaceAll("\\bBoolean\\b", "bool")
                .replaceAll("\\btrue\\b", "True")
                .replaceAll("\\bfalse\\b", "False")
                .replaceAll("\"", "'");

        // Reemplazar estructuras de control
        pythonCode = pythonCode
                .replaceAll("\\bif\\b", "if")
                .replaceAll("\\belse\\b", "else")
                .replaceAll("\\bfor\\b", "for")
                .replaceAll("\\bwhile\\b", "while")
                .replaceAll("\\bdo\\b", "while True");

        // Reemplazar operadores aritméticos
        pythonCode = pythonCode
                .replaceAll("\\+", "+")
                .replaceAll("\\-", "-")
                .replaceAll("\\*", "*")
                .replaceAll("\\/", "/")
                .replaceAll("\\%", "%")
                .replaceAll("\\+\\+", "+=")
                .replaceAll("\\-\\-", "-=");

        // Reemplazar operadores de comparación
        pythonCode = pythonCode
                .replaceAll("\\=\\=", "==")
                .replaceAll("\\!\\=", "!=")
                .replaceAll("\\>", ">")
                .replaceAll("\\<", "<")
                .replaceAll("\\>\\=", ">=")
                .replaceAll("\\<\\=", "<=");

        // Reemplazar operadores lógicos
        pythonCode = pythonCode
                .replaceAll("\\&\\&", "and")
                .replaceAll("\\|\\|", "or")
                .replaceAll("\\!", "not");
        return pythonCode;    
    }
    
}
