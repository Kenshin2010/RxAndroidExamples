package info.androidhive.rxandroidexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import info.androidhive.rxandroidexamples.basics.Example1Activity;
import info.androidhive.rxandroidexamples.basics.Example2Activity;
import info.androidhive.rxandroidexamples.basics.Example3Activity;
import info.androidhive.rxandroidexamples.basics.Example4Activity;
import info.androidhive.rxandroidexamples.basics.Example5Activity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_basic_ex1)
    Button btnBasicEx1;
    @BindView(R.id.btn_basic_ex2)
    Button btnBasicEx2;
    @BindView(R.id.btn_basic_ex3)
    Button btnBasicEx3;
    @BindView(R.id.btn_basic_ex4)
    Button btnBasicEx4;
    @BindView(R.id.btn_basic_ex5)
    Button btnBasicEx5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnBasicEx1.setOnClickListener(view -> {
            startActivity(new Intent(this, Example1Activity.class));
        });

        btnBasicEx2.setOnClickListener(view -> {
            startActivity(new Intent(this, Example2Activity.class));
        });

        btnBasicEx3.setOnClickListener(view -> {
            startActivity(new Intent(this, Example3Activity.class));
        });

        btnBasicEx4.setOnClickListener(view -> {
            startActivity(new Intent(this, Example4Activity.class));
        });

        btnBasicEx5.setOnClickListener(view -> {
            startActivity(new Intent(this, Example5Activity.class));
        });

    }
}
