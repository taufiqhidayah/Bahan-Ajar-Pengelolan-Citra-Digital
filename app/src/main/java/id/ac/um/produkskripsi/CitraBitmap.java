package id.ac.um.produkskripsi;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import id.ac.um.produkskripsi.materi.CitraFragment;
import id.ac.um.produkskripsi.materi.EfekFragment;
import id.ac.um.produkskripsi.materi.EfekKIKD;
import id.ac.um.produkskripsi.materi.GabungFragment;
import id.ac.um.produkskripsi.materi.GabungKIKD;
import id.ac.um.produkskripsi.materi.KIKD;

public class CitraBitmap extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static String KEYMENU1 = "menusatu";
    String getMenu;
    TextView ubahTitle;
    ImageView ubahGambar;
    LinearLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citra_bitmap);
        Intent a = getIntent();

        ubahGambar = findViewById(R.id.navImage);
        NavigationView navigationView =(NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View menuView = navigationView.getHeaderView(0);
        getMenu = a.getStringExtra(KEYMENU1);
        NavigationView na = (NavigationView) findViewById(R.id.nav_view);

        ubahTitle = menuView.findViewById(R.id.navTitle);
        ubahGambar = menuView.findViewById(R.id.navImage);
        bg = menuView.findViewById(R.id.backgroundNav);

        Menu navmenu = na.getMenu();
//        menyembunyikan menu yang ada
        navmenu.findItem(R.id.kikdCitra).setVisible(false);
        navmenu.findItem(R.id.pengertiancitra).setVisible(false);
        navmenu.findItem(R.id.ciricitra).setVisible(false);
        navmenu.findItem(R.id.evaluasiCitra).setVisible(false);
        navmenu.findItem(R.id.aplikasiCitra).setVisible(false);

        navmenu.findItem(R.id.evaluasiGabung).setVisible(false);
        navmenu.findItem(R.id.kikdGabung).setVisible(false);
        navmenu.findItem(R.id.prinsipgabung).setVisible(false);
        navmenu.findItem(R.id.prosesgabung).setVisible(false);

        navmenu.findItem(R.id.pembuatanEfek).setVisible(false);
        navmenu.findItem(R.id.kikdEfek).setVisible(false);
        navmenu.findItem(R.id.jenisEfek).setVisible(false);
        navmenu.findItem(R.id.evaluasiEfek).setVisible(false);


        if (getMenu.equals("satu")) {
            setTitle("Citra Bitmap");
            navmenu.findItem(R.id.kikdCitra).setVisible(true);
            navmenu.findItem(R.id.pengertiancitra).setVisible(true);
            navmenu.findItem(R.id.ciricitra).setVisible(true);
            navmenu.findItem(R.id.evaluasiCitra).setVisible(true);
            navmenu.findItem(R.id.aplikasiCitra).setVisible(true);
            ubahTitle.setText("Citra Bitmap");
            ubahGambar.setImageResource(R.drawable.iconcitra);
            CitraFragment fragment = new CitraFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();

        }else if (getMenu.equals("dua")){
            setTitle("Penggabungan Gambar Bitmap");
            navmenu.findItem(R.id.evaluasiGabung).setVisible(true);
            navmenu.findItem(R.id.kikdGabung).setVisible(true);
            navmenu.findItem(R.id.prinsipgabung).setVisible(true);
            navmenu.findItem(R.id.prosesgabung).setVisible(true);
            ubahTitle.setText("Penggabungan Gambar Bitmap");
            ubahGambar.setImageResource(R.drawable.icongabung);
            GabungFragment fragment = new GabungFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();

        }else if (getMenu.equals("tiga")){
            setTitle("Pemberian Efek Gambar Bitmap");
            navmenu.findItem(R.id.pembuatanEfek).setVisible(true);
            navmenu.findItem(R.id.kikdEfek).setVisible(true);
            navmenu.findItem(R.id.jenisEfek).setVisible(true);
            navmenu.findItem(R.id.evaluasiEfek).setVisible(true);
            ubahTitle.setText("Pemberian Efek Gambar Bitmap");
            ubahGambar.setImageResource(R.drawable.iconefek);
            EfekFragment fragment = new EfekFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

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
        getMenuInflater().inflate(R.menu.citra_bitmap, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            CitraBitmap.this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.kikdCitra) {
            Intent pindah = new Intent(CitraBitmap.this, KIKD.class);
            startActivity(pindah);

        } else if (id == R.id.kikdGabung) {
            GabungKIKD fragment = new GabungKIKD();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.kikdEfek) {
            EfekKIKD fragment = new EfekKIKD();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.prosesgabung) {
            HomeCB fragment = new HomeCB();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
