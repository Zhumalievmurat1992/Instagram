package ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentHomeBinding;

import java.util.ArrayList;

import adapter.HomeAdapter;
import model.ModelHome;


public class HomeFragment extends Fragment {

    private HomeAdapter homeAdapter;
    private ArrayList<ModelHome> modelHomes;
    private FragmentHomeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
        // Inflate the layout for this fragment
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        homeAdapter = new HomeAdapter(modelHomes);
        binding.recycleHome.setAdapter(homeAdapter);
    }

    private void loadData() {
        modelHomes = new ArrayList<>();
        modelHomes.add(new ModelHome("joshua_l The game in Japan was amazing and I want to share some photos", "september 19", R.drawable.rectangle));
        modelHomes.add(new ModelHome("joshua_l The game in Japan was amazing and I want to share some photos", "september 19", R.drawable.rectangle));
        modelHomes.add(new ModelHome("joshua_l The game in Japan was amazing and I want to share some photos", "september 19", R.drawable.rectangle));
        modelHomes.add(new ModelHome("joshua_l The game in Japan was amazing and I want to share some photos", "september 19", R.drawable.rectangle));
        modelHomes.add(new ModelHome("joshua_l The game in Japan was amazing and I want to share some photos", "september 19", R.drawable.rectangle));
    }


}