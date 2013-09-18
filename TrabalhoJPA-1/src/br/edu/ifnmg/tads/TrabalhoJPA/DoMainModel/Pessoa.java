/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author HERICK
 */
@Entity
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPessoa")
    private Long idPessoa;
    
    @Column(name="nome")
    private String Nome;
    
    @Column(name="rg")
    private String rg;
    
    @Column(name="cpf")
    private String cpf;
    
    @Column(name="datanascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Endereco.class)
    @JoinColumn(name = "idPessoa")
    private List<Endereco> enderecos;
    
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Email.class)
    @JoinColumn(name = "idPessoa")
    private List<Email> emails;
    
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Telefone.class)
    @JoinColumn(name = "idPessoa")
    private List<Telefone> telefones;

    public Pessoa(Long idPessoa, String Nome, String rg, String cpf, Date dataNascimento, List<Endereco> enderecos, List<Email> emails, List<Telefone> telefones) {
        this.idPessoa = idPessoa;
        this.Nome = Nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
        this.emails = emails;
        this.telefones = telefones;
    }

    public Pessoa() {
        this.idPessoa = null;
        this.Nome = "";
        this.rg = "";
        this.cpf = "";
        this.dataNascimento = null;
        this.enderecos = null;
        this.emails = null;
        this.telefones = null;
    }
    
    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.Pessoa[ id=" + idPessoa + " ]";
    }
    
}
