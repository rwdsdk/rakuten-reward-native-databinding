package com.rakuten.gap.ads.mission_sps.databinding;
import com.rakuten.gap.ads.mission_sps.R;
import com.rakuten.gap.ads.mission_sps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutRewardUnclaimedCounterBindingImpl extends LayoutRewardUnclaimedCounterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutRewardUnclaimedCounterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private LayoutRewardUnclaimedCounterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spsRewardUnclaimedCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.unclaimItemNumber == variableId) {
            setUnclaimItemNumber((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUnclaimItemNumber(@Nullable java.lang.Integer UnclaimItemNumber) {
        this.mUnclaimItemNumber = UnclaimItemNumber;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.unclaimItemNumber);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean unclaimItemNumberInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxUnclaimItemNumber = 0;
        java.lang.String stringValueOfUnclaimItemNumber = null;
        int unclaimItemNumberInt0ViewVISIBLEViewGONE = 0;
        java.lang.Integer unclaimItemNumber = mUnclaimItemNumber;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber)
                androidxDatabindingViewDataBindingSafeUnboxUnclaimItemNumber = androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber);


                // read androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber) > 0
                unclaimItemNumberInt0 = (androidxDatabindingViewDataBindingSafeUnboxUnclaimItemNumber) > (0);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber))
                stringValueOfUnclaimItemNumber = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxUnclaimItemNumber);
            if((dirtyFlags & 0x3L) != 0) {
                if(unclaimItemNumberInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber) > 0 ? View.VISIBLE : View.GONE
                unclaimItemNumberInt0ViewVISIBLEViewGONE = ((unclaimItemNumberInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spsRewardUnclaimedCount, stringValueOfUnclaimItemNumber);
            this.spsRewardUnclaimedCount.setVisibility(unclaimItemNumberInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): unclaimItemNumber
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber) > 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(unclaimItemNumber) > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}