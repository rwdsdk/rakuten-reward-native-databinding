package com.rakuten.gap.ads.mission_sps.databinding;
import com.rakuten.gap.ads.mission_sps.R;
import com.rakuten.gap.ads.mission_sps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenRewardSpsHeaderBindingImpl extends RakutenRewardSpsHeaderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"layout_reward_unclaimed_counter"},
            new int[] {1},
            new int[] {com.rakuten.gap.ads.mission_sps.R.layout.layout_reward_unclaimed_counter});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reward_sps_header_back, 2);
        sViewsWithIds.put(R.id.reward_sps_header_close, 3);
        sViewsWithIds.put(R.id.reward_sps_header_sps, 4);
        sViewsWithIds.put(R.id.appCompatImageView, 5);
        sViewsWithIds.put(R.id.sps_home_tab, 6);
        sViewsWithIds.put(R.id.reward_sps_header_mission, 7);
        sViewsWithIds.put(R.id.appCompatImageView2, 8);
        sViewsWithIds.put(R.id.sps_mission_tab, 9);
        sViewsWithIds.put(R.id.reward_sps_header_more, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenRewardSpsHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private RakutenRewardSpsHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            );
        this.rewardSpsHeader.setTag(null);
        setContainedBinding(this.rewardSpsHeaderUnclaimed);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        rewardSpsHeaderUnclaimed.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rewardSpsHeaderUnclaimed.hasPendingBindings()) {
            return true;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.unclaimItemNumber);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rewardSpsHeaderUnclaimed.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRewardSpsHeaderUnclaimed((com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRewardSpsHeaderUnclaimed(com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding RewardSpsHeaderUnclaimed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.Integer unclaimItemNumber = mUnclaimItemNumber;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.rewardSpsHeaderUnclaimed.setUnclaimItemNumber(unclaimItemNumber);
        }
        executeBindingsOn(rewardSpsHeaderUnclaimed);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rewardSpsHeaderUnclaimed
        flag 1 (0x2L): unclaimItemNumber
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}