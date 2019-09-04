package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<Email> EmailList;
    private Context ctx;

    public RecyclerViewAdapter(List<Email> EmailList, Context ctx) {
        this.ctx = ctx;
        this.EmailList = EmailList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Email email = EmailList.get(position);
        holder.nama.setText(email.getNama());
        holder.subjek.setText(email.getSubjek());
        holder.pesan.setText(email.getPesan());

        Glide.with(ctx).load(email.getIcon()).apply(RequestOptions.circleCropTransform().circleCrop()).into(holder.iconn);
    }

    @Override
    public int getItemCount() {
        return EmailList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama, subjek, pesan;
        public ImageView iconn;

        public MyViewHolder(View view) {
            super(view);
            nama = view.findViewById(R.id.nama);
            subjek = view.findViewById(R.id.subject);
            pesan = view.findViewById(R.id.pesan);
            iconn = view.findViewById(R.id.icon);
        }
    }
}