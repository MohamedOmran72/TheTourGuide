package com.example.thetourguide.utilities;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HelperMethod {

    /**
     * helper method to replace fragment {@code replaceFragment}
     *
     * @param getChildFragmentManager return a private FragmentManager for placing and managing Fragments inside of this Fragment.
     * @param id the id of fragment container that i will replace.
     * @param fragment the new fragment that i will add.
     */
    public static void replaceFragment(FragmentManager getChildFragmentManager, int id, Fragment fragment) {
        FragmentTransaction transaction = getChildFragmentManager.beginTransaction();
        transaction.replace(id, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
