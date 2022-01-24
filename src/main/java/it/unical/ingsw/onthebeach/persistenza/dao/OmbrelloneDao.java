package it.unical.ingsw.onthebeach.persistenza.dao;

import it.unical.ingsw.onthebeach.model.Ombrellone;

public interface OmbrelloneDao {
    public boolean saveOrUpdate(Ombrellone ombrellone);
    public Ombrellone findByPrimaryKey(long id);
    public boolean delete(Ombrellone ombrellone);
    public boolean switchOccupato(Ombrellone ombrellone);
}
