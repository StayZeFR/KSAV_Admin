package fr.btssio.ksav_admin.models.entities;

import java.sql.Date;
import java.time.LocalDateTime;

public class UtilisateurRoleAgenceEntity implements Entity {
    
    private int IDUTILISATEUR;
    private int IDROLE;
    private String LIBELLE;
    private String PSEUDO;
    private String NOM;
    private String PRENOM;
    private Date DATENAISSANCE;
    private int SEXE;
    private LocalDateTime DATECREATION;
    private int IDAGENCE;
    private String RAISONSOCIAL;
    
    public UtilisateurRoleAgenceEntity(int idUtilisateur, int idRole, String libelle, String pseudo, String nom, String prenom, Date dateNaissance, int sexe, LocalDateTime dateCreation, int idAgence, String raisonSocial) {
        this.IDUTILISATEUR = idUtilisateur;
        this.IDROLE = idRole;
        this.LIBELLE = libelle;
        this.PSEUDO = pseudo;
        this.NOM = nom;
        this.PRENOM = prenom;
        this.DATENAISSANCE = dateNaissance;
        this.SEXE = sexe;
        this.DATECREATION = dateCreation;
        this.IDAGENCE = idAgence;
        this.RAISONSOCIAL = raisonSocial;
    }
    
    public UtilisateurRoleAgenceEntity() {}

    public int getIdUtilisateur() {
        return this.IDUTILISATEUR;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.IDUTILISATEUR = idUtilisateur;
    }

    public int getIdRole() {
        return this.IDROLE;
    }

    public void setIdRole(int idRole) {
        this.IDROLE = idRole;
    }

    public String getLibelle() {
        return this.LIBELLE;
    }

    public void setLibelle(String libelle) {
        this.LIBELLE = libelle;
    }
    
    public String getPseudo() {
        return this.PSEUDO;
    }
    
    public void setPseudo(String pseudo) {
        this.PSEUDO = pseudo;
    }

    public String getNom() {
        return this.NOM;
    }

    public void setNom(String nom) {
        this.NOM = nom;
    }

    public String getPrenom() {
        return this.PRENOM;
    }

    public void setPrenom(String prenom) {
        this.PRENOM = prenom;
    }

    public Date getDateNaissance() {
        return this.DATENAISSANCE;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.DATENAISSANCE = dateNaissance;
    }

    public int getSexe() {
        return this.SEXE;
    }

    public void setSexe(int sexe) {
        this.SEXE = sexe;
    }

    public LocalDateTime getDateCreation() {
        return this.DATECREATION;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.DATECREATION = dateCreation;
    }
    
    public int getIdAgence() {
        return this.IDAGENCE;
    }
    
    public void setIdAgence(int idAgence) {
        this.IDAGENCE = idAgence;
    }
    
    public String getRaisonSocial() {
        return this.RAISONSOCIAL;
    }
    
    public void setRaisonSocial(String raisonSocial) {
        this.RAISONSOCIAL = raisonSocial;
    }
    
}
