package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiUnclaimitemFragmentBindingImpl extends RakutenrewardUiUnclaimitemFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_unclaimsheet, 3);
        sViewsWithIds.put(R.id.bell_icon, 4);
        sViewsWithIds.put(R.id.right_icon, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiUnclaimitemFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiUnclaimitemFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.portalViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePortalViewModelUnclaimItemNumber((androidx.databinding.ObservableInt) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel portalViewModel = mPortalViewModel;
        java.lang.String mboundView2AndroidStringRakutenrewardsdkTabUnclaimtitlePortalViewModelUnclaimItemNumber = null;
        androidx.databinding.ObservableInt portalViewModelUnclaimItemNumber = null;
        boolean portalViewModelUnclaimItemNumberInt0 = false;
        int portalViewModelUnclaimItemNumberInt0ViewVISIBLEViewGONE = 0;
        int portalViewModelUnclaimItemNumberGet = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (portalViewModel != null) {
                    // read portalViewModel.unclaimItemNumber
                    portalViewModelUnclaimItemNumber = portalViewModel.getUnclaimItemNumber();
                }
                updateRegistration(0, portalViewModelUnclaimItemNumber);


                if (portalViewModelUnclaimItemNumber != null) {
                    // read portalViewModel.unclaimItemNumber.get()
                    portalViewModelUnclaimItemNumberGet = portalViewModelUnclaimItemNumber.get();
                }


                // read @android:string/rakutenrewardsdk_tab_unclaimtitle
                mboundView2AndroidStringRakutenrewardsdkTabUnclaimtitlePortalViewModelUnclaimItemNumber = mboundView2.getResources().getString(R.string.rakutenrewardsdk_tab_unclaimtitle, portalViewModelUnclaimItemNumberGet);
                // read portalViewModel.unclaimItemNumber.get() > 0
                portalViewModelUnclaimItemNumberInt0 = (portalViewModelUnclaimItemNumberGet) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(portalViewModelUnclaimItemNumberInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read portalViewModel.unclaimItemNumber.get() > 0 ? View.VISIBLE : View.GONE
                portalViewModelUnclaimItemNumberInt0ViewVISIBLEViewGONE = ((portalViewModelUnclaimItemNumberInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(portalViewModelUnclaimItemNumberInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringRakutenrewardsdkTabUnclaimtitlePortalViewModelUnclaimItemNumber);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): portalViewModel.unclaimItemNumber
        flag 1 (0x2L): portalViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): portalViewModel.unclaimItemNumber.get() > 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): portalViewModel.unclaimItemNumber.get() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}