package goals.dream.menu_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

// could cause error ??
        getSupportActionBar().setTitle("Your title");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//icons
        if (id == R.id.icon_1) {
            Toast.makeText(this, "icon_1", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icon_2) {
            Toast.makeText(this, "icon_2", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icon_3) {
            Toast.makeText(this, "icon_3", Toast.LENGTH_SHORT).show();
        }
 //menu
        if (id == R.id.menu_1) {
            Toast.makeText(this, "menu_1", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_2) {
            Toast.makeText(this, "menu_2", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_3) {
            Toast.makeText(this, "menu_3", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_4) {
            Toast.makeText(this, "menu_4", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_5) {
            Toast.makeText(this, "menu_5", Toast.LENGTH_SHORT).show();
            //
        }
        return super.onOptionsItemSelected(item);
    }

    //button clicks------------------------------------------------------------------
    public void buttonOnClick(View view) {
        int the_id = view.getId();
        if (the_id == R.id.b_1) {
            Toast.makeText(this, "but_1_works", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.b_2) {
            Toast.makeText(this, "but_2_works", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.b_3) {
            Toast.makeText(this, "but_3_works", Toast.LENGTH_SHORT).show();
        }
    }



}
//notes

/* ....
Linear view with buttons lined up
creates icon to launch(easily changed because its already there)
can change the title
can prevent the keyboard from auto pop up
has 5 drop down buttons(***and code)
has 5 icon non scrolling menu buttons(***and code)
has snack bar button-and snack bar debug info thing
has 3 set buttons with on click event (***and code)
*can save and retrieve settings
* has 2 hidden pop up text debuggers for showing data
* has link to another blank activity
*  can implement list view for showing data
* clipboard
*
*
*
*/
