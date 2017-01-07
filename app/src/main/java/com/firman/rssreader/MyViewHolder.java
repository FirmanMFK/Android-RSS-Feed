package com.firman.rssreader;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Firman on 1/8/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView titleTxt,descTxt,dateTxt;
    ItemClickListener itemClickListener;
    public MyViewHolder(View itemView) {
        super(itemView);
        titleTxt=(TextView)itemView.findViewById(R.id.titleTxt);
        descTxt=(TextView)itemView.findViewById(R.id.descTxt);
        dateTxt=(TextView)itemView.findViewById(R.id.dateTxt);
        itemView.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }
    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}