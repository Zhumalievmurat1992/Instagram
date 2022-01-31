package ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentImageBinding;

import java.util.ArrayList;

import adapter.AdapterPerson;
import model.ModelPerson;


public class ImageFragment extends Fragment {

    private AdapterPerson adapterPerson;
    private ArrayList<ModelPerson> person;
    private FragmentImageBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentImageBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapterPerson = new AdapterPerson(person);
        binding.recyclerImage.setAdapter(adapterPerson);
    }
    private void loadData() {
        person = new ArrayList<>();
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));
        person.add(new ModelPerson(R.drawable.image));

    }
}