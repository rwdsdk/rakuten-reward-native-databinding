package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiUnclaimInfoFragmentBindingImpl extends RakutenrewardUiUnclaimInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_infomessage_infologo, 1);
        sViewsWithIds.put(R.id.rakutenreward_infomessage_message, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiUnclaimInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiUnclaimInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.rakutenrewardInfomessageRoot.setTag(null);
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
                return onChangePortalViewModelUnclaimInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangePortalViewModelUnclaimInfoVisible(androidx.databinding.ObservableBoolean PortalViewModelUnclaimInfoVisible, int fieldId) {
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
        int portalViewModelUnclaimInfoVisibleViewVISIBLEViewGONE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel portalViewModel = mPortalViewModel;
        androidx.databinding.ObservableBoolean portalViewModelUnclaimInfoVisible = null;
        boolean portalViewModelUnclaimInfoVisibleGet = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (portalViewModel != null) {
                    // read portalViewModel.unclaimInfoVisible
                    portalViewModelUnclaimInfoVisible = portalViewModel.getUnclaimInfoVisible();
                }
                updateRegistration(0, portalViewModelUnclaimInfoVisible);


                if (portalViewModelUnclaimInfoVisible != null) {
                    // read portalViewModel.unclaimInfoVisible.get()
                    portalViewModelUnclaimInfoVisibleGet = portalViewModelUnclaimInfoVisible.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(portalViewModelUnclaimInfoVisibleGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read portalViewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
                portalViewModelUnclaimInfoVisibleViewVISIBLEViewGONE = ((portalViewModelUnclaimInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardInfomessageRoot.setVisibility(portalViewModelUnclaimInfoVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): portalViewModel.unclaimInfoVisible
        flag 1 (0x2L): portalViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): portalViewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): portalViewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}