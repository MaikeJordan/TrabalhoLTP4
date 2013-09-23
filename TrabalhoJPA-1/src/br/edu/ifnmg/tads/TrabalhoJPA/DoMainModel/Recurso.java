/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author HERICK
 */
@Entity
public class Recurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRecurso;

    @Column(name="nome", length=55)
    private String Nome;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="idTipoRecurso")
    private TipoRecurso idTipoRecurso;

    public Recurso(Long idRecurso, String Nome, TipoRecurso tiporecurso) {
        this.idRecurso = idRecurso;
        this.Nome = Nome;
        this.idTipoRecurso = tiporecurso;
    }
    
    public Recurso() {
        this.idRecurso = null;
        this.Nome = "";
        this.idTipoRecurso = null;
    }

    public Long getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public TipoRecurso getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(TipoRecurso idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }
        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecurso != null ? idRecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recurso)) {
            return false;
        }
        Recurso other = (Recurso) object;
        if ((this.idRecurso == null && other.idRecurso != null) || (this.idRecurso != null && !this.idRecurso.equals(other.idRecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.Recurso[ id=" + idRecurso + " ]";
    }
    
}
