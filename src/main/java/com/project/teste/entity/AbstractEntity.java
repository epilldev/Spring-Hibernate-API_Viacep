package com.project.teste.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/*
 * Classe base para todas as entidades do projeto.
 *
 * Centraliza atributos e comportamentos comuns,
 * evitando repetição de código nas entidades.
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

    /*
     * Identificador único da entidade.
     *
     * O valor será gerado automaticamente pelo banco.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    /*
     * Retorna o ID da entidade.
     */
    public ID getId() {
        return id;
    }

    /*
     * Define o ID da entidade.
     */
    public void setId(ID id) {
        this.id = id;
    }

    /*
     * Gera hash da entidade baseado no ID.
     *
     * Importante para funcionamento correto
     * em coleções e comparações.
     */
    @Override
    public int hashCode() {

        final int prime = 31;

        int result = 1;

        result = prime * result
                + ((id == null) ? 0 : id.hashCode());

        return result;
    }

    /*
     * Compara entidades pelo ID.
     *
     * Duas entidades são consideradas iguais
     * quando possuem o mesmo identificador.
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        AbstractEntity<?> other = (AbstractEntity<?>) obj;

        if (id == null) {
            return other.id == null;
        }

        return id.equals(other.id);
    }

    /*
     * Representação textual simples da entidade.
     */
    @Override
    public String toString() {
        return "id = " + id;
    }
}