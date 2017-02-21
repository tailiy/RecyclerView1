package com.example.administrator.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */
public class MyAdapter extends RecyclerView.Adapter<myViewHolder>{
    private LayoutInflater mInflater;
    private Context mContext;
    private List<String> mDatas;


    public MyAdapter(Context context,List<String> datas){
        this.mContext = context;
        this.mDatas = datas;
        mInflater  = LayoutInflater.from(context);
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item,parent,false);
        myViewHolder viewHolder = new myViewHolder(parent);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
    ///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        holder.tv.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}

 class myViewHolder extends RecyclerView.ViewHolder{
    TextView tv;
    public myViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.textview);

    }
}
