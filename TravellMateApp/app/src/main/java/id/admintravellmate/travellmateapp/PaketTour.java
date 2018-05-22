package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaketTour extends AppCompatActivity {
    @BindView(R.id.buttonKunjungi)
    Button buttonKunjungi;
    @BindView(R.id.buttonKunjungi2)
    Button buttonKunjungi2;
    @BindView(R.id.buttonKunjungi3)
    Button buttonKunjungi3;
    @BindView(R.id.imageView1)
    ImageView imageView1;

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paket_tour);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonKunjungi)
    public void setButtonKunjungi(){
        Intent intent = new Intent(PaketTour.this, KunjungiBangkok.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonKunjungi2)
    public void setButtonKunjungi2(){
        Intent intent = new Intent(PaketTour.this, KunjungiSeoul.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonKunjungi3)
    public void setButtonKunjungi3(){
        Intent intent = new Intent(PaketTour.this, KunjungiTokyo.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.imageView1)
    public void setImageView1() {
        Intent intent = new Intent(PaketTour.this, Beranda.class);
        startActivity(intent);
        finish();
    }
}