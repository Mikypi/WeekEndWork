package com.example.michaeliverson.weekendwork;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by michaeliverson on 7/11/17.
 */

public class ListAdaptor extends RecyclerView.Adapter<ListAdaptor.ListViewHolder>
{
    private ArrayList<IvyPojo> list;
    private Context context;

    public ListAdaptor(Context context,ArrayList<IvyPojo> list)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simplelist, parent, false);
        ListViewHolder ownerView = new ListViewHolder(view);
        return ownerView;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position)
    {
        TextView name = holder.tvName;
        TextView number = holder.tvNumber;

        name.setText(list.get(position).getName());
        number.setText(list.get(position).getNumber().toString());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvNumber;

        public ListViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView)itemView.findViewById(R.id.tvName);
            this.tvNumber = (TextView)itemView.findViewById(R.id.tvNumber);

        }
    }

}