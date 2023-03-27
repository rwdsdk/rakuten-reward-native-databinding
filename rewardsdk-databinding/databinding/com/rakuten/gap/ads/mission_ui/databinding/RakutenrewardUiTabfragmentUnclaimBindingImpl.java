package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiTabfragmentUnclaimBindingImpl extends RakutenrewardUiTabfragmentUnclaimBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_info_layout", "rakutenreward_ui_error_layout"},
            new int[] {3, 4},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_currentpoint_fragment_component, 5);
        sViewsWithIds.put(R.id.rakutenreward_unclaimlist, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.view.View mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiTabfragmentUnclaimBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiTabfragmentUnclaimBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[4]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        setContainedBinding(this.rakutenrewardErrorMessage);
        setContainedBinding(this.rakutenrewardInfoMessage);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        rakutenrewardInfoMessage.invalidateAll();
        rakutenrewardErrorMessage.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rakutenrewardInfoMessage.hasPendingBindings()) {
            return true;
        }
        if (rakutenrewardErrorMessage.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardInfoMessage.setLifecycleOwner(lifecycleOwner);
        rakutenrewardErrorMessage.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDividerLineVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeRakutenrewardInfoMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) object, fieldId);
            case 2 :
                return onChangeViewModelUnclaimInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeRakutenrewardErrorMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) object, fieldId);
            case 4 :
                return onChangeViewModelUnclaimSuccess((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDividerLineVisible(androidx.databinding.ObservableBoolean ViewModelDividerLineVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardInfoMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding RakutenrewardInfoMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUnclaimInfoVisible(androidx.databinding.ObservableBoolean ViewModelUnclaimInfoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardErrorMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding RakutenrewardErrorMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUnclaimSuccess(androidx.databinding.ObservableBoolean ViewModelUnclaimSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableBoolean viewModelDividerLineVisible = null;
        boolean viewModelDividerLineVisibleGet = false;
        int viewModelDividerLineVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelUnclaimSuccessGet = false;
        int viewModelUnclaimInfoVisibleViewVISIBLEViewGONE = 0;
        int viewModelUnclaimSuccessViewGONEViewVISIBLE = 0;
        boolean viewModelUnclaimInfoVisibleGet = false;
        androidx.databinding.ObservableBoolean viewModelUnclaimInfoVisible = null;
        com.rakuten.gap.ads.mission_ui.viewmodel.RewardSDKPortalViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelUnclaimSuccess = null;

        if ((dirtyFlags & 0x75L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.dividerLineVisible
                        viewModelDividerLineVisible = viewModel.getDividerLineVisible();
                    }
                    updateRegistration(0, viewModelDividerLineVisible);


                    if (viewModelDividerLineVisible != null) {
                        // read viewModel.dividerLineVisible.get()
                        viewModelDividerLineVisibleGet = viewModelDividerLineVisible.get();
                    }
                if((dirtyFlags & 0x61L) != 0) {
                    if(viewModelDividerLineVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
                    viewModelDividerLineVisibleViewVISIBLEViewGONE = ((viewModelDividerLineVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.unclaimInfoVisible
                        viewModelUnclaimInfoVisible = viewModel.getUnclaimInfoVisible();
                    }
                    updateRegistration(2, viewModelUnclaimInfoVisible);


                    if (viewModelUnclaimInfoVisible != null) {
                        // read viewModel.unclaimInfoVisible.get()
                        viewModelUnclaimInfoVisibleGet = viewModelUnclaimInfoVisible.get();
                    }
                if((dirtyFlags & 0x64L) != 0) {
                    if(viewModelUnclaimInfoVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
                    viewModelUnclaimInfoVisibleViewVISIBLEViewGONE = ((viewModelUnclaimInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.unclaimSuccess
                        viewModelUnclaimSuccess = viewModel.getUnclaimSuccess();
                    }
                    updateRegistration(4, viewModelUnclaimSuccess);


                    if (viewModelUnclaimSuccess != null) {
                        // read viewModel.unclaimSuccess.get()
                        viewModelUnclaimSuccessGet = viewModelUnclaimSuccess.get();
                    }
                if((dirtyFlags & 0x70L) != 0) {
                    if(viewModelUnclaimSuccessGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
                    viewModelUnclaimSuccessViewGONEViewVISIBLE = ((viewModelUnclaimSuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelDividerLineVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.rakutenrewardErrorMessage.getRoot().setVisibility(viewModelUnclaimSuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.rakutenrewardErrorMessage.setErrorText(getRoot().getResources().getString(R.string.rakutenrewardsdk_unclaim_error));
            this.rakutenrewardInfoMessage.setInfoText(getRoot().getResources().getString(R.string.rakutenrewardsdk_tab_uncliam_nounclaim));
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.rakutenrewardInfoMessage.getRoot().setVisibility(viewModelUnclaimInfoVisibleViewVISIBLEViewGONE);
        }
        executeBindingsOn(rakutenrewardInfoMessage);
        executeBindingsOn(rakutenrewardErrorMessage);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.dividerLineVisible
        flag 1 (0x2L): rakutenrewardInfoMessage
        flag 2 (0x3L): viewModel.unclaimInfoVisible
        flag 3 (0x4L): rakutenrewardErrorMessage
        flag 4 (0x5L): viewModel.unclaimSuccess
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.unclaimInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.unclaimSuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}