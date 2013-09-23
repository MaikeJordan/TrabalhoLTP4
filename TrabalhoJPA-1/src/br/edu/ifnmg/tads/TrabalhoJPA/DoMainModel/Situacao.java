/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HERICK
 */
@Entity
public class Situacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idSituacao")
    private Long idSituacao;
    
    @Column(name="descricao", length=200)
    private String descricao;

    public Situacao(Long idSituacao, String descricao) {
        this.idSituacao = idSituacao;
        this.descricao = descricao;
    }

    public Situacao() {
        this.idSituacao = null;
        this.descricao = "";
    }
    
    public Long getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Long idSituacao) {
        this.idSituacao = idSituacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return idSituacao;
    }

    public void setId(Long id) {
        this.idSituacao = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSituacao != null ? idSituacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Situacao)) {
            return false;
        }
        Situacao other = (Situacao) object;
        if ((this.idSituacao == null && other.idSituacao != null) || (this.idSituacao != null && !this.idSituacao.equals(other.idSituacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.Situacao[ id=" + idSituacao + " ]";
    }
    
}
