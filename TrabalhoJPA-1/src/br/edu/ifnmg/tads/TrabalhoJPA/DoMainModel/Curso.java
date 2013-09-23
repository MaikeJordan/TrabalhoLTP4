/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author HERICK
 */
@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idCurso")
    private Long idCurso;

    @Column(name="nome", length=50)
    private String nome;
    
    @Column(name="duracao")
    private int duracao;
    
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Disciplina.class)
    @JoinColumn(name = "idCurso")
    private List<Disciplina> disciplinas;

    public Curso() {
        this.idCurso = null;
        this.nome = "";
        this.duracao = 0;
        this.disciplinas = new LinkedList<>();
    }

    public Curso(Long idCurso, String nome, int duracao, List<Disciplina> disciplinas) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = disciplinas;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.TrabalhoJPA.DoMainModel.Curso[ id=" + idCurso + " ]";
    }
    
}
