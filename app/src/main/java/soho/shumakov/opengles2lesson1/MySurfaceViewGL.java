package soho.shumakov.opengles2lesson1;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceView;

/**
 * Created by evgenyshumakov on 31.08.17.
 */

public class MySurfaceViewGL extends GLSurfaceView{
    private MyRenderer myRenderer;
    public MySurfaceViewGL(Context context) {
        super(context);

        setEGLContextClientVersion(2);
        myRenderer = new MyRenderer();

        setRenderer(myRenderer);
    }
}
