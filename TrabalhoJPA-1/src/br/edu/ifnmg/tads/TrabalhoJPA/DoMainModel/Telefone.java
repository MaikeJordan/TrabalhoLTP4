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
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTelefone;
    
    @Column(name="numero")
    private int numero;

    public Telefone(Long idTelefone, int numero) {
        this.idTelefone = idTelefone;
        this.numero = numero;
    }

    
    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelefone != null ? idTelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.idTelefone == null && other.idTelefone != null) || (this.idTelefone != null && !this.idTelefone.equals(other.idTelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.Telefone[ id=" + idTelefone + " ]";
    }
    
}
