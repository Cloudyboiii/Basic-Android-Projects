package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnShow);
        Button btn1 = (Button) findViewById(R.id.button);
        registerForContextMenu(btn1);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        getMenuInflater().inflate(R.menu.menu, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(),
                Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.search_item:
// do your code
                return true;

            case R.id.upload_item:
// do your code
                return true;
            case R.id.copy_item:
// do your code
                return true;
            case R.id.print_item:
// do your code
                return true;
            case R.id.share_item:
// do your code
                return true;
            case R.id.bookmark_item:
// do your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}