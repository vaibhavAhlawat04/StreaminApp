package com.example.streaming;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.streaming.Home.Home_fragment;
import com.example.streaming.Home.Home_mainAdapter;
import com.example.streaming.Movies.Movies;
import com.example.streaming.TvShows.TvShows;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fl_fragment,Home_fragment.class,null)
                .commit();

        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.menubar);

        drawerLayout = findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction frag=getSupportFragmentManager().beginTransaction();
                switch(item.getItemId()){
                    case R.id.menu_Home:
                        frag.replace(R.id.fl_fragment, Home_fragment.class,null);
                        frag.commit();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_settings:
                        Toast.makeText(getApplicationContext(),"Settings Selected ",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;
                    case R.id.menu_Tvshows:
                        frag.replace(R.id.fl_fragment, TvShows.class,null);
                        frag.commit();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_Movies:
                        frag.replace(R.id.fl_fragment, Movies.class,null);
                        frag.commit();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });




    }
}
