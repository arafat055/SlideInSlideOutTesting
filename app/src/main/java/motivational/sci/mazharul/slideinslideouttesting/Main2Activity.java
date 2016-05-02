package motivational.sci.mazharul.slideinslideouttesting;
import android.app.Activity;
import android.os.Bundle;
public class Main2Activity extends Activity {
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        overridePendingTransition(R.anim.animinx, R.anim.animout);
        setContentView(R.layout.activity_main2);
        System.out.println("----Secondactivity activity---onCreates---");
    }

}