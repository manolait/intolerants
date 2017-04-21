package com.istc.intolerants;

//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener, BlankFragment.OnFragmentInteractionListener , BlankFragmentRegistro.OnFragmentInteractionListener {

    private Button btn_Entrar;
    private Button btn_Registro;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btn_Entrar = (Button) findViewById(R.id.Login_btn_Entrar);
        btn_Entrar.setOnClickListener(this);
        btn_Registro = (Button) findViewById(R.id.Login_btn_Registro);
        btn_Registro.setOnClickListener(this);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BlankFragment fragment1 = new BlankFragment();
        fragmentTransaction.replace(R.id.login_layout_inferior, fragment1);
        fragmentTransaction.commit();

       /* btn_Nombre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
            }
        });*/
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.Login_btn_Entrar:

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment fragment1 = new BlankFragment();
                fragmentTransaction.replace(R.id.login_layout_inferior, fragment1);
                fragmentTransaction.commit();



            break;

            case R.id.Login_btn_Registro:
                android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                BlankFragmentRegistro fragment2 = new BlankFragmentRegistro();
                fragmentTransaction2.replace(R.id.login_layout_inferior, fragment2);
                fragmentTransaction2.commit();

            break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
