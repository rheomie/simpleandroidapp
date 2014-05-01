package id.blits.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import id.blits.myapps.form.MenuForm;

public class MainActivity extends Activity implements View.OnClickListener{
    /**
     * Called when the activity is first created.
     */
    private MenuForm form;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        form = new MenuForm(this);
        form.getButtonBuatKontakBaru().setOnClickListener(this);
        form.getButtonDaftarBaru().setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
      if (view == form.getButtonBuatKontakBaru()){
          Intent intent = new Intent(this, BuatActivity.class);
          startActivity(intent);
      } else if (view == form.getButtonDaftarBaru()){
          Intent intent = new Intent(this, DafrarActivity.class);
          startActivity(intent);
      }
    }
}
