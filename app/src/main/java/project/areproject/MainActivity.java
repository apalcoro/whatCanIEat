package project.areproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button register;
    Button manual;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = (Button)findViewById(R.id.register);
        manual = (Button)findViewById(R.id.manual);
        login = (Button)findViewById(R.id.login);
        //hi
    }

    public void Register(View view) {

    }

    public void Login(View view) {
    }

    public void MoveManual(View view) {
    }
}
