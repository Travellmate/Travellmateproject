package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormKunjungiTokyo extends AppCompatActivity {
    @BindView(R.id.buttonKirim)
    Button buttonKirim;
    @BindView(R.id.buttonX)
    Button buttonX;

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_kunjungi);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonX)
    public void setButtonX() {
        Intent intent = new Intent(FormKunjungiTokyo.this, KunjungiTokyo.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonKirim)
    public void setButtonKirim() {
        Intent intent = new Intent(FormKunjungiTokyo.this, KunjungiTokyo.class);
        startActivity(intent);
        finish();
    }
}