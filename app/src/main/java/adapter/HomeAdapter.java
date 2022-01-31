package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Onclick;
import com.example.instagram.databinding.ItemHomeBinding;

import java.util.ArrayList;

import model.ModelHome;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.CountViewHolder> {
    private Onclick onclick;
    ArrayList<ModelHome> publ;

    public HomeAdapter(Onclick onclick, ArrayList<ModelHome> publ) {
        this.onclick = onclick;
        this.publ = publ;
    }

    public HomeAdapter(ArrayList<ModelHome> publ) {
        this.publ = publ;
    }


    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHomeBinding binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);

        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(publ.get(position));
        holder.binding.getRoot().setOnClickListener(view -> {
            onclick.onclick(publ.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return publ.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {
        private ItemHomeBinding binding;

        public CountViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(ModelHome instaModel) {
            binding.imageHome.setImageResource(instaModel.getImage());
            binding.tvName.setText(instaModel.getText());
            binding.tvData.setText(instaModel.getData());
        }
    }
}

