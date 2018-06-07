package id.ac.um.produkskripsi;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
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
import android.widget.Toast;

import id.ac.um.produkskripsi.adapter.TabsAdapter;
import id.ac.um.produkskripsi.materi.AplikasiBitmap;
import id.ac.um.produkskripsi.materi.CiriBitmap;
import id.ac.um.produkskripsi.materi.CitraFragment;
import id.ac.um.produkskripsi.materi.CitraKIKD;
import id.ac.um.produkskripsi.materi.EfekFragment;
import id.ac.um.produkskripsi.materi.EfekKIKD;
import id.ac.um.produkskripsi.materi.GabungFragment;
import id.ac.um.produkskripsi.materi.GabungKIKD;
import id.ac.um.produkskripsi.materi.PengertianCitra;
import id.ac.um.produkskripsi.materi.PrinsipGabung;
import id.ac.um.produkskripsi.materi.submateri.JenisEfek;
import id.ac.um.produkskripsi.materi.submateri.LayerFragment;

public class CitraBitmap extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static String KEYMENU1 = "menusatu";
    String getMenu;
    TextView ubahTitle;
    ImageView ubahGambar;
    LinearLayout bg;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citra_bitmap);
        Intent a = getIntent();


        NavigationView navigationView =(NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View menuView = navigationView.getHeaderView(0);
        getMenu = a.getStringExtra(KEYMENU1);
        NavigationView na = (NavigationView) findViewById(R.id.nav_view);

        ubahGambar = findViewById(R.id.navImage);
        ubahTitle = menuView.findViewById(R.id.navTitle);
        ubahGambar = menuView.findViewById(R.id.navImage);
        bg = menuView.findViewById(R.id.backgroundNav);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);

        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsAdapter);

        Menu navmenu = na.getMenu();
//        menyembunyikan menu yang ada
        navmenu.findItem(R.id.homeCitra).setVisible(false);
        navmenu.findItem(R.id.kikdCitra).setVisible(false);
        navmenu.findItem(R.id.pengertiancitra).setVisible(false);
        navmenu.findItem(R.id.ciricitra).setVisible(false);
        navmenu.findItem(R.id.evaluasiCitra).setVisible(false);
        navmenu.findItem(R.id.aplikasiCitra).setVisible(false);

        navmenu.findItem(R.id.homeGabung).setVisible(false);
        navmenu.findItem(R.id.evaluasiGabung).setVisible(false);
        navmenu.findItem(R.id.kikdGabung).setVisible(false);
        navmenu.findItem(R.id.prinsipgabung).setVisible(false);
        navmenu.findItem(R.id.prosesgabung).setVisible(false);

        navmenu.findItem(R.id.homeEfek).setVisible(false);
        navmenu.findItem(R.id.pembuatanEfek).setVisible(false);
        navmenu.findItem(R.id.kikdEfek).setVisible(false);
        navmenu.findItem(R.id.jenisEfek).setVisible(false);
        navmenu.findItem(R.id.evaluasiEfek).setVisible(false);



        if (getMenu.equals("satu")) {
            setTitle("Citra Bitmap");
            navmenu.findItem(R.id.homeCitra).setVisible(true);
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
            navmenu.findItem(R.id.homeGabung).setVisible(true);
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
            navmenu.findItem(R.id.homeEfek).setVisible(true);
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


        if (id == R.id.homeCitra) {
            CitraFragment fragment = new CitraFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.homeGabung) {
            GabungFragment fragment = new GabungFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.homeEfek) {
            EfekFragment fragment = new EfekFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.kikdCitra) {
            CitraKIKD fragment = new CitraKIKD();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.pengertiancitra) {
            PengertianCitra fragment = new PengertianCitra();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.ciricitra) {
            CiriBitmap fragment = new CiriBitmap();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        }else if (id == R.id.aplikasiCitra) {
            AplikasiBitmap fragment = new AplikasiBitmap();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.kikdGabung) {
            GabungKIKD fragment = new GabungKIKD();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.prinsipgabung) {
            PrinsipGabung fragment = new PrinsipGabung();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.VISIBLE);
            viewPager.setVisibility(View.VISIBLE);

        }  else if (id == R.id.kikdEfek) {
            EfekKIKD fragment = new EfekKIKD();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        } else if (id == R.id.jenisEfek) {
            JenisEfek fragment = new JenisEfek();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.place, fragment);
            fragmentTransaction.commit();
            tabLayout.setVisibility(View.GONE);
            viewPager.setVisibility(View.GONE);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Silahkan gunakan navigasi yang disediakan", Toast.LENGTH_SHORT).show();
//        super.onBackPressed();
    }
}
