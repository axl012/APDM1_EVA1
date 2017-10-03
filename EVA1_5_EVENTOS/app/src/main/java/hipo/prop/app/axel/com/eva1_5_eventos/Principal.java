package hipo.prop.app.axel.com.eva1_5_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements OnClickListener{

    Button btnClick, btnAnon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnClick.setOnClickListener(this);
        btnAnon = (Button) findViewById(R.id.btnAnon);
        btnAnon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Principal.this, "holooo anon", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void miClick(View v){
        Toast.makeText(this, "Holoo xml", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Principal.this, "Holoo listener", Toast.LENGTH_SHORT).show();
    }
}
