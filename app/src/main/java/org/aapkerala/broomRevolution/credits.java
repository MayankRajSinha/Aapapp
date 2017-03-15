package org.aapkerala.broomRevolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.aapkerala.broomRevolution.R;

public class credits extends AppCompatActivity {
    private TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        t1=(TextView)findViewById(R.id.credit);
        t2=(TextView)findViewById(R.id.name1);
        t3=(TextView)findViewById(R.id.name2);
        t4=(TextView)findViewById(R.id.name3);
        t1.setText("CREDITS");
        t2.setText("SAMIR DAYAL SINGH");
        t3.setText("MAYANK RAJ");
        t4.setText("ABHINAV GAUTAM");

    }
}
