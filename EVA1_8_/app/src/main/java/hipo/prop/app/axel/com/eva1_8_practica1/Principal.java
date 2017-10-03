package hipo.prop.app.axel.com.eva1_8_practica1;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    int itotal, icant;
    RadioButton rdbtnAmericano , rdbtnCapuchino, rdbtnExpresso;
    RadioGroup rdgpMenu;
    EditText edtxtCantidad;
    TextView txtCompra;
    CheckBox cboxAzucar, cboxCrema;
    Button btnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdbtnAmericano = (RadioButton) findViewById(R.id.rdbtnAmericano);
        rdbtnCapuchino = (RadioButton) findViewById(R.id.rdbtnCapuchino);
        rdbtnExpresso = (RadioButton) findViewById(R.id.rdbtnExpresso);
        edtxtCantidad = (EditText) findViewById(R.id.edtxtCantidad);
        txtCompra = (TextView) findViewById(R.id.edtxtCompra);
        cboxAzucar = (CheckBox) findViewById(R.id.cboxAzucar);
        cboxCrema = (CheckBox) findViewById(R.id.cboxCrema);
        btnTotal = (Button) findViewById(R.id.btnTotal);
        rdgpMenu = (RadioGroup) findViewById(R.id.rdgpMenu);

    }

    public void onClick(View v){
        itotal = 0;
        String scant = edtxtCantidad.getText().toString();
        txtCompra.setText("");

        if(scant.isEmpty()) {
            icant=1;
        }else{
            icant = Integer.parseInt(scant);
        }
        if (rdbtnAmericano.isChecked()) {
            itotal = itotal + 20;
            itotal = itotal * icant;
            txtCompra.append(icant + " Cafe Americano");
        }
        if (rdbtnExpresso.isChecked()) {
            itotal = itotal + 30;
            itotal = itotal * icant;
            txtCompra.append(icant + " Cafe Expresso");
        }
        if (rdbtnCapuchino.isChecked()) {
            itotal = itotal + 48;
            itotal = itotal * icant;
            txtCompra.append(icant + " Cafe Capuchino");
        }
        if (cboxCrema.isChecked()) {
            itotal = itotal + 1;
            itotal = itotal + icant - 1;
            txtCompra.append(", Crema");
        }
        if (cboxAzucar.isChecked()) {
            itotal = itotal + 1;
            itotal = itotal + icant - 1;
            txtCompra.append(", Azucar");
        }
        Toast.makeText(this, "Su total es: " + itotal, Toast.LENGTH_LONG).show();

    }


}
