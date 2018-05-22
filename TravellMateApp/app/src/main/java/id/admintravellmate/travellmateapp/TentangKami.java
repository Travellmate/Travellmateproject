package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TentangKami extends AppCompatActivity {

    @BindView(R.id.imageView1)
    ImageView imageView1;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_kami);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.imageView1)
    public void setImageView1() {
        Intent intent = new Intent(TentangKami.this, Beranda.class);
        startActivity(intent);
        finish();
    }
}