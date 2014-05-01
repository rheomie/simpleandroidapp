package id.blits.myapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import id.blits.myapps.database.KontakDatabase;
import id.blits.myapps.form.BuatForm;
import id.blits.myapps.model.Kontak;

/**
 * Created by Sanriomi Sintaro on 02/05/2014.
 */
public class BuatActivity extends Activity implements View.OnClickListener{
    private BuatForm form;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buat);

        form = new BuatForm(this);
        form.getButtonSimpan().setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Kontak kontak = new Kontak();
        kontak.nama = form.getEditTextNama().getText().toString();
        kontak.nomor = form.getEditTextTelepon().getText().toString();
        kontak.email = form.getEditTextEmail().getText().toString();

        KontakDatabase database = KontakDatabase.getInstance();
        database.add(kontak);

        //reset
        form.reset();
    }

}
