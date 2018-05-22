package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Beranda extends AppCompatActivity{
    @BindView(R.id.buttonDestinasi)
    Button buttonDestinasi;
    @BindView(R.id.buttonTemukanTeman)
    Button buttonTemukanTeman;
    @BindView(R.id.buttonMap)
    Button buttonMap;
    @BindView(R.id.buttonTentang)
    Button buttonTentang;
    @BindView(R.id.buttonProfil)
    Button buttonProfil;



    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonDestinasi)
    public void setButtonDestinasi() {
        Intent intent = new Intent(Beranda.this, CariDestinasi.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonTemukanTeman)
    public void setButtonTemukanTeman() {
        Intent intent = new Intent(Beranda.this, TemukanTeman.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonMap)
    public void setButtonMap() {
        Intent intent = new Intent(Beranda.this, Map.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonTentang)
    public void setButtonTentang() {
        Intent intent = new Intent(Beranda.this, TentangKami.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonProfil)
    public void setButtonProfil() {
        Intent intent = new Intent(Beranda.this, Profil.class);
        startActivity(intent);
        finish();
    }


}
