package com.example.lethalcompany.ui.bestiary;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lethalcompany.R;
import com.example.lethalcompany.ui.bestiary.placeholder.Bestiary;
import com.example.lethalcompany.ui.bestiary.placeholder.PlaceholderContent;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

/**
 * A fragment representing a list of Items.
 */
public class BestiaryFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BestiaryFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static BestiaryFragment newInstance(int columnCount) {
        BestiaryFragment fragment = new BestiaryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bestiary_list, container, false);
        ArrayList<Bestiary> listaBestiary = new ArrayList<>();

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            MyItemRecyclerViewAdapter adapter = new MyItemRecyclerViewAdapter(listaBestiary);
            recyclerView.setAdapter(adapter);

            FirebaseFirestore db = FirebaseFirestore.getInstance();

            db.collection("bestiary")
                    .get()
                    .addOnCompleteListener(task -> {

                        if(task.isSuccessful()){
                            for (QueryDocumentSnapshot document : task.getResult()){
                                listaBestiary.add(document.toObject(Bestiary.class));
                            }
                            getActivity().runOnUiThread(adapter::notifyDataSetChanged);
                        }else{
                            Log.w("fetch_bestiary","Error getting doc", task.getException());
                        }
                    });
        }
        return view;
    }
}