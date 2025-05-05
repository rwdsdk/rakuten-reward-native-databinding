package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiTabfragmentMissionlistBindingImpl extends RakutenrewardUiTabfragmentMissionlistBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_info_layout", "rakutenreward_ui_error_layout"},
            new int[] {3, 4},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_currentpoint_fragment_component, 5);
        sViewsWithIds.put(R.id.rakutenreward_unclaim_fragment_component, 6);
        sViewsWithIds.put(R.id.rakutenreward_mission_description, 7);
        sViewsWithIds.put(R.id.rakutenreward_mission_list, 8);
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

    public RakutenrewardUiTabfragmentMissionlistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiTabfragmentMissionlistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[4]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.fragment.app.FragmentContainerView) bindings[6]
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
                mDirtyFlags = 0x100L;
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
        if (BR.infoText == variableId) {
            setInfoText((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel) variable);
        }
        else if (BR.errorText == variableId) {
            setErrorText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInfoText(@Nullable java.lang.String InfoText) {
        this.mInfoText = InfoText;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.infoText);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setErrorText(@Nullable java.lang.String ErrorText) {
        this.mErrorText = ErrorText;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.errorText);
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
                return onChangeViewModelMissionInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeRakutenrewardInfoMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) object, fieldId);
            case 3 :
                return onChangeViewModelMissionSuccess((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeRakutenrewardErrorMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) object, fieldId);
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
    private boolean onChangeViewModelMissionInfoVisible(androidx.databinding.ObservableBoolean ViewModelMissionInfoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardInfoMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding RakutenrewardInfoMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMissionSuccess(androidx.databinding.ObservableBoolean ViewModelMissionSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardErrorMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding RakutenrewardErrorMessage, int fieldId) {
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
        int viewModelMissionInfoVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelMissionInfoVisible = null;
        boolean viewModelMissionSuccessGet = false;
        java.lang.String infoText = mInfoText;
        int viewModelMissionSuccessViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableBoolean viewModelMissionSuccess = null;
        boolean viewModelMissionInfoVisibleGet = false;
        com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel viewModel = mViewModel;
        java.lang.String errorText = mErrorText;

        if ((dirtyFlags & 0x120L) != 0) {
        }
        if ((dirtyFlags & 0x14bL) != 0) {


            if ((dirtyFlags & 0x141L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.dividerLineVisible
                        viewModelDividerLineVisible = viewModel.getDividerLineVisible();
                    }
                    updateRegistration(0, viewModelDividerLineVisible);


                    if (viewModelDividerLineVisible != null) {
                        // read viewModel.dividerLineVisible.get()
                        viewModelDividerLineVisibleGet = viewModelDividerLineVisible.get();
                    }
                if((dirtyFlags & 0x141L) != 0) {
                    if(viewModelDividerLineVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
                    viewModelDividerLineVisibleViewVISIBLEViewGONE = ((viewModelDividerLineVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x142L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.missionInfoVisible
                        viewModelMissionInfoVisible = viewModel.getMissionInfoVisible();
                    }
                    updateRegistration(1, viewModelMissionInfoVisible);


                    if (viewModelMissionInfoVisible != null) {
                        // read viewModel.missionInfoVisible.get()
                        viewModelMissionInfoVisibleGet = viewModelMissionInfoVisible.get();
                    }
                if((dirtyFlags & 0x142L) != 0) {
                    if(viewModelMissionInfoVisibleGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
                    viewModelMissionInfoVisibleViewVISIBLEViewGONE = ((viewModelMissionInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.missionSuccess
                        viewModelMissionSuccess = viewModel.getMissionSuccess();
                    }
                    updateRegistration(3, viewModelMissionSuccess);


                    if (viewModelMissionSuccess != null) {
                        // read viewModel.missionSuccess.get()
                        viewModelMissionSuccessGet = viewModelMissionSuccess.get();
                    }
                if((dirtyFlags & 0x148L) != 0) {
                    if(viewModelMissionSuccessGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
                    viewModelMissionSuccessViewGONEViewVISIBLE = ((viewModelMissionSuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x180L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelDividerLineVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            this.rakutenrewardErrorMessage.getRoot().setVisibility(viewModelMissionSuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.rakutenrewardErrorMessage.setErrorText(errorText);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            this.rakutenrewardInfoMessage.getRoot().setVisibility(viewModelMissionInfoVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            this.rakutenrewardInfoMessage.setInfoText(infoText);
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
        flag 1 (0x2L): viewModel.missionInfoVisible
        flag 2 (0x3L): rakutenrewardInfoMessage
        flag 3 (0x4L): viewModel.missionSuccess
        flag 4 (0x5L): rakutenrewardErrorMessage
        flag 5 (0x6L): infoText
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): errorText
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.dividerLineVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}