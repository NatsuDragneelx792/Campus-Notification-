package com.example.abhinandan.onlinedb.adapters;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abhinandan.onlinedb.R;
import com.example.abhinandan.onlinedb.models.cardview_details;

import java.util.List;

public class circular_card_adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mContecxt;
    List<cardview_details> mData;
    public LayoutInflater inflater;

    public circular_card_adapter(Context mContecxt, List<cardview_details> mData) {
        this.mContecxt = mContecxt;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
       inflater= LayoutInflater.from(mContecxt);
        View v = inflater.inflate(R.layout.circular_single_cardview,viewGroup,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int i) {
        holder.background.setImageResource(mData.get(i).getBackground());
        holder.posting_date.setText(mData.get(i).getDate());
        holder.posting_time.setText(mData.get(i).getTime());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView background;
        TextView teacher,posting_date,posting_time;


        public myViewHolder(View itemView) {
            super(itemView);

            background=itemView.findViewById(R.id.card_background);
            teacher=itemView.findViewById(R.id.teacher_name);
            posting_date=itemView.findViewById(R.id.date_circular);
            posting_time=itemView.findViewById(R.id.time_circular);
        }
    }
}