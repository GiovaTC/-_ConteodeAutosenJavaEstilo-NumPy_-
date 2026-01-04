# -_ConteodeAutosenJavaEstilo-NumPy_- :. 
## 🚗 Conteo de Autos en Java (Estilo NumPy) .

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/902eb33f-e125-4fb4-bd94-a0395d43e21c" />  

<img width="1281" height="1079" alt="image" src="https://github.com/user-attachments/assets/052927c5-7657-47ba-8669-4b0e97808d90" />    

📌 Descripción general

Este proyecto presenta una solución completa y ejecutable en Java, desarrollada para IntelliJ IDEA, que implementa un conteo de autos al estilo Python + NumPy, pero 100 % en Java.

El programa simula operaciones típicas de NumPy como:

numpy.unique

numpy.count_nonzero

Operaciones sobre arreglos y matrices

Todo esto se logra mediante arreglos, estructuras de datos y procesamiento vectorizado simulado, con resultados mostrados en una interfaz gráfica Swing.

## 🎯 Funcionalidades principales

Simulación de entrada de datos tipo NumPy array

Conteo de autos por tipo

Cálculo del total de registros

Visualización de resultados en interfaz gráfica

Arquitectura modular y limpia

## 🧠 Concepto equivalente en Python / NumPy

En Python con NumPy, el comportamiento sería similar a:

import numpy as np

autos = np.array(["Sedan","SUV","SUV","Camioneta"])
unique, counts = np.unique(autos, return_counts=True)


Este proyecto replica esa lógica en Java.

## 📂 Estructura del proyecto
* ConteoAutos/
* ├── src/
* │   ├── model/
* │   │   └── AutoData.java
* │   ├── service/
* │   │   └── AutoCounter.java
* │   └── ui/
* │       └── ConteoAutosUI.java

## 🧠 1. Modelo de datos (Array tipo NumPy)
📄 AutoData.java
package model;

public class AutoData {

    // Simulación tipo NumPy array
    public static String[] AUTOS = {
            "Sedan", "SUV", "Sedan", "Camioneta",
            "SUV", "SUV", "Sedan", "Pickup",
            "Camioneta", "Sedan", "Pickup"
    };
}

## ⚙️ 2. Procesamiento tipo NumPy
📄 AutoCounter.java
package service;

import java.util.HashMap;
import java.util.Map;

public class AutoCounter {

    // Equivalente a numpy.unique + count
    public static Map<String, Integer> contarAutos(String[] autos) {

        Map<String, Integer> conteo = new HashMap<>();

        for (String auto : autos) {
            conteo.put(auto, conteo.getOrDefault(auto, 0) + 1);
        }

        return conteo;
    }

    // Conteo total (similar a numpy.size)
    public static int totalAutos(String[] autos) {
        return autos.length;
    }
}

## 🖥️ 3. Interfaz gráfica (Swing)
📄 ConteoAutosUI.java
package ui;

import model.AutoData;
import service.AutoCounter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ConteoAutosUI extends JFrame {

    private JTextArea resultado;

    public ConteoAutosUI() {

        setTitle("Conteo de Autos (Estilo NumPy)");
        setSize(420, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        resultado = new JTextArea();
        resultado.setEditable(false);
        resultado.setFont(new Font("Consolas", Font.PLAIN, 14));

        JButton btnContar = new JButton("Procesar Conteo");
        btnContar.addActionListener(e -> procesar());

        add(new JScrollPane(resultado), BorderLayout.CENTER);
        add(btnContar, BorderLayout.SOUTH);
    }

    private void procesar() {

        resultado.setText("=== Conteo de Autos ===\n\n");

        Map<String, Integer> conteo =
                AutoCounter.contarAutos(AutoData.AUTOS);

        conteo.forEach((tipo, cantidad) ->
                resultado.append(tipo + " : " + cantidad + "\n")
        );

        resultado.append("\nTotal de autos: "
                + AutoCounter.totalAutos(AutoData.AUTOS));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new ConteoAutosUI().setVisible(true));
    }
}

## ▶️ Ejecución del programa

Abrir IntelliJ IDEA

Crear un proyecto Java

Crear los paquetes:

model

service

ui

Copiar las clases respetando los nombres y paquetes

Ejecutar ConteoAutosUI.java

## 📊 Resultado esperado (ejemplo)
=== Conteo de Autos ===

Sedan : 4
SUV : 3
Camioneta : 2
Pickup : 2

Total de autos: 11

## 🧩 Características técnicas

✔ Arreglos (equivalente a NumPy array)

✔ Conteo vectorizado simulado

✔ Complejidad eficiente O(n)

✔ Interfaz gráfica profesional (Swing)

✔ Código limpio, modular y mantenible

✔ Compatible con IntelliJ IDEA
