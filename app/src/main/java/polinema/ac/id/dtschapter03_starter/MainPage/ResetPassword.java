package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import polinema.ac.id.dtschapter03_starter.R;

public class ResetPassword extends AppCompatActivity {

    EditText ResetCode, confirmPass, NewPass;
    Button CekLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        ResetCode = findViewById(R.id.resetCodeEdit);
        confirmPass = findViewById(R.id.confirmPass);
        NewPass = findViewById(R.id.newPasswordEdit);
        CekLogin = findViewById(R.id.login2);
        CekLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validation(view);
            }
        });
    }

    public static boolean isValidEmail(CharSequence email){
        return (Patterns.PHONE.matcher(email).matches());
        /*
         2. Pada activity Reset Password, Reset Code hanya menerima inputan angka (number)
        */
    }


    public void Validation(View view){
        if (TextUtils.isEmpty(ResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Code tidak boleh kosong", Toast.LENGTH_LONG).show();

            /*
               3. (Bonus Point) Maksimal panjang karakter untuk password adalah 15 karakter
             */
        }else
            if (ResetCode.getText().toString().trim().length() < 15 ){
                Toast.makeText(view.getContext(), "Code berisi 15 karater", Toast.LENGTH_LONG).show();
            }

        else if (!isValidEmail(ResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Code tidak valid", Toast.LENGTH_LONG).show();

                /*
                4. (Bonus Point) Cek inputan New Password dan Confirm Password. Kedua inputan harus sama!
                 */
        }else if (!TextUtils.equals(NewPass.getText().toString().trim(), confirmPass.getText().toString().trim())){
                Toast.makeText(view.getContext(), "Code tidak sama", Toast.LENGTH_LONG).show();
        } else{
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }

}