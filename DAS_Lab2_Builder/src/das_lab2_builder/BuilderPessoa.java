/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab2_builder;

/**
 *
 * @author diogo
 */
abstract class BuilderPessoa implements IPessoa{
    protected String nome;
    protected String morada;
    abstract Pessoa createPessoa();
    
}
