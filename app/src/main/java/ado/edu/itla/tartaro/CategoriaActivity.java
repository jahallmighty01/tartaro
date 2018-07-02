package ado.edu.itla.tartaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ado.edu.itla.tartaro.entidad.Categoria;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_categoria);

        //TextView txtNombre = (TextView) findViewById(R.id.txtNombre);
        EditText txtNombreCategoria = findViewById(R.id.txtNombreCategoria);
        Button btnGuadarCategoria = findViewById(R.id.btnGuardarCategoria);

        Categoria cat = new Categoria();
        btnGuadarCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                rep.guardar
            }
        });

        Bundle data =  this.getIntent().getExtras();
        String nombre = (String) data.get("nombre");
        //txtNombre.setText(nombre);


    }
}
