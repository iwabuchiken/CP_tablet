package cp_tab.main;

import cp_tab.utils.CONS;
import cp_tab.utils.Methods;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActv extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actv_main);
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
		
		
	}//onStart

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
}
