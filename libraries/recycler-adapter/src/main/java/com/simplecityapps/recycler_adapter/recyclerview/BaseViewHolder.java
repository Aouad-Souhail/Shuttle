package com.simplecityapps.recycler_adapter.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.simplecityapps.recycler_adapter.model.ViewModel;

public abstract class BaseViewHolder extends ViewModel> extends RecyclerView.ViewHolder implements
        RecyclingViewHolder,
        AttachStateViewHolder {

    protected VM viewModel;

    protected BaseViewHolder(View itemView) {
        super(itemView);
    }

    /**
     * Call bind() when bindView(Holder holder) is called in the ViewModel, to associate the ViewModel with this ViewHolder.
     * This is useful when handling clicks on ViewHolder views - the click events can call methods on the associated ViewModel
     * to have the ViewModel respond to those events.
     *
     * @param viewModel the {@link ViewModel} to bind to this ViewHolder.
     */
    public void bind(VM viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void recycle() {
        // No-op, as this is a base class for ViewHolders.
    }

    @Override
    public void onAttachedToWindow() {
        // This method can be overridden in subclasses to handle when the ViewHolder is attached to the window.
    }

    @Override
    public void onDetachedFromWindow() {
        // This method can be overridden in subclasses to handle when the ViewHolder is detached from the window.
    }
}