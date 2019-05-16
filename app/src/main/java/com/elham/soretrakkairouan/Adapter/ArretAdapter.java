package com.elham.soretrakkairouan.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.elham.soretrakkairouan.InfoArret;
import com.elham.soretrakkairouan.R;
import com.elham.soretrakkairouan.Record;

import java.util.List;

public class ArretAdapter extends RecyclerView.Adapter<ArretAdapter.ActorViewHolder> {

    List<Record> items;
    private Context ctx;
    //String btnValue,idUtilisateur;
    public ArretAdapter(List<Record> items, Context ctx) {
        this.items = items;
        this.ctx=ctx;


    }

    @Override
    public ArretAdapter.ActorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_rows_arret,viewGroup,false);

        ArretAdapter.ActorViewHolder Actionview = new ArretAdapter.ActorViewHolder(v);
        return Actionview;
    }

    @Override
    public void onBindViewHolder(ArretAdapter.ActorViewHolder holder, int position) {
        Record dm = items.get(position);
        holder.txtStation.setText(dm.getDENOMLI());


        holder.dm=dm;

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  class ActorViewHolder extends RecyclerView.ViewHolder{
        TextView txtStation;
        ImageView tvImage1;
        Record dm;
        public ActorViewHolder(View itemView) {
            super(itemView);

            txtStation=  itemView.findViewById(R.id.txtStation);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        Intent intent=new Intent(ctx, InfoArret.class);
                        intent.putExtra("nomArret", ""+dm.getDENOMLI());
                        intent.putExtra("arrival", ""+dm.getRTARRIVALTIME());
                        intent.putExtra("depart", ""+dm.getRTDEPARTURETIME());
                        ctx.startActivity(intent);}




            });

        }
    }


}
