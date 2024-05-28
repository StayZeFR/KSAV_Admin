package fr.btssio.ksav_admin.models.DAO;

import fr.btssio.ksav_admin.models.entities.AgenceEntity;
import fr.btssio.ksav_admin.models.entities.RoleEntity;
import fr.btssio.ksav_admin.models.querybuilder.QueryBuilder;
import java.util.List;

public class AgenceDAO extends DAO {
    
    /**
     * Permet de retourner la liste des agences
     *
     * @return Liste de agence
     */
    public List<AgenceEntity> getAll() {
        QueryBuilder builder = new QueryBuilder();
        builder.select("*").from("agence");
        return this.request(builder.build(), AgenceEntity.class);
    }
    
}
