package fr.btssio.ksav_admin.models.entities;

import fr.btssio.ksav_admin.models.entities.annotations.PrimaryKey;

public class AgenceEntity implements Entity {
    
    @PrimaryKey
    private int IDAGENCE;
    private String RAISONSOCIAL;
    private String SIRET;
    private String ADRESSE;
    private int TELEPHONE;
    private String EMAIL;

    public AgenceEntity(int IDAGENCE, String RAISONSOCIAL, String SIRET, String ADRESSE, int TELEPHONE, String EMAIL) {
        this.IDAGENCE = IDAGENCE;
        this.RAISONSOCIAL = RAISONSOCIAL;
        this.SIRET = SIRET;
        this.ADRESSE = ADRESSE;
        this.TELEPHONE = TELEPHONE;
        this.EMAIL = EMAIL;
    }
    
    public AgenceEntity() {}

    public int getIDAGENCE() {
        return IDAGENCE;
    }

    public void setIDAGENCE(int IDAGENCE) {
        this.IDAGENCE = IDAGENCE;
    }

    public String getRAISONSOCIAL() {
        return RAISONSOCIAL;
    }

    public void setRAISONSOCIAL(String RAISONSOCIAL) {
        this.RAISONSOCIAL = RAISONSOCIAL;
    }

    public String getSIRET() {
        return SIRET;
    }

    public void setSIRET(String SIRET) {
        this.SIRET = SIRET;
    }

    public String getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(String ADRESSE) {
        this.ADRESSE = ADRESSE;
    }

    public int getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(int TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    @Override
    public String toString() {
        return this.RAISONSOCIAL;
    }
    
}
