package id.admintravellmate.travellmateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TemukanTeman extends AppCompatActivity {
    @BindView(R.id.buttonAnggota1)
    Button buttonAnggota1;

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
}