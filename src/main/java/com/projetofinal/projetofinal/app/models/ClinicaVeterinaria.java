package com.projetofinal.projetofinal.app.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClinicaVeterinaria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_clinica")
    private Long idClinica;

    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String celular;
    private String email;
    private String horarioFuncionamento;
    private String responsavelTecnico;
    private String crmv;
    private String servicos;
    private String site;
    private String redesSociais;

    @Column(name = "imagem_logo")
    private String imagemLogo;

    // construtor vazio
    public ClinicaVeterinaria() {}

    // getters e setters
    public Long getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Long idClinica) {
        this.idClinica = idClinica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

        public String getCrmv() {
            return crmv;
        }
    
        public void setCrmv(String crmv) {
            this.crmv = crmv;
        }
    
        public String getServicos() {
            return servicos;
        }
    
        public void setServicos(String servicos) {
            this.servicos = servicos;
        }
    
        public String getSite() {
            return site;
        }
    
        public void setSite(String site) {
            this.site = site;
        }
    
        public String getRedesSociais() {
            return redesSociais;
        }
    
        public void setRedesSociais(String redesSociais) {
            this.redesSociais = redesSociais;
        }
    
        public String getImagemLogo() {
            return imagemLogo;
        }
    
        public void setImagemLogo(String imagemLogo) {
            this.imagemLogo = imagemLogo;
        }
    }
