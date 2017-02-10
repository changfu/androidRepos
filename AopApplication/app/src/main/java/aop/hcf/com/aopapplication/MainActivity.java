package aop.hcf.com.aopapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import aop.hcf.com.aoplibrary.annotation.LogTrace;
import aop.hcf.com.aoplibrary.annotation.TestTrace;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            @TestTrace
            public void onClick(View v) {
//                try {
//                    Annotation ann = this.getClass().getDeclaredMethod("onClick", new Class[]{View.class}).getAnnotation(LogTrace.class);
//                } catch (NoSuchMethodException e) {
//                    e.printStackTrace();
//                }
            }
        });

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            @LogTrace(getMessage = "From MainActivity.")
            public void onClick(View v) {
                Log.e("myTag", "start click");
            }
        });
    }
}
