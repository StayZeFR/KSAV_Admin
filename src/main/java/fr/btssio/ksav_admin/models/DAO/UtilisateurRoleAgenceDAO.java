package fr.btssio.ksav_admin.models.DAO;

import fr.btssio.ksav_admin.models.entities.UtilisateurRoleAgenceEntity;
import fr.btssio.ksav_admin.models.querybuilder.QueryBuilder;
import java.util.List;

public class UtilisateurRoleAgenceDAO extends DAO {
    
    /**
     * Permet de retourner une liste d'entité utilisateur avec une jointure sur les roles et les agences
     * 
     * @return Objet utilisateur role entitie
     */
    public List<UtilisateurRoleAgenceEntity> getAll() {
        QueryBuilder builder = new QueryBuilder();
        builder.select("u.IDUTILISATEUR", "r.IDROLE", "r.LIBELLE", "u.PSEUDO", "u.NOM", "u.PRENOM", "u.DATENAISSANCE", "u.SEXE", "u.DATECREATION", "a.IDAGENCE", "a.RAISONSOCIAL");
        builder.from("utilisateur u").join("role r", "u.IDROLE = r.IDROLE").leftJoin("agence a", "u.IDAGENCE = a.IDAGENCE").groupBy("IDUTILISATEUR");
        return this.request(builder.build(), UtilisateurRoleAgenceEntity.class);
    }
    
    /**
     * Permet de retourner une liste d'entité utilisateur avec une jointure sur les roles et les agences en vérifiant l'id agence
     * 
     * @param id Identifiant de l'agence
     * @return Objet utilisateur role entitie
     */
    public List<UtilisateurRoleAgenceEntity> getByAgence(int id) {
        QueryBuilder builder = new QueryBuilder();
        builder.select("u.IDUTILISATEUR", "r.IDROLE", "r.LIBELLE", "u.PSEUDO", "u.NOM", "u.PRENOM", "u.DATENAISSANCE", "u.SEXE", "u.DATECREATION", "a.IDAGENCE", "a.RAISONSOCIAL");
        builder.from("utilisateur u").join("role r", "u.IDROLE = r.IDROLE").leftJoin("agence a", "u.IDAGENCE = a.IDAGENCE").where("u.IDAGENCE = ?", id).groupBy("IDUTILISATEUR");
        return this.request(builder.build(), builder.getParams(), UtilisateurRoleAgenceEntity.class);
    }
    
}
