package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemPhotoBinding;

import java.util.ArrayList;

import model.ModelPerson;

public class AdapterPerson extends RecyclerView.Adapter<AdapterPerson.CountViewHolder> {

    ArrayList<ModelPerson> person;

    public AdapterPerson(ArrayList<ModelPerson> person) {
        this.person = person;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPhotoBinding binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(person.get(position));
    }

    @Override
    public int getItemCount() {
        return person.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {

        private ItemPhotoBinding binding;

        public CountViewHolder(@NonNull ItemPhotoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ModelPerson person) {
            binding.imageGrid.setImageResource(person.getImage());
        }
    }
}
