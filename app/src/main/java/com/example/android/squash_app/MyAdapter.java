package com.example.android.squash_app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androidwarriors on 2/18/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ListViewHolder> {

    Context context;
    List<Court> dataList = new ArrayList<>();
    public LayoutInflater inflater;
    IListener listener;
    private  int j;

    public MyAdapter(Context context, List<Court> dataList1) {

        this.dataList = dataList1;
     //   this.listener= (IListener) context;

        inflater = LayoutInflater.from(context);


    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView iv_delete;

        public ListViewHolder(View itemView, int position) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.c_name);
            iv_delete= (TextView) itemView.findViewById(R.id.c_address);


            tv_name.setText(dataList.get(position).name);
            iv_delete.setText(dataList.get(position).address);


        }
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View convertView = inflater.inflate(R.layout.single_card, parent, false);
        ListViewHolder viewHolder = new ListViewHolder(convertView,j);
       j++;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {



return;

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }




}





