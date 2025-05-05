package com.rakuten.gap.ads.mission_sps.databinding;
import com.rakuten.gap.ads.mission_sps.R;
import com.rakuten.gap.ads.mission_sps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenRewardSpsPortalHeaderBindingImpl extends RakutenRewardSpsPortalHeaderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"layout_reward_unclaimed_counter"},
            new int[] {1},
            new int[] {com.rakuten.gap.ads.mission_sps.R.layout.layout_reward_unclaimed_counter});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reward_sps_portal_header_close, 2);
        sViewsWithIds.put(R.id.reward_sps_portal_header_sps, 3);
        sViewsWithIds.put(R.id.appCompatImageView, 4);
        sViewsWithIds.put(R.id.reward_sps_portal_tab_home, 5);
        sViewsWithIds.put(R.id.reward_sps_portal_header_mission, 6);
        sViewsWithIds.put(R.id.appCompatImageView2, 7);
        sViewsWithIds.put(R.id.reward_sps_portal_tab_mission, 8);
        sViewsWithIds.put(R.id.reward_sps_portal_header_more, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenRewardSpsPortalHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private RakutenRewardSpsPortalHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.rewardSpsPortalHeaderUnclaimed);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        rewardSpsPortalHeaderUnclaimed.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rewardSpsPortalHeaderUnclaimed.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.portalViewModel == variableId) {
            setPortalViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPortalViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel PortalViewModel) {
        this.mPortalViewModel = PortalViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.portalViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rewardSpsPortalHeaderUnclaimed.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePortalViewModelUnclaimItemNumber((androidx.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeRewardSpsPortalHeaderUnclaimed((com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangePortalViewModelUnclaimItemNumber(androidx.databinding.ObservableInt PortalViewModelUnclaimItemNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRewardSpsPortalHeaderUnclaimed(com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBinding RewardSpsPortalHeaderUnclaimed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel portalViewModel = mPortalViewModel;
        androidx.databinding.ObservableInt portalViewModelUnclaimItemNumber = null;
        int portalViewModelUnclaimItemNumberGet = 0;

        if ((dirtyFlags & 0xdL) != 0) {



                if (portalViewModel != null) {
                    // read portalViewModel.unclaimItemNumber
                    portalViewModelUnclaimItemNumber = portalViewModel.getUnclaimItemNumber();
                }
                updateRegistration(0, portalViewModelUnclaimItemNumber);


                if (portalViewModelUnclaimItemNumber != null) {
                    // read portalViewModel.unclaimItemNumber.get()
                    portalViewModelUnclaimItemNumberGet = portalViewModelUnclaimItemNumber.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.rewardSpsPortalHeaderUnclaimed.setUnclaimItemNumber(portalViewModelUnclaimItemNumberGet);
        }
        executeBindingsOn(rewardSpsPortalHeaderUnclaimed);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): portalViewModel.unclaimItemNumber
        flag 1 (0x2L): rewardSpsPortalHeaderUnclaimed
        flag 2 (0x3L): portalViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}