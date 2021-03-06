package com.example.secure_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Diese Klasse implementiert einen Pageadapter für die Schwachstelle Client Side Injection.
 *
 * @author Marcel Hopp
 */
public class PageAdapter_client_side_injection extends FragmentPagerAdapter
{
    int tabcount;

    /**
     * Konstruktor
     * @param fm
     * @param behavior
     */
    public PageAdapter_client_side_injection(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0 : return new ClientSideInjection_Beschreibung();
            case 1 : return new ClientSideInjection_Vermeidung();
            case 2 : return new ClientSideInjection_Test();
            default: return null;
        }
    }

    /**
     * @return Anzahl der initialisierten Tabs.
     */
    @Override
    public int getCount() {
        return tabcount;
    }
}