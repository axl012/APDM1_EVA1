package hipo.prop.app.axel.com.eva1_4_mas_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    EditText edttxtNombre;
    TextView txtVwNombre;
    //Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edttxtNombre = (EditText)findViewById(R.id.edttxtNombre); //vincular wdget a objeto
        txtVwNombre = (TextView)findViewById(R.id.txtVwNombre);
        //button = (Button)findViewById(R.id.button);
    }
    public void miClick(View v){
       String sNom;
       sNom = edttxtNombre.getText().toString();
       txtVwNombre.setText(sNom);

       // txtVwNombre.setText(edttxtNombre.getText());
    }
}
