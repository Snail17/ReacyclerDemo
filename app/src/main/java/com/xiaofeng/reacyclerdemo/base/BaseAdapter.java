package com.xiaofeng.reacyclerdemo.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/4/4.
 */

public class BaseAdapter<T extends BaseViewHolder> extends RecyclerView.Adapter<T> {

    private Context mContext;
    private int layoutId;

    @Override
    public T onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(layoutId , parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(T holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
