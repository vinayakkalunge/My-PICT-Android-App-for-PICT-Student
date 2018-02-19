package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.relativelayout_for_fragment, homeFragment);
        fragmentTransaction.commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            //startActivity(new Intent(getApplicationContext(), Profile.class));
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, homeFragment, homeFragment.getTag()).commit();
            Toast.makeText(this,"Profile",Toast.LENGTH_SHORT).show();
        }
// else if (id == R.id.nav_attendance) {
//            AttendanceFragment attendanceFragment = new AttendanceFragment();
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, attendanceFragment, attendanceFragment.getTag()).commit();
//            Toast.makeText(this,"Attendance",Toast.LENGTH_SHORT).show();
//        }
        else if (id == R.id.nav_timetable) {
//            startActivity(new Intent(getApplicationContext(), Timetable1.class));
            TimetableFragment timetableFragment = new TimetableFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, timetableFragment, timetableFragment.getTag()).commit();
            Toast.makeText(this,"Departments",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_notices) {
//            startActivity(new Intent(getApplicationContext(), Notices.class));
            NoticesFragment noticesFragment = new NoticesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, noticesFragment, noticesFragment.getTag()).commit();
            Toast.makeText(this,"Notices",Toast.LENGTH_SHORT).show();

        }

        else if (id == R.id.nav_refrences) {
            RefrencesFragment refrencesFragment = new RefrencesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, refrencesFragment, refrencesFragment.getTag()).commit();
            Toast.makeText(this,"Refrences",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.nav_labmanuals) {
            LabmanualsFragment labmanualsFragment = new LabmanualsFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, labmanualsFragment, labmanualsFragment.getTag()).commit();
            Toast.makeText(this,"Labmanuals",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.nav_courses) {
            CourseFragment coursesFragment = new CourseFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, coursesFragment, coursesFragment.getTag()).commit();
            Toast.makeText(this,"Cources",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.nav_faculty) {
            FacultyFragment facultyFragment = new FacultyFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, facultyFragment, facultyFragment.getTag()).commit();
            Toast.makeText(this,"Faculty",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nav_academic_calender) {
            AcademiccalenderFragment academiccalenderFragment = new AcademiccalenderFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, academiccalenderFragment, academiccalenderFragment.getTag()).commit();
            Toast.makeText(this,"Academic Calender",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_about) {
            AboutFragment aboutFragment = new AboutFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, aboutFragment, aboutFragment.getTag()).commit();
            Toast.makeText(this,"About Us",Toast.LENGTH_SHORT).show();
        }






//         else if (id == R.id.nav_settings) {
//            SettingFragment settingFragment = new SettingFragment();
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, settingFragment, settingFragment.getTag()).commit();
//            Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();

//        }
        else if (id == R.id.nav_logout) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            Toast.makeText(this,"Logout Successfully",Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
