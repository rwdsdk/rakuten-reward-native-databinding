package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiUnclaimErrorFragmentBindingImpl extends RakutenrewardUiUnclaimErrorFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_errormessage_dangerlogo, 1);
        sViewsWithIds.put(R.id.rakutenreward_errormessage_message, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiUnclaimErrorFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiUnclaimErrorFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.rakutenrewardErrormessageRoot.setTag(null);
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
                return onChangePortalViewModelUnclaimSuccess((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangePortalViewModelUnclaimSuccess(androidx.databinding.ObservableBoolean PortalViewModelUnclaimSuccess, int fieldId) {
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
        int portalViewModelUnclaimSuccessViewGONEViewVISIBLE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel portalViewModel = mPortalViewModel;
        boolean portalViewModelUnclaimSuccessGet = false;
        androidx.databinding.ObservableBoolean portalViewModelUnclaimSuccess = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (portalViewModel != null) {
                    // read portalViewModel.unclaimSuccess
                    portalViewModelUnclaimSuccess = portalViewModel.getUnclaimSuccess();
                }
                updateRegistration(0, portalViewModelUnclaimSuccess);


                if (portalViewModelUnclaimSuccess != null) {
                    // read portalViewModel.unclaimSuccess.get()
                    portalViewModelUnclaimSuccessGet = portalViewModelUnclaimSuccess.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(portalViewModelUnclaimSuccessGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read portalViewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
                portalViewModelUnclaimSuccessViewGONEViewVISIBLE = ((portalViewModelUnclaimSuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardErrormessageRoot.setVisibility(portalViewModelUnclaimSuccessViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): portalViewModel.unclaimSuccess
        flag 1 (0x2L): portalViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): portalViewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): portalViewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}