package id.blits.myapps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import id.blits.myapps.database.KontakDatabase;
import id.blits.myapps.form.DaftarForm;
import id.blits.myapps.model.Kontak;

import java.text.Normalizer;
import java.util.List;

/**
 * Created by Sanriomi Sintaro on 02/05/2014.
 */
public class DafrarActivity extends Activity {
    private DaftarForm form;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        form = new DaftarForm(this);
        loadkontak();
    }

    private void loadkontak() {
        KontakDatabase database = KontakDatabase.getInstance();
        List<Kontak> list = database.findAll();

        ArrayAdapter<Kontak> adapter = new ArrayAdapter<Kontak>(this, android.R.layout.simple_list_item_1, list);

        form.getListViewDaftarKontak().setAdapter(adapter);
    }

}
