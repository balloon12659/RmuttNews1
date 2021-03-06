package ball.mac.no.rmuttnews.utility;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ball.mac.no.rmuttnews.fragment.FollowerFragment;
import ball.mac.no.rmuttnews.fragment.MapsFragment;
import ball.mac.no.rmuttnews.fragment.NewsFragment;
import ball.mac.no.rmuttnews.fragment.NotificationFragment;

/**
 * Created by masterung on 23/12/2017 AD.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{

    private FragmentManager fragmentManager;
    private int anInt;

    public MyPagerAdapter(FragmentManager fragmentManager, int anInt) {
        super(fragmentManager);
        this.fragmentManager = fragmentManager;
        this.anInt = anInt;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FollowerFragment followerFragment = new FollowerFragment();
                return followerFragment;
            case 1:
                NotificationFragment notificationFragment = new NotificationFragment();
                return notificationFragment;
            case 2:
                NewsFragment newsFragment = new NewsFragment();
                return newsFragment;
            case 3:
                MapsFragment mapsFragment = new MapsFragment();
                return mapsFragment;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return anInt;
    }
}   // Main Class
