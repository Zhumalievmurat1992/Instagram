package ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentPersonBinding;

import java.util.ArrayList;
import java.util.Objects;


public class PersonFragment extends Fragment {
    private AdapterViewPager adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private FragmentPersonBinding binding;


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
    }

    private void initViewPager() {
        adapter = new AdapterViewPager(getChildFragmentManager(), 0);
        list.add(new ImageFragment());
        list.add(new Image2Fragment());
        adapter.setFragments(list);
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        Objects.requireNonNull(binding.tabLayout.getTabAt(0)).setIcon(R.drawable.ic_grid_icon);
        Objects.requireNonNull(binding.tabLayout.getTabAt(1)).setIcon(R.drawable.ic_tags_icon);
    }

    class AdapterViewPager extends FragmentPagerAdapter {

        private ArrayList<Fragment> fragments = new ArrayList<>();

        public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void setFragments(ArrayList<Fragment> listFragment) {
            fragments.addAll(listFragment);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

    }
}

