package cp_tab.listeners.view;

import java.util.Locale;

import cp_tab.utils.CONS;
import cp_tab.utils.Methods;
import cp_tab.utils.Tags;
import cp_tab.view.CV;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class V_OTL implements OnTouchListener {

	/*----------------------------
	 * Fields
		----------------------------*/
	//
	Activity actv;
	Dialog d1;
	private Dialog d2;
	private Dialog d3;
	private Dialog d4;
	private CV cv;
	
	public V_OTL(Activity actv) {
		//
		this.actv = actv;
	}

	public V_OTL(Activity actv, CV cv) {
		// TODO Auto-generated constructor stub
		
		this.actv	= actv;
		this.cv		= cv;
		
	}

	//	@Override
	public boolean onTouchEvent(MotionEvent event) {
//		public boolean onTouch(View v, MotionEvent event) {
		
//		Tags.ViewTags tag_name = (Tags.ViewTags) v.getTag();
		
		ImageButton ib;
		
		float x;
		float y;
		
		switch (event.getActionMasked()) {
		
			case MotionEvent.ACTION_DOWN://--------------------
				
				x = event.getX();
				y = event.getY();
				
				// Log
				String msg_Log = String.format(
							Locale.JAPAN,
							"[DOWN] x = %f / y = %f", x, y);
				
				Log.d("V_OTL.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
				
//				int res = Methods.identify(actv, x, y);
				
//				switch (tag_name) {
//					
//				
//				
//	//				case DLG_FILTER_SHOWLIST_RESET:
//	//					
//	//					ib = (ImageButton) v;
//	//					ib.setImageResource(R.drawable.general_ib_cancel_red_64x64_disdabled);
//	//					
//	//					break;
//				
//				}//switch (tag_name)
	
				break;//case MotionEvent.ACTION_DOWN:
			
			case MotionEvent.ACTION_UP://--------------------
				
				x = event.getX();
				y = event.getY();
				
				// Log
				msg_Log = String.format(
							Locale.JAPAN,
							"[UP] x = %f / y = %f", x, y);
				
				Log.d("V_OTL.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
				
//				switch (tag_name) {
//	
//	//			case DLG_FILTER_SHOWLIST_RESET:
//	//				
//	//				ib = (ImageButton) v;
//	//				ib.setImageResource(R.drawable.general_ib_cancel_red_64x64);
//	//				
//	//				break;
//					
//				}//switch (tag_name)
			
				break;//case MotionEvent.ACTION_UP:
		
			case MotionEvent.ACTION_MOVE://--------------------
				
				x = event.getX();
				y = event.getY();
				
				// Log
				msg_Log = String.format(
							Locale.JAPAN,
							"[MOVE] x = %f / y = %f", x, y);
				
				Log.d("V_OTL.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", msg_Log);
				
//				switch (tag_name) {
//				
//				//			case DLG_FILTER_SHOWLIST_RESET:
//				//				
//				//				ib = (ImageButton) v;
//				//				ib.setImageResource(R.drawable.general_ib_cancel_red_64x64);
//				//				
//				//				break;
//				
//				}//switch (tag_name)
//				
//				break;//case MotionEvent.ACTION_UP:
				
		}//switch (event.getActionMasked())
		
		return false;
		
	}//public boolean onTouch(View v, MotionEvent event)

	//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
	public boolean 
	onTouch(View v, MotionEvent event) {
		
		Tags.ViewTags tag_name = (Tags.ViewTags) v.getTag();
		
		ImageButton ib;
		
		float x;
		float y;
		
		switch (event.getActionMasked()) {
		
		case MotionEvent.ACTION_DOWN://--------------------

//			_onTouch__DOWN(actv, v, event, x, y);
			// Log
			String msg_Log = "view => " + v.getClass().getName();
			Log.d("V_OTL.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);
			
			x = event.getX();
			y = event.getY();

			////////////////////////////////

			// identify

			////////////////////////////////
			int res = Methods.identify(actv, x, y);
			
			////////////////////////////////

			// draw: box

			////////////////////////////////
			this._case_ACTION_DOWN(x, y);
			
//			this.cv.draw_Circle_A(actv, (int)x, (int)y);
//			this.cv.draw_Boxes_A(actv, (int)x, (int)y);
			
				switch (tag_name) {
					
				
				
	//				case DLG_FILTER_SHOWLIST_RESET:
	//					
	//					ib = (ImageButton) v;
	//					ib.setImageResource(R.drawable.general_ib_cancel_red_64x64_disdabled);
	//					
	//					break;
				
				}//switch (tag_name)
			
			break;//case MotionEvent.ACTION_DOWN:
			
		case MotionEvent.ACTION_UP://--------------------
			
			x = event.getX();
			y = event.getY();
			
			// Log
			msg_Log = String.format(
					Locale.JAPAN,
					"[UP] x = %f / y = %f", x, y);
			
			Log.d("V_OTL.java"
					+ "["
					+ Thread.currentThread().getStackTrace()[2]
							.getLineNumber() + "]", msg_Log);
			
				switch (tag_name) {
	
	//			case DLG_FILTER_SHOWLIST_RESET:
	//				
	//				ib = (ImageButton) v;
	//				ib.setImageResource(R.drawable.general_ib_cancel_red_64x64);
	//				
	//				break;
					
				}//switch (tag_name)
			
			////////////////////////////////

			// onClick-related

			////////////////////////////////
				this._case_ACTION_UP(x, y);
				
			break;//case MotionEvent.ACTION_UP:
			
		case MotionEvent.ACTION_MOVE://--------------------
			
			x = event.getX();
			y = event.getY();
			
			// Log
			msg_Log = "moving...";
			Log.d("V_OTL.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", msg_Log);

			////////////////////////////////

			// draw: box

			////////////////////////////////
			this._case_ACTION_MOVE(x, y);
			
//			this.cv.draw_Boxes_A(actv, (int)x, (int)y);
//			this.cv.draw_Circle_A(actv, (int)x, (int)y);

				switch (tag_name) {
				
				//			case DLG_FILTER_SHOWLIST_RESET:
				//				
				//				ib = (ImageButton) v;
				//				ib.setImageResource(R.drawable.general_ib_cancel_red_64x64);
				//				
				//				break;
				
				}//switch (tag_name)
//				
//			return true;
			
			break;//case MotionEvent.ACTION_MOVE:
			
		}//switch (event.getActionMasked())
		
//		return true;
		return false;	//=> if false, MOVE_DOWN only; no further cases logged out
		
	}//public boolean onTouch(View v, MotionEvent event)

	private void 
	_case_ACTION_UP
	(float x, float y) {
		// TODO Auto-generated method stub

		////////////////////////////////

		// onClick-related

		////////////////////////////////
		CONS.Canvas.x_Up = x;
		CONS.Canvas.y_Up = y;
		
		////////////////////////////////

		// report

		////////////////////////////////
		// Log
		CONS.Canvas.diff_X = CONS.Canvas.x_Down - CONS.Canvas.x_Up;
		CONS.Canvas.diff_Y = CONS.Canvas.y_Down - CONS.Canvas.y_Up;
//		float diff_x = CONS.Canvas.x_Down - CONS.Canvas.x_Up;
//		float diff_y = CONS.Canvas.y_Down - CONS.Canvas.y_Up;
		
		
		String msg_Log = String.format(Locale.JAPAN, 
						"diff_x = %f, diff_y = %f", 
						CONS.Canvas.diff_X, CONS.Canvas.diff_Y);
		
		Log.d("V_OTL.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);

	}
	

	private void 
	_onTouch__DOWN
	(Activity actv, View v, MotionEvent event, float x, float y) {
		// TODO Auto-generated method stub
		
		// Log
		String msg_Log = "view => " + v.getClass().getName();
		Log.d("V_OTL.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		x = event.getX();
		y = event.getY();

		////////////////////////////////

		// identify

		////////////////////////////////
		int res = Methods.identify(actv, x, y);
		
		////////////////////////////////

		// draw: box

		////////////////////////////////
		this._case_ACTION_DOWN(x, y);
		
	}//_onTouch__DOWN
	

	private void 
	_case_ACTION_MOVE
	(float x, float y) {
		// TODO Auto-generated method stub
	
		////////////////////////////////

		// dispatch

		////////////////////////////////
		switch(CONS.Canvas.currentObj) {
		
		case Rect_A:
			
			_case_ACTION_MOVE__Rect_A(x, y);
			
			break;
			
		case Rect_B:
			
			_case_ACTION_MOVE__Rect_B(x, y);
			
			break;
			
		case Rect_C:
			
			_case_ACTION_MOVE__Rect_C(x, y);
			
			break;
			
//		case Cir_A:
//			
//			_case_ACTION_MOVE__Cir_A(x, y);
//			
//			break;
			
		default:
			
			_case_ACTION_MOVE__Cir_A(x, y);
			
			break;
		
		}
		
//		////////////////////////////////
//
//		// get distance
//
//		////////////////////////////////
//		
//		float dif_X = x - CONS.Canvas.Cir_A_X_prev;
//		float dif_Y = y - CONS.Canvas.Cir_A_Y_prev;
//		
//		CONS.Canvas.Cir_A_X_prev = x;
//		CONS.Canvas.Cir_A_Y_prev = y;
//		
//		this.cv.draw_Circle_A(
//					actv, 
//					(int)(CONS.Canvas.Cir_A_X + dif_X), 
//					(int)(CONS.Canvas.Cir_A_Y + dif_Y) 
//					);
		
	}//_case_ACTION_MOVE
	

	private void 
	_case_ACTION_MOVE__Cir_A
	(float x, float y) {
		// TODO Auto-generated method stub
	
		////////////////////////////////

		// get distance

		////////////////////////////////
		
		float dif_X = x - CONS.Canvas.Cir_A_X_prev;
		float dif_Y = y - CONS.Canvas.Cir_A_Y_prev;
		
		CONS.Canvas.Cir_A_X_prev = x;
		CONS.Canvas.Cir_A_Y_prev = y;
		
		this.cv.draw_Circle_A(
					actv, 
					(int)(CONS.Canvas.Cir_A_X + dif_X), 
					(int)(CONS.Canvas.Cir_A_Y + dif_Y) 
					);

	}//_case_ACTION_MOVE__Cir_A
	
	private void 
	_case_ACTION_MOVE__Rect_A
	(float x, float y) {
		// TODO Auto-generated method stub

		CONS.Canvas.Rect_A_X1 = x - CONS.Canvas.Rect_A_X_dist_from_base;
		CONS.Canvas.Rect_A_Y1 = y - CONS.Canvas.Rect_A_Y_dist_from_base;
		
//		////////////////////////////////
//		
//		// get diff
//		
//		////////////////////////////////
//		float dx = x - CONS.Canvas.Rect_A_X_prev;
//		float dy = y - CONS.Canvas.Rect_A_Y_prev;
//		
//		// Log
//		String msg_Log = String.format(
//				Locale.JAPAN,
//				"dx = %f / dy = %f", dx, dy);
//
//		Log.d("V_OTL.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", msg_Log);
//		
//		CONS.Canvas.Rect_A_X1 += dx;
//		CONS.Canvas.Rect_A_Y1 += dy;
////		CONS.Canvas.Rect_A_X1 = x;
////		CONS.Canvas.Rect_A_Y1 = y;
//		
//		CONS.Canvas.Rect_A_X1_prev = x;
//		CONS.Canvas.Rect_A_Y1_prev = y;
		
		this.cv.draw_Rect_A(actv);
		
	}//_case_ACTION_MOVE__Rect_A
	
	private void 
	_case_ACTION_MOVE__Rect_B
	(float x, float y) {
		// TODO Auto-generated method stub
		
		CONS.Canvas.Rect_B_X1 = x - CONS.Canvas.Rect_B_X_dist_from_base;
		CONS.Canvas.Rect_B_Y1 = y - CONS.Canvas.Rect_B_Y_dist_from_base;
		
		this.cv.draw_Rect_B(actv);
		
	}//_case_ACTION_MOVE__Cir_B
	
	private void 
	_case_ACTION_MOVE__Rect_C
	(float x, float y) {
		// TODO Auto-generated method stub
		
		CONS.Canvas.Rect_C_X1 = x - CONS.Canvas.Rect_C_X_dist_from_base;
		CONS.Canvas.Rect_C_Y1 = y - CONS.Canvas.Rect_C_Y_dist_from_base;
		
		this.cv.draw_Rect_C(actv);
		
	}//_case_ACTION_MOVE__Cir_C
	

	private void 
	_case_ACTION_DOWN
	(float x, float y) {
		// TODO Auto-generated method stub

		////////////////////////////////

		// dispatch

		////////////////////////////////
		switch(CONS.Canvas.currentObj) {
		
		case Rect_A:
			
			this._case_ACTION_DOWN__Rect_A(x, y);
			
			break;
			
//		case Cir_A:
//			
//			this._case_ACTION_DOWN__CirA(x, y);
//			
//			break;
			
		case Rect_B:
			
			this._case_ACTION_DOWN__Rect_B(x, y);
			
		case Rect_C:
			
			this._case_ACTION_DOWN__Rect_C(x, y);
			
//			// Log
//			String msg_Log = "case => Rect_B";
//			Log.d("V_OTL.java" + "["
//					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//					+ "]", msg_Log);
//			this._case_ACTION_DOWN__CirA(x, y);
			
			break;
			
		case Others:
			
			this._case_ACTION_DOWN__CirA(x, y);
			
			break;
			
		default:
			
			
			break;
		
		}
		
		////////////////////////////////

		// onClick-related

		////////////////////////////////
		CONS.Canvas.x_Down = x;
		CONS.Canvas.y_Down = y;
		
	}//_case_ACTION_DOWN

	private void 
	_case_ACTION_DOWN__CirA
	(float x, float y) {
		// TODO Auto-generated method stub
		
		////////////////////////////////

		// record: positon

		////////////////////////////////
		CONS.Canvas.Cir_A_X_prev = x;
		CONS.Canvas.Cir_A_Y_prev = y;
//		CONS.Canvas.Cir_A_DOWN_X = x;
//		CONS.Canvas.Cir_A_DOWN_Y = y;
//		
//		// Log
//		String msg_Log = String.format("DOWN_X = %f / DOWN_Y = %f", 
//					CONS.Canvas.Cir_A_DOWN_X,
//					CONS.Canvas.Cir_A_DOWN_Y
//					);
		
//		Log.d("V_OTL.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", msg_Log);
		
		////////////////////////////////

		// detection

		////////////////////////////////
		double distance = Math.sqrt(
							Math.pow((CONS.Canvas.Cir_A_X - x), 2)
							+ Math.pow((CONS.Canvas.Cir_A_Y - y), 2));
		
		// Log
//		msg_Log = "distance => " + distance;
		String msg_Log = "distance => " + distance;
		Log.d("V_OTL.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		////////////////////////////////

		// draw

		////////////////////////////////
		if (distance > CONS.Canvas.Cir_A_Radius) {
			
			this.cv.draw_Circle_A(actv, (int)x, (int)y);
			
		}

	}//_case_ACTION_DOWN__CirA
	
	private void 
	_case_ACTION_DOWN__Rect_A
	(float x, float y) {
		// TODO Auto-generated method stub

		////////////////////////////////

		// record: positon

		////////////////////////////////
		CONS.Canvas.Rect_A_X_prev = x;
		CONS.Canvas.Rect_A_Y_prev = y;

		////////////////////////////////

		// get: dist from base

		////////////////////////////////
		CONS.Canvas.Rect_A_X_dist_from_base = 
						x - CONS.Canvas.Rect_A_X1;
		
		CONS.Canvas.Rect_A_Y_dist_from_base = 
						y - CONS.Canvas.Rect_A_Y1;
		
	}//_case_ACTION_DOWN__CirA
	
	private void 
	_case_ACTION_DOWN__Rect_B
	(float x, float y) {
		// TODO Auto-generated method stub
		
		////////////////////////////////
		
		// record: positon
		
		////////////////////////////////
		CONS.Canvas.Rect_B_X1_prev = x;
		CONS.Canvas.Rect_B_Y1_prev = y;
		
		////////////////////////////////
		
		// get: dist from base
		
		////////////////////////////////
		CONS.Canvas.Rect_B_X_dist_from_base = 
				x - CONS.Canvas.Rect_B_X1;
		
		CONS.Canvas.Rect_B_Y_dist_from_base = 
				y - CONS.Canvas.Rect_B_Y1;
		
	}//_case_ACTION_DOWN__CirA
	
	private void 
	_case_ACTION_DOWN__Rect_C
	(float x, float y) {
		// TODO Auto-generated method stub
		
		////////////////////////////////
		
		// record: positon
		
		////////////////////////////////
		CONS.Canvas.Rect_C_X1_prev = x;
		CONS.Canvas.Rect_C_Y1_prev = y;
		
		////////////////////////////////
		
		// get: dist from base
		
		////////////////////////////////
		CONS.Canvas.Rect_C_X_dist_from_base = 
				x - CONS.Canvas.Rect_C_X1;
		
		CONS.Canvas.Rect_C_Y_dist_from_base = 
				y - CONS.Canvas.Rect_C_Y1;
		
	}//_case_BCTION_DOWN__Rect_C
	
}//public class DB_OTL implements OnTouchListener
