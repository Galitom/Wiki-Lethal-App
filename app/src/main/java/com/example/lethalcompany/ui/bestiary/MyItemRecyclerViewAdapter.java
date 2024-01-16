package com.example.lethalcompany.ui.bestiary;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lethalcompany.ui.bestiary.placeholder.Bestiary;
import com.example.lethalcompany.ui.bestiary.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.lethalcompany.databinding.FragmentBestiaryBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Bestiary> mValues;

    public MyItemRecyclerViewAdapter(List<Bestiary> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentBestiaryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).getName().toString());
//        holder.mIdView.setOnClickListener(v -> {
//            Bestiary bestiary = mValues.get(position);
//            Intent intent = new Intent(holder.mIdView.getContext(),BestiaryDettaglio.class);
//            intent.putExtra("bestiary",bestiary);
//            holder.mIdView.getContext().startActivity(intent);
//        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public Bestiary mItem;

        public ViewHolder(FragmentBestiaryBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
        }
    }
}