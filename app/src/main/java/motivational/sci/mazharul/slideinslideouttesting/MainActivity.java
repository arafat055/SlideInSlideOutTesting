package motivational.sci.mazharul.slideinslideouttesting;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends Activity {
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.animinx, R.anim.animout);
        setContentView(R.layout.activity_main);
        System.out.println("----main activity---onCreate---");
        btnNext = (Button) findViewById(R.id.button1);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent ob = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(ob);
            }
        });
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.animinx, R.anim.animout);
    }
}