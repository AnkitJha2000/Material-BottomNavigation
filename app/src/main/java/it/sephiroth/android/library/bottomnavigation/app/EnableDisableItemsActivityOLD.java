package it.sephiroth.android.library.bottomnavigation.app;

import androidx.annotation.IdRes;

/**
 * Created by crugnola on 10/24/16.
 * BottomNavigation
 */

public class EnableDisableItemsActivityOLD extends MainActivityOLD {

    @Override
    protected int getActivityLayoutResId() {
        return R.layout.activity_enable_disable_items;
    }

    @Override
    public void onMenuItemReselect(@IdRes final int itemId, final int position, final boolean fromUser) {
        super.onMenuItemReselect(itemId, position, fromUser);

        EnableDisableActivityFragment fragment =
            (EnableDisableActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        if(null != fragment) {
            fragment.onMenuItemReselect(position, fromUser);
        }
    }

    @Override
    public void onMenuItemSelect(final int itemId, final int position, final boolean fromUser) {
        super.onMenuItemSelect(itemId, position, fromUser);


        EnableDisableActivityFragment fragment =
            (EnableDisableActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        if(null != fragment) {
            fragment.onMenuItemSelect(position, fromUser);
        }
    }
}
