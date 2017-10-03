package hipo.prop.app.axel.com.eva1_6_radio_group;

import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener{
    RadioGroup rgpComida;
    RadioButton rdbtnTacos, rdbtnBurguer, rdbtnTorta, rdbtnPizza;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdbtnBurguer = (RadioButton)findViewById(R.id.rdbtnBurguer);
        rdbtnPizza = (RadioButton)findViewById(R.id.rdbtnPizza);
        rdbtnTacos = (RadioButton)findViewById(R.id.rdbtnTacos);
        rdbtnTorta = (RadioButton)findViewById(R.id.rdbtnTorta);
        rgpComida = (RadioGroup) findViewById(R.id.rgpComida);
        rgpComida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if (checkedId == R.id.rdbtnBurguer){
            Toast.makeText(this, "1000 cal", Toast.LENGTH_SHORT).show();
        }else if(checkedId == R.id.rdbtnPizza){
            Toast.makeText(this, "500 cal", Toast.LENGTH_SHORT).show();
        }else if(checkedId == R.id.rdbtnTacos){
            Toast.makeText(this, "45 cal", Toast.LENGTH_SHORT).show();
        }else if(checkedId == R.id.rdbtnTorta){
            Toast.makeText(this, "10 cal", Toast.LENGTH_SHORT).show();
        }
    }
}
