package soho.shumakov.opengles2lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MySurfaceViewGL surfaceViewGL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        surfaceViewGL = new MySurfaceViewGL(this);
        setContentView(surfaceViewGL);
    }
}
