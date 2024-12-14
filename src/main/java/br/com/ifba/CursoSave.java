/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author Glauber
 */
import br.com.ifba.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CursoSave {
    public static void main(String[] args) {

        // Cria o objeto Curso
        Curso curso = new Curso();
        curso.setNome("Análise e Desenvolvimento de Sistemas");
        curso.setCodigoCurso("ADS");
        curso.setAtivo(true);

        
    }
}
