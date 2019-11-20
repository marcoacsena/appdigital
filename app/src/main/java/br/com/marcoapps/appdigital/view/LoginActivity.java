package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.uteis.CnpjValidator;
import br.com.marcoapps.appdigital.uteis.CpfValidator;


public class LoginActivity extends AppCompatActivity {

    private EditText editCpf;
    private Button btnAcessarListaMensagens;
    private String Cpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();

    }
    public void initComponents() {
        editCpf = findViewById(R.id.editCpf);
        btnAcessarListaMensagens = findViewById(R.id.btnAcessarListaMensagens);
        acessarSistema();
    }

    private void acessarSistema() {

        btnAcessarListaMensagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cpf = editCpf.getText().toString();

                if (validarCpf(Cpf)){

                    Intent intent = new Intent(getApplicationContext(), RecyclerViewEmissoresActivity.class);
                    intent.putExtra("cpf", Cpf);
                    startActivity(intent);
                    limparDados();
                }else{
                    Toast.makeText(LoginActivity.this, "Por favor, digite um CPF ou CNPJ válido!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


private boolean validarCpf(String cpf){
        boolean validacao = false;

        if(cpf != null) {
            if (cpf.length() == 11 && !cpf.isEmpty()) {

                validacao = CpfValidator.isCPF(cpf);
                return validacao;
            } else {
                validacao = CnpjValidator.isCNPJ(cpf);
                return validacao;
            }
        }else{
            Toast.makeText(LoginActivity.this, "Por favor, digite um CPF ou CNPJ válido!", Toast.LENGTH_SHORT).show();

        }
        return validacao;
    }
    public void limparDados(){
        editCpf.setText("");
    }

}
