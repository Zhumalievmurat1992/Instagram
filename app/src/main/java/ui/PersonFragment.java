package ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentPersonBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class PersonFragment extends Fragment {
    private AdapterViewPager adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private FragmentPersonBinding binding;
    private int[] icon = {R.drawable.ic_grid_icon, R.drawable.ic_tags_icon};

//    private AdapterViewPager adapter;
//    private ArrayList<Fragment> list = new ArrayList<>();
//    private FragmentPersonBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPersonBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewPager();
        initTab();
    }

    private void initViewPager() {
        adapter = new AdapterViewPager(this);
        list.add(new ImageFragment());
        list.add(new Image2Fragment());
        adapter.setFragments(list);
        binding.viewPager.setAdapter(adapter);
    }

    private void initTab() {
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position)
                -> tab.setIcon(icon[position])).attach();
    }

    class AdapterViewPager extends FragmentStateAdapter {

        private ArrayList<Fragment> fragments = new ArrayList<>();

        public void setFragments(ArrayList<Fragment> fragments) {
            this.fragments = fragments;
        }

        public AdapterViewPager(@NonNull Fragment fragment) {
            super(fragment);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragments.get(position);
        }

        @Override
        public int getItemCount() {
            return fragments.size();
        }
    }
//        ArrayList<Fragment> arraylist = new ArrayList<>();
//        arraylist.add(new PersonFragment());
//        arraylist.add(new PersonFragment());
//        AdapterViewPager adapterViewPager = new AdapterViewPager(getChildFragmentManager(), 1);
//        adapterViewPager.setFragments(arraylist);
//        binding.viewPager.setAdapter(adapterViewPager);
//        binding.tabLayout.setupWithViewPager(binding.viewPager);
}

//    class AdapterViewPager extends FragmentPagerAdapter {
//
//        private ArrayList<Fragment> fragments = new ArrayList<>();
//
//        public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
//            super(fm, behavior);
//        }
//
//        public void setFragments(ArrayList<Fragment> listFragment) {
//            fragments.addAll(listFragment);
//        }
//
//        @NonNull
//        @Override
//        public Fragment getItem(int position) {
//            return fragments.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return fragments.size();
//        }
//
//        public CharSequence getPageTitle(int position){
//            return "fragment" + position ;
//        }



