package com.example.administrator.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */

public class simpleAdapter extends RecyclerView.Adapter<simpleAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mDatas;
    private LayoutInflater mInflater;

    public simpleAdapter(Context context,List<String> datas){
        this.mContext = context;
        this.mDatas = datas;
        mInflater  = LayoutInflater.from(context);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.textview);

        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(mDatas.get(position));
    }




    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}

