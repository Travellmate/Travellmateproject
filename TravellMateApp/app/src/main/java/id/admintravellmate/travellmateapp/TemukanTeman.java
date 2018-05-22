package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TemukanTeman extends AppCompatActivity {
    @BindView(R.id.buttonAnggota1)
    Button buttonAnggota1;
    @BindView(R.id.buttonAnggota2)
    Button buttonAnggota2;
    @BindView(R.id.buttonAnggota3)
    Button buttonAnggota3;
    @BindView(R.id.imageView1)
    ImageView imageView1;

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temukan_teman);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonAnggota1)
    public void setButtonAnggota1(){
        Intent intent = new Intent(TemukanTeman.this, TemukanTemanBangkok.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.buttonAnggota2)
    public void setButtonAnggota2(){
        Intent intent = new Intent(TemukanTeman.this, TemukanTemanKorea.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.buttonAnggota3)
    public void setButtonAnggota3(){
        Intent intent = new Intent(TemukanTeman.this, TemukanTemanTokyo.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.imageView1)
    public void setImageView1() {
        Intent intent = new Intent(TemukanTeman.this, Beranda.class);
        startActivity(intent);
        finish();
    }
}