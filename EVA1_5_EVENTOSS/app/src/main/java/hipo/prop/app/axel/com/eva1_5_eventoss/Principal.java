package hipo.prop.app.axel.com.eva1_5_eventoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//4 5 6 10 12
public class Principal extends AppCompatActivity implements View.OnClickListener {

    Button btnClick, btnAnon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnClick.setOnClickListener((View.OnClickListener) this);
        btnAnon = (Button) findViewById(R.id.btnAnon);
        btnAnon.setOnClickListener(new View.OnClickListener() {
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
