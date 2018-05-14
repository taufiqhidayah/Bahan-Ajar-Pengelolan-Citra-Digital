package id.ac.um.produkskripsi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.ac.um.produkskripsi.materi.PrinsipGabung;
import id.ac.um.produkskripsi.materi.submateri.LayerFragment;
import id.ac.um.produkskripsi.materi.submateri.PengantarGabung;
import id.ac.um.produkskripsi.materi.submateri.SelectionToolFragment;
import id.ac.um.produkskripsi.materi.submateri.TipsPenggabungan;

/**
 * Created by PROVIDER on 09/05/2018.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    String[] isi = new String[]{"Prinsip Penggabungan","Layer","Selection Tool", "Tips"};
    Integer tabnumber = 4;

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return isi[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                PengantarGabung pengantarGabung = new PengantarGabung();
                return pengantarGabung;
            case 1:
                LayerFragment layerFragment = new LayerFragment();
                return layerFragment;
            case 2:
                SelectionToolFragment selectionToolFragment = new SelectionToolFragment();
                return selectionToolFragment;
            case 3:
                TipsPenggabungan tipsPenggabungan = new TipsPenggabungan();
                return tipsPenggabungan;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
