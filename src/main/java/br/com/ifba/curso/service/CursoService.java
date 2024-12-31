/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.List;


/**
 *
 * @author Glauber
 */
public class CursoService implements CursoIService {
    //Curso service com os atributos
    private final CursoIDao cursoDao = new CursoDao();

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoDao.save(curso);
        }
    }
    
    @Override
    public void delete(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
             cursoDao.save(curso);
        }
    }
    
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoDao.update(curso);
        }
    }
    
    @Override
    public Curso findById(Long curso) throws RuntimeException {
        if(curso == null){
            throw new RuntimeException ("Dados do" + " Curso nao preenchidos");
        } else {
            return cursoDao.findById(curso);
        }
        
    }
    
     @Override
     public List <Curso> findAll() throws RuntimeException {
         return cursoDao.findAll();
     } 
     
    @Override
    public Curso findByCodCurso(String codcurso) {
        if(codcurso == null){
            throw new RuntimeException ("Primeiramente preencha o Codigo do curso");
        } else {
             return cursoDao.findByCodCurso(codcurso);
        }
    } 
    
}