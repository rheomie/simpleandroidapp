package id.blits.myapps.form;

import android.app.Activity;
import android.widget.ListView;
import id.blits.myapps.R;

/**
 * Created by Sanriomi Sintaro on 02/05/2014.
 */
public class DaftarForm  {
    private Activity activity;
    private ListView listViewDaftarKontak;

    public DaftarForm(Activity activity){
        this.activity = activity;

        listViewDaftarKontak = (ListView) activity.findViewById(R.id.daftar_listViewKontak);

    }

    public Activity getActivity() {
        return activity;
    }

    public ListView getListViewDaftarKontak() {
        return listViewDaftarKontak;
    }
}
