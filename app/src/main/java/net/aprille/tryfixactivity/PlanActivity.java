package net.aprille.tryfixactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PlanActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void buttonClickAbout(View v)
    {
        Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }

    public void buttonClickThanks(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ThanksActivity.class);
        startActivity(intent);
    }

    public void buttonClickPeople(View v)
    {
        Intent intent = new Intent(getApplicationContext(), PeopleActivity.class);
        startActivity(intent);
    }

    public void buttonClickLegende(View v)
    {
        Intent intent = new Intent(getApplicationContext(), LegendeActivity.class);
        startActivity(intent);
    }

    public void buttonClickApp(View v)
    {
        Intent intent = new Intent(getApplicationContext(), AppActivity.class);
        startActivity(intent);
    }

}
