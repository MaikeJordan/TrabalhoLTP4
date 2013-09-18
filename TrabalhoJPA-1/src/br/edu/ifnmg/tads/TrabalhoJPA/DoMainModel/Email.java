
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
import javax.persistence.Table;

/**
 *
 * @author HERICK
 */
@Entity
@Table(name="emails")
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmail;
    
    @Column(name="nome", length=16)
    private String nome;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="idPessoa")
    private Pessoa idPessoa;

    public Email(Long codEmail, Pessoa pessoa) {
        this.idEmail = codEmail;
        this.idPessoa = pessoa;
    }
    
    public Email() {
        this.idEmail = null;
        this.idPessoa = null;
    }
    
    public Long getCodEmail() {
        return idEmail;
    }

    public void setCodEmail(Long codEmail) {
        this.idEmail = codEmail;
    }

    public Pessoa getPessoa() {
        return idPessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.idPessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmail != null ? idEmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Email)) {
            return false;
        }
        Email other = (Email) object;
        if ((this.idEmail == null && other.idEmail != null) || (this.idEmail != null && !this.idEmail.equals(other.idEmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.ltpiv.DoMain.Email[ id=" + idEmail + " ]";
    }
}