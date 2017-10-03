package hipo.prop.app.axel.com.eva1_14_practica3;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup rdgpSexo;
    RadioButton rdbtnHombre, rdbtnMujer;
    EditText edtxtNombre, edtxtApellido, edtxtEdad, edtxtOrganizacion, edtxtCorreo;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdgpSexo = (RadioGroup)findViewById(R.id.rdgpSexo);
        rdgpSexo.setOnCheckedChangeListener(this);
        rdbtnHombre = (RadioButton)findViewById(R.id.rdbtnHombre);
        rdbtnMujer = (RadioButton)findViewById(R.id.rdbtnMujer);
        edtxtNombre = (EditText)findViewById(R.id.edtxtNombre);
        edtxtApellido = (EditText)findViewById(R.id.edtxtApellido);
        edtxtEdad = (EditText)findViewById(R.id.edtxtEdad);
        edtxtOrganizacion = (EditText)findViewById(R.id.edtxtOrganizacion);
        edtxtCorreo = (EditText)findViewById(R.id.edtxtCorreo);
        btnAgregar = (Button)findViewById(R.id.btnAgregar);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

    }

    datos arrayobject[] = new datos[10];


    class datos {
        String  edtxtNombre, edtxtApellido, edtxtEdad, edtxtOrganizacion, edtxtCorreo, rdbtnHombre, rdbtnMujer;

        public String getEdtxtNombre() {
            return edtxtNombre;
        }

        public void setEdtxtNombre(String edtxtNombre) {
            this.edtxtNombre = edtxtNombre;
        }

        public String getEdtxtApellido() {
            return edtxtApellido;
        }

        public void setEdtxtApellido(String edtxtApellido) {
            this.edtxtApellido = edtxtApellido;
        }

        public String getEdtxtEdad() {
            return edtxtEdad;
        }

        public void setEdtxtEdad(String edtxtEdad) {
            this.edtxtEdad = edtxtEdad;
        }

        public String getEdtxtOrganizacion() {
            return edtxtOrganizacion;
        }

        public void setEdtxtOrganizacion(String edtxtOrganizacion) {
            this.edtxtOrganizacion = edtxtOrganizacion;
        }

        public String getEdtxtCorreo() {
            return edtxtCorreo;
        }

        public void setEdtxtCorreo(String edtxtCorreo) {
            this.edtxtCorreo = edtxtCorreo;
        }

        public String getRdbtnHombre() {
            return rdbtnHombre;
        }

        public void setRdbtnHombre(String rdbtnHombre) {
            this.rdbtnHombre = rdbtnHombre;
        }

        public String getRdbtnMujer() {
            return rdbtnMujer;
        }

        public void setRdbtnMujer(String rdbtnMujer) {
            this.rdbtnMujer = rdbtnMujer;
        }
    }
}
