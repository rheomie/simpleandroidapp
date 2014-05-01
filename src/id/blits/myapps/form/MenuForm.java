package id.blits.myapps.form;

import android.app.Activity;
import android.widget.Button;
import id.blits.myapps.R;

/**
 * Created by Sanriomi Sintaro on 01/05/2014.
 */
public class MenuForm {
    private Activity activity;
    private Button buttonBuatKontakBaru;
    private Button buttonDaftarBaru;

    public MenuForm(Activity activity){
        this.activity = activity;

        buttonBuatKontakBaru = (Button) activity.findViewById(R.id.main_buttonBuatKontakBaru);
        buttonDaftarBaru = (Button) activity.findViewById(R.id.main_buttonDaftarKontak);

    }

    public Activity getActivity() {
        return activity;
    }

    public Button getButtonBuatKontakBaru() {
        return buttonBuatKontakBaru;
    }

    public Button getButtonDaftarBaru() {
        return buttonDaftarBaru;
    }
}
