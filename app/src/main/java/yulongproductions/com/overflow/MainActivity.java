package yulongproductions.com.overflow;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        int id = item.getItemId();
        if (id == R.id.menu_red) {
            if (item.isChecked()) {
                item.setChecked(false);
            } else {
                item.setChecked(true);
            }
            mainLayout.setBackgroundColor(Color.RED);
        } else if (id == R.id.menu_green) {
            if (item.isChecked()) {
                item.setChecked(false);
            } else {
                item.setChecked(true);
            }
            mainLayout.setBackgroundColor(Color.GREEN);
        } else if (id == R.id.menu_yellow) {
            if (item.isChecked()) {
                item.setChecked(false);
            } else {
                item.setChecked(true);
            }
            mainLayout.setBackgroundColor(Color.YELLOW);
        } else if (id == R.id.menu_blue) {
            if (item.isChecked()) {
                item.setChecked(false);
            } else {
                item.setChecked(true);
            }
            mainLayout.setBackgroundColor(Color.BLUE);
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;

        /* Alternative Switch case

        
        switch (item.getItemId()) {
            case R.id.menu_red:
                if (item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                mainLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_green:
                if (item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                mainLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_yellow:
                if (item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                mainLayout.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.menu_blue:
                if (item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                mainLayout.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        */
    }
}
