package lassie.lassie;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Home extends ActionBarActivity {
    public final static String gebruikersnaammessage = Home.gebruikersnaammessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Lassie");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSearch() {

    }

    private void openSettings() {

    }

    public void Continue(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText gebruikersnaam = (EditText) findViewById(R.id.edittext_gebruikersnaam);
        String gebruikersnaamgegevens = gebruikersnaam.getText().toString();
        intent.putExtra(gebruikersnaammessage, gebruikersnaamgegevens);
        startActivity(intent);
    }
}
