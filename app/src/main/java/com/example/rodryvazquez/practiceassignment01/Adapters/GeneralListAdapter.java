package com.example.rodryvazquez.practiceassignment01.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodryvazquez.practiceassignment01.Interfaces.FragmentCommunicator;
import com.example.rodryvazquez.practiceassignment01.R;

import java.util.List;

/**
 * Created by RodryVazquez on 08/08/17.
 */

public class GeneralListAdapter extends RecyclerView.Adapter<GeneralListAdapter.ViewHolder> {

    Context context;
    List<String> dummyDs;

    OnClickListListener rowListener;
    interface OnClickListListener {
        void onRowClickListener(int position);
    }

    public GeneralListAdapter(Context context, List<String> dummyDs) {
        this.context = context;
        this.dummyDs = dummyDs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        int resourceLayoutId = R.layout.general_list_adapter;
        View view = layoutInflater.inflate(resourceLayoutId, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(dummyDs.get(position));
        holder.setListeners();
    }

    @Override
    public int getItemCount() {
        return dummyDs.size();
    }

    /**
     *
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;
        View itemView;

        /**
         * @param itemView
         */
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_movie_title);
            this.itemView = itemView;
        }

        /**
         *
         */
        public void setListeners() {
            this.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentCommunicator fragmentCommunicator = (FragmentCommunicator) context;
                    int position = getAdapterPosition();
                    String movie = dummyDs.get(position);
                    fragmentCommunicator.displayMovieDetails(movie, "TAG");
                }
            });
        }
    }
}
