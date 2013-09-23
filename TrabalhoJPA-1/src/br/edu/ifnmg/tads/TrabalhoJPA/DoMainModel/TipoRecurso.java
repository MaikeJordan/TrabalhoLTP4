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
public class TipoRecurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoRecurso;

    @Column(name="descricao", length=55)
    private String descricao;

    public TipoRecurso(Long idTipoRecurso, String descricao) {
        this.idTipoRecurso = idTipoRecurso;
        this.descricao = descricao;
    }
    
    public TipoRecurso() {
        this.idTipoRecurso = null;
        this.descricao = "";
    }

    public Long getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(Long idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoRecurso != null ? idTipoRecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecurso)) {
            return false;
        }
        TipoRecurso other = (TipoRecurso) object;
        if ((this.idTipoRecurso == null && other.idTipoRecurso != null) || (this.idTipoRecurso != null && !this.idTipoRecurso.equals(other.idTipoRecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.TipoRecurso[ id=" + idTipoRecurso + " ]";
    }
    
}
