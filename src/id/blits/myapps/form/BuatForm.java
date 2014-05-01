package id.blits.myapps.form;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import id.blits.myapps.R;

/**
 * Created by Lintanhg on 02/05/2014.
 */
public class BuatForm {

    private Activity activity;

    private EditText editTextNama;
    private EditText editTextTelepon;
    private EditText editTextEmail;

    private Button buttonSimpan;

    public BuatForm(Activity activity){
        this.activity = activity;

        editTextNama = (EditText) activity.findViewById(R.id.buat_editTextNama);
        editTextEmail = (EditText) activity.findViewById(R.id.buat_editTextEmail);
        editTextTelepon = (EditText) activity.findViewById(R.id.buat_editTextTelepon);

        buttonSimpan = (Button) activity.findViewById(R.id.buat_buttonSimpan);

    }

    public Activity getActivity() {
        return activity;
    }

    public EditText getEditTextNama() {
        return editTextNama;
    }

    public EditText getEditTextTelepon() {
        return editTextTelepon;
    }

    public EditText getEditTextEmail() {
        return editTextEmail;
    }

    public Button getButtonSimpan() {
        return buttonSimpan;
    }

    public void reset(){
        editTextNama.setText("");
        editTextEmail.setText("");
        editTextTelepon.setText("");
    }
}
