package x.y;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import displaywindow.Drawer;
import drawings.Drawing;
import drawings.enggcurves.Ellipse;
import drawings.globe.Globe;

public class Universe extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		ArrayList<Drawing> drawings = new ArrayList<Drawing>();

		drawings.add(new Globe(-3, 24, 4));
		drawings.add(new Globe(0, 20, 5));
		drawings.add(new Globe(5, 15, 6));
		
		drawings.add(new Globe(0, 0, 10));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.88f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.84f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.80f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.76f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.72f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.68f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.64f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.60f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.56f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.52f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.48f));
		drawings.add(new Ellipse(0, 0, 10, 10, 1.44f));

		drawings.add(new Globe(-20, -20, 15));
		drawings.add(new Globe(-37, -35, 9));
		drawings.add(new Globe(-42, -45, 7));

		Drawer drawer = new Drawer(drawings, null, this);
		drawer.draw();
	}
}