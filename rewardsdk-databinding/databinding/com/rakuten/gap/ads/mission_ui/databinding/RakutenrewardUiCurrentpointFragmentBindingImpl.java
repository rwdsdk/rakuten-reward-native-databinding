package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiCurrentpointFragmentBindingImpl extends RakutenrewardUiCurrentpointFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_point_layout, 5);
        sViewsWithIds.put(R.id.current_month_points_label, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiCurrentpointFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiCurrentpointFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.rakutenrewardMonthlypoint.setTag(null);
        this.rakutenrewardTotalPoint.setTag(null);
        this.rakutenrewardUsername.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePortalViewModelRewardPoint((androidx.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangePortalViewModelTotalRakutenPoint((androidx.databinding.ObservableLong) object, fieldId);
        }
        return false;
    }
    private boolean onChangePortalViewModelRewardPoint(androidx.databinding.ObservableInt PortalViewModelRewardPoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePortalViewModelTotalRakutenPoint(androidx.databinding.ObservableLong PortalViewModelTotalRakutenPoint, int fieldId) {
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
        java.lang.String rakutenrewardTotalPointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelTotalRakutenPoint = null;
        int portalViewModelRewardPointGet = 0;
        androidx.databinding.ObservableInt portalViewModelRewardPoint = null;
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel portalViewModel = mPortalViewModel;
        androidx.databinding.ObservableLong portalViewModelTotalRakutenPoint = null;
        long portalViewModelTotalRakutenPointGet = 0;
        int portalViewModelRakutenAuthRowVisibility = 0;
        java.lang.String portalViewModelGetUserName = null;
        java.lang.String rakutenrewardMonthlypointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelRewardPoint = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (portalViewModel != null) {
                        // read portalViewModel.rewardPoint
                        portalViewModelRewardPoint = portalViewModel.getRewardPoint();
                    }
                    updateRegistration(0, portalViewModelRewardPoint);


                    if (portalViewModelRewardPoint != null) {
                        // read portalViewModel.rewardPoint.get()
                        portalViewModelRewardPointGet = portalViewModelRewardPoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_tab_currentpointformat
                    rakutenrewardMonthlypointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelRewardPoint = rakutenrewardMonthlypoint.getResources().getString(R.string.rakutenrewardsdk_tab_currentpointformat, portalViewModelRewardPointGet);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (portalViewModel != null) {
                        // read portalViewModel.totalRakutenPoint
                        portalViewModelTotalRakutenPoint = portalViewModel.getTotalRakutenPoint();
                    }
                    updateRegistration(1, portalViewModelTotalRakutenPoint);


                    if (portalViewModelTotalRakutenPoint != null) {
                        // read portalViewModel.totalRakutenPoint.get()
                        portalViewModelTotalRakutenPointGet = portalViewModelTotalRakutenPoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_tab_currentpointformat
                    rakutenrewardTotalPointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelTotalRakutenPoint = rakutenrewardTotalPoint.getResources().getString(R.string.rakutenrewardsdk_tab_currentpointformat, portalViewModelTotalRakutenPointGet);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (portalViewModel != null) {
                        // read portalViewModel.rakutenAuthRowVisibility
                        portalViewModelRakutenAuthRowVisibility = portalViewModel.getRakutenAuthRowVisibility();
                        // read portalViewModel.getUserName()
                        portalViewModelGetUserName = portalViewModel.getUserName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(portalViewModelRakutenAuthRowVisibility);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardUsername, portalViewModelGetUserName);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardMonthlypoint, rakutenrewardMonthlypointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelRewardPoint);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardTotalPoint, rakutenrewardTotalPointAndroidStringRakutenrewardsdkTabCurrentpointformatPortalViewModelTotalRakutenPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): portalViewModel.rewardPoint
        flag 1 (0x2L): portalViewModel.totalRakutenPoint
        flag 2 (0x3L): portalViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}