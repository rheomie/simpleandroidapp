package id.blits.myapps.database;

import id.blits.myapps.model.Kontak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanriomi Sintaro on 01/05/2014.
 */
public class KontakDatabase {

    private static final KontakDatabase KONTAK_DATABASE = new KontakDatabase();

    public static KontakDatabase getInstance() {
        return KontakDatabase.KONTAK_DATABASE;
    }

    private KontakDatabase(){
        //class singeleton
    }

    private List<Kontak> list = new ArrayList<Kontak>();

    public void add(Kontak kontak){
        list.add(kontak);
    }

    public List<Kontak> findAll(){
        return list;
    }
}
