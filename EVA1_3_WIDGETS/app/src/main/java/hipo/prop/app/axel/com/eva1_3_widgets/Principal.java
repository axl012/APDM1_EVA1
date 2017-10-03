package hipo.prop.app.axel.com.eva1_3_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVwMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMensaje = (TextView)findViewById(R.id.txtVwMensaje); //vincular wdget a objeto
        txtVwMensaje.setText("holooo");
    }
}
