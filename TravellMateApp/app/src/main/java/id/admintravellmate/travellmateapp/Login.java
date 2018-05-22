package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.buttonLogin)
    Button buttonLogin;
    @BindView(R.id.textViewDaftar)
    Button textViewDaftar;

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonLogin)
    public void setButtonLogin() {
        Intent intent = new Intent(Login.this, Beranda.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.textViewDaftar)
    public void setButtonKirim() {
        Intent intent = new Intent(Login.this, Daftar.class);
        startActivity(intent);
        finish();
    }
}
