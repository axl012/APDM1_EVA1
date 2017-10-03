package hipo.prop.app.axel.com.eva1_7_recursos;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText edttxtNombre, edtTxtApellido, edtTxtEdad;
    TextView txtNombre, txtApellido, txtEdad;
    RadioGroup rdgrpIdioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edttxtNombre = (EditText)findViewById(R.id.edttxtNombre);
        edtTxtApellido = (EditText)findViewById(R.id.edtTxtApellido);
        edtTxtEdad = (EditText)findViewById(R.id.edtTxtEdad);

        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtApellido = (TextView)findViewById(R.id.txtApellido);
        txtEdad = (TextView)findViewById(R.id.txtEdad);

        rdgrpIdioma = (RadioGroup)findViewById(R.id.rdgrpIdioma);
        rdgrpIdioma.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if(checkedId == R.id.rdbtnEspañol){
            edttxtNombre.setHint(R.string.hint_nombre_es);
            edtTxtApellido.setHint(R.string.hint_apellido_es);
            edtTxtEdad.setHint(R.string.hint_edad_es);

            txtNombre.setText(R.string.view_nombre_es);
            txtApellido.setText(R.string.view_apellido_es);
            txtEdad.setText(R.string.view_edad_es);
        } else if(checkedId == R.id.rdbtnIngles) {
            edttxtNombre.setHint(R.string.hint_nombre_en);
            edtTxtApellido.setHint(R.string.hint_apellido_en);
            edtTxtEdad.setHint(R.string.hint_edad_en);

            txtNombre.setText(R.string.view_nombre_en);
            txtApellido.setText(R.string.view_apellido_en);
            txtEdad.setText(R.string.view_edad_en);
        }else if(checkedId == R.id.rdbtnItaliano) {
            edttxtNombre.setHint(R.string.hint_nombre_it);
            edtTxtApellido.setHint(R.string.hint_apellido_it);
            edtTxtEdad.setHint(R.string.hint_edad_it);

            txtNombre.setText(R.string.view_nombre_it);
            txtApellido.setText(R.string.view_apellido_it);
            txtEdad.setText(R.string.view_edad_it);
        }
    }
}
