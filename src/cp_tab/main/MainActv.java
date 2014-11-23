package cp_tab.main;

import java.io.File;
import java.util.ArrayList;

import cp_tab.listeners.button.BO_CL;
import cp_tab.listeners.button.BO_TL;
import cp_tab.listeners.view.V_OCL;
import cp_tab.listeners.view.V_OTL;
import cp_tab.utils.CONS;
import cp_tab.utils.Methods;
import cp_tab.utils.Tags;
import cp_tab.view.CV;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActv extends Activity {

	public static Vibrator vib;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actv_main_cv);
//		setContentView(R.layout.actv_main);
		
		this.setTitle(this.getClass().getName());
		
		vib = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_actv, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void 
	onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		String msg_Log;
		boolean res;
		
		////////////////////////////////

		// bt

		////////////////////////////////
		res = this._Bluetooth();
		
		if (res == true) {
			
			// Log
			msg_Log = "setup: bluetooth => done";
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
		} else {

			// Log
			msg_Log = "setup: bluetooth => not done";
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
			return;

		}

		////////////////////////////////

		// setup: path

		////////////////////////////////
		this._Setup_Paths();

		////////////////////////////////

		// setup

		////////////////////////////////
		this._Setup();
		
		////////////////////////////////

		// setup: layer

		////////////////////////////////
		_Setup__Layer();
		
		////////////////////////////////

		// listener

		////////////////////////////////
		
		_Setup__SetListener();

	}//onStart

	private void 
	_Setup_Paths() {
		// TODO Auto-generated method stub
	
		String msg_Log;
		
		File f = this.getDatabasePath(CONS.DB.dbName);
//		String dpath_External = this.getFilesDir().getPath();
		
		// Log
//		msg_Log = "dpath_External => " + dpath_External;
		
		if (f != null) {
			
			msg_Log = "database => " + f.getAbsolutePath();
			
		} else {

			msg_Log = "database => null";
			
		}
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		////////////////////////////////

		// sdcard path

		////////////////////////////////
		//REF path http://android.stackexchange.com/questions/55481/how-can-i-determine-the-sd-cards-path answered Oct 21 '13 at 18:11
		File f2 = new File("/storage/sdcard0");
//		File f2 = new File("/mnt");
		
		if (f2.exists()) {
			
			String[] fnames = f2.list();
			
			for (int i = 0; i < fnames.length; i++) {
				
				// Log
				msg_Log = "name = " + fnames[i];
				Log.d("MainActv.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
			}
			
		} else {

			// Log
			msg_Log = "file => exist not: " + f2.getAbsolutePath();
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
		}

		////////////////////////////////

		// image files

		////////////////////////////////
		f2 = new File(CONS.DB.dPath_Image);
//		File f2 = new File("/mnt");
		
		// Log
		msg_Log = "dpath => " + f2.getAbsolutePath();
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		if (f2.exists()) {
			
			String[] fnames = f2.list();
			
			for (int i = 0; i < fnames.length; i++) {
				
				// Log
				msg_Log = "name = " + fnames[i];
				Log.d("MainActv.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
			}
			
		} else {

			// Log
			msg_Log = "file => exist not: " + f2.getAbsolutePath();
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
		}
		
		////////////////////////////////
		
		// sdcard1
		
		////////////////////////////////
		f2 = new File("/storage/sdcard1");
//		File f2 = new File("/mnt");
		
		// Log
		msg_Log = "dpath => " + f2.getAbsolutePath();
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		if (f2.exists()) {
			
			String[] fnames = f2.list();
			
			for (int i = 0; i < fnames.length; i++) {
				
				// Log
				msg_Log = "name = " + fnames[i];
				Log.d("MainActv.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
			}
			
		} else {
			
			// Log
			msg_Log = "file => exist not: " + f2.getAbsolutePath();
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
		}
		
	}//_Setup_Paths

	private boolean 
	_Bluetooth() {
		// TODO Auto-generated method stub
		
		Methods.setup_Bluetooth(this);
		
		////////////////////////////////

		// adapter

		////////////////////////////////
        BluetoothAdapter Bt = BluetoothAdapter.getDefaultAdapter();
        
        if(Bt.equals(null)){
        	
        	return false;
        	
        }

        CONS.BT.mBtAdapter = Bt;

        return true;
        
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	private void 
	_Setup__Layer() {
		
		if (CONS.Canvas.list_Layer == null) {
			
			CONS.Canvas.list_Layer = new ArrayList<CONS.Canvas.Layer>();
			
//			CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Cir_A);
			CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Rect_A);
			CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Rect_B);
			CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Rect_C);
			
		}
		
//		CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Cir_A);
//		CONS.Canvas.list_Layer.add(CONS.Canvas.Layer.Rect_A);
		
		// Log
		String msg_Log = "layer setup => done";
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
	}

	private void 
	_Setup__SetListener() {
		// TODO Auto-generated method stub
		
		////////////////////////////////

		// listener

		////////////////////////////////
		final View cv = (View) findViewById(R.id.actv_main_cv_canvas);
		
		cv.setTag(Tags.ViewTags.CANVAS_MAIN);
		
		// onTouch
		cv.setOnTouchListener(new V_OTL(this, (CV) cv));

		// onClick
		cv.setOnClickListener(new V_OCL(this, (CV) cv));
		
		////////////////////////////////

		// button: go

		////////////////////////////////
		Button bt_Go = (Button) findViewById(R.id.actv_main_cv_bt_go);
		
		bt_Go.setTag(Tags.ButtonTags.ACTV_MAIN_BT_GO);
		
		bt_Go.setOnTouchListener(new BO_TL(this));
		bt_Go.setOnClickListener(new BO_CL(this));
		
		////////////////////////////////
		
		// button: clear
		
		////////////////////////////////
		Button bt_Clear = (Button) findViewById(R.id.actv_main_cv_bt_clear);
		
		bt_Clear.setTag(Tags.ButtonTags.ACTV_MAIN_BT_CLEAR);
		
		bt_Clear.setOnTouchListener(new BO_TL(this));
		bt_Clear.setOnClickListener(new BO_CL(this));
		
	}//_Setup__SetListener

	private void 
	_Setup() {
		// TODO Auto-generated method stub
		
		////////////////////////////////
		
		// paint
		
		////////////////////////////////
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);
//		paint.setColor(0xFF4444FF);
//		paint.setStyle(Paint.Style.FILL);
		paint.setStrokeWidth(30);
		
		////////////////////////////////
		
		// get: view
		
		////////////////////////////////
		cp_tab.view.CV cv = (cp_tab.view.CV) findViewById(R.id.actv_main_cv_canvas);
//		
//		////////////////////////////////
//
//		// circle: A
//
//		////////////////////////////////
//		CONS.Canvas.Draw_Circle_A = true;
//		
//		CONS.Canvas.Cir_A_X = 200;
//		CONS.Canvas.Cir_A_Y = 400;
//		
//		CONS.Canvas.Cir_A_X_prev = 200;
//		CONS.Canvas.Cir_A_Y_prev = 400;
//		
//		CONS.Canvas.Cir_A_Radius	= CONS.Canvas.Cir_A_Radius_dflt;
//		
//		cv.draw_Circle_A(
//					this, 
//					(int)CONS.Canvas.Cir_A_X, 
//					(int)CONS.Canvas.Cir_A_Y);

		////////////////////////////////

		// rect: A

		////////////////////////////////
//		CONS.Canvas.Draw_Rect_A = true;
		
		CONS.Canvas.Rect_A_X1 = 200;
		CONS.Canvas.Rect_A_Y1 = 400;
		
		CONS.Canvas.Rect_A_W = 200;
		CONS.Canvas.Rect_A_H = 150;
		
		cv.draw_Rect_A(this);
		
		////////////////////////////////
		
		// rect: B
		
		////////////////////////////////
//		CONS.Canvas.Draw_Rect_A = true;
		
		CONS.Canvas.Rect_B_W = 200;
		CONS.Canvas.Rect_B_H = 150;
		
		CONS.Canvas.Rect_B_X1 = 200;
		CONS.Canvas.Rect_B_Y1 = CONS.Canvas.Rect_A_Y1 - CONS.Canvas.Rect_B_H;
//		CONS.Canvas.Rect_B_Y1 = 200;
		
		cv.draw_Rect_B(this);
		
		////////////////////////////////
		
		// rect: C
		
		////////////////////////////////
//		CONS.Canvas.Draw_Rect_A = true;
		
		CONS.Canvas.Rect_C_W = 200;
		CONS.Canvas.Rect_C_H = 150;
		
		CONS.Canvas.Rect_C_X1 = 200;
		CONS.Canvas.Rect_C_Y1 = CONS.Canvas.Rect_B_Y1 - CONS.Canvas.Rect_B_H;
//		CONS.Canvas.Rect_B_Y1 = 200;
		
		cv.draw_Rect_C(this);
		
	}//_Setup
	
	
}
