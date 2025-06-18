package com.simplecityapps.recycler_adapter.model;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public interface ViewModel extends RecyclerView.ViewHolder> extends ContentsComparator {

    int getViewType();

    void bindView(VH holder);

    void bindView(VH holder, int position, List payloads);

    VH createViewHolder(ViewGroup parent);

    int getSpanSize(int spanCount);
}