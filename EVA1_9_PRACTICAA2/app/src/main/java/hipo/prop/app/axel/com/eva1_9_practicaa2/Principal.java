package hipo.prop.app.axel.com.eva1_9_practicaa2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText edtxtañoNac;
    RadioButton rdbtnDesarrolladas,rdbtnAmerica,rdbtnAsia,rdbtnAfrica,rdbtnHombre,rdbtnMujer;
    RadioGroup rdgpRegion, rdgpGenero;
    TextView txtExpectativa, txtDeceso;
    int iaño, iexp, idec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxtañoNac = (EditText) findViewById(R.id.edtxtAñoNac);
        rdbtnDesarrolladas = (RadioButton) findViewById(R.id.rdbtnDesarrolladas);
        rdbtnAmerica = (RadioButton) findViewById(R.id.rdbtnAmerica);
        rdbtnAsia = (RadioButton) findViewById(R.id.rdbtnAsia);
        rdbtnAfrica = (RadioButton) findViewById(R.id.rdbtnAfrica);
        rdbtnHombre = (RadioButton) findViewById(R.id.rdbtnHombre);
        rdbtnMujer = (RadioButton) findViewById(R.id.rdbtnMujer);
        rdgpRegion = (RadioGroup) findViewById(R.id.rdgpRegion);
        rdgpGenero = (RadioGroup) findViewById(R.id.rdgpGenero);
        txtExpectativa = (TextView) findViewById(R.id.txtExpectativa);
        txtDeceso = (TextView) findViewById(R.id.txtDeceso);
        rdgpRegion.setOnCheckedChangeListener(this);
        rdgpGenero.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        Boolean Active=true;

        if(edtxtañoNac.getText().toString().isEmpty()){
            Toast.makeText(this, "Primero ingrese el año", Toast.LENGTH_SHORT).show();

        }else {
            iaño = Integer.parseInt(edtxtañoNac.getText().toString());
            if (iaño >= 1950 && iaño < 1960) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 75;
                if (rdbtnAmerica.isChecked()) iexp = 60;
                if (rdbtnAsia.isChecked()) iexp = 45;
                if (rdbtnAfrica.isChecked()) iexp = 35;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - 5;
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + 5;
                }
            }
            if (iaño >= 1960 && iaño < 1970) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 75;
                if (rdbtnAmerica.isChecked()) iexp = 65;
                if (rdbtnAsia.isChecked()) iexp = 50;
                if (rdbtnAfrica.isChecked()) iexp = 45;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - (9 / 2);
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + (9 / 2);
                }
            }
            if (iaño >= 1970 && iaño < 1980) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 80;
                if (rdbtnAmerica.isChecked()) iexp = 70;
                if (rdbtnAsia.isChecked()) iexp = 65;
                if (rdbtnAfrica.isChecked()) iexp = 55;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - 4;
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + 4;
                }
            }
            if (iaño >= 1980 && iaño < 1990) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 80;
                if (rdbtnAmerica.isChecked()) iexp = 75;
                if (rdbtnAsia.isChecked()) iexp = 60;
                if (rdbtnAfrica.isChecked()) iexp = 60;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - (7 / 2);
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + (7 / 2);
                }
            }
            if (iaño >= 1990 && iaño < 2000) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 85;
                if (rdbtnAmerica.isChecked()) iexp = 75;
                if (rdbtnAsia.isChecked()) iexp = 60;
                if (rdbtnAfrica.isChecked()) iexp = 55;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - 3;
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + 3;
                }
            }
            if (iaño >= 2000) {
                if (rdbtnDesarrolladas.isChecked()) iexp = 90;
                if (rdbtnAmerica.isChecked()) iexp = 70;
                if (rdbtnAsia.isChecked()) iexp = 65;
                if (rdbtnAfrica.isChecked()) iexp = 60;
                if (rdbtnHombre.isChecked()) {
                    iexp = iexp - 2;
                } else if (rdbtnMujer.isChecked()) {
                    iexp = iexp + 2;
                }
            }
            if(iaño<1950 || iaño >2010){
                Active=false;
                Toast.makeText(this, "Ingresa un año entre 1950 y 2010", Toast.LENGTH_SHORT).show();
            }

            if(Active){ idec = iaño+iexp;
                txtExpectativa.setText(""+iexp+" años");
                txtDeceso.setText(""+idec+" años");   }

        }


    }
}



