package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPointhistoryActivityBindingImpl extends RakutenrewardUiPointhistoryActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"rakutenreward_ui_toolbar"},
            new int[] {3},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar});
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_error_layout", "rakutenreward_ui_info_layout"},
            new int[] {4, 5},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_pointtitle, 6);
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_history_list, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding mboundView11;
    @Nullable
    private final com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding mboundView12;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener rakutenrewardPointhistoryCurrentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.point.get()
            //         is viewModel.point.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(rakutenrewardPointhistoryCurrent);
            // localize variables for thread safety
            // viewModel.point != null
            boolean viewModelPointJavaLangObjectNull = false;
            // viewModel.point
            androidx.databinding.ObservableField<java.lang.String> viewModelPoint = null;
            // viewModel.point.get()
            java.lang.String viewModelPointGet = null;
            // viewModel
            com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoint = viewModel.getPoint();

                viewModelPointJavaLangObjectNull = (viewModelPoint) != (null);
                if (viewModelPointJavaLangObjectNull) {




                    viewModelPoint.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public RakutenrewardUiPointhistoryActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPointhistoryActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[4];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) bindings[5];
        setContainedBinding(this.mboundView12);
        this.rakutenrewardPointhistoryCurrent.setTag(null);
        setContainedBinding(this.rakutenrewardToolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        rakutenrewardToolbar.invalidateAll();
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rakutenrewardToolbar.hasPendingBindings()) {
            return true;
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardToolbar.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPoint((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeRakutenrewardToolbar((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) object, fieldId);
            case 2 :
                return onChangeViewModelPointHistorySuccess((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelPointHistoryInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPoint(androidx.databinding.ObservableField<java.lang.String> ViewModelPoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardToolbar(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding RakutenrewardToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPointHistorySuccess(androidx.databinding.ObservableBoolean ViewModelPointHistorySuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPointHistoryInfoVisible(androidx.databinding.ObservableBoolean ViewModelPointHistoryInfoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.databinding.ObservableField<java.lang.String> viewModelPoint = null;
        boolean viewModelPointHistorySuccessGet = false;
        int viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelPointHistorySuccess = null;
        int viewModelPointHistorySuccessViewGONEViewVISIBLE = 0;
        java.lang.String viewModelPointGet = null;
        com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelPointHistoryInfoVisible = null;
        boolean viewModelPointHistoryInfoVisibleGet = false;

        if ((dirtyFlags & 0x3dL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.point
                        viewModelPoint = viewModel.getPoint();
                    }
                    updateRegistration(0, viewModelPoint);


                    if (viewModelPoint != null) {
                        // read viewModel.point.get()
                        viewModelPointGet = viewModelPoint.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pointHistorySuccess
                        viewModelPointHistorySuccess = viewModel.getPointHistorySuccess();
                    }
                    updateRegistration(2, viewModelPointHistorySuccess);


                    if (viewModelPointHistorySuccess != null) {
                        // read viewModel.pointHistorySuccess.get()
                        viewModelPointHistorySuccessGet = viewModelPointHistorySuccess.get();
                    }
                if((dirtyFlags & 0x34L) != 0) {
                    if(viewModelPointHistorySuccessGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
                    viewModelPointHistorySuccessViewGONEViewVISIBLE = ((viewModelPointHistorySuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pointHistoryInfoVisible
                        viewModelPointHistoryInfoVisible = viewModel.getPointHistoryInfoVisible();
                    }
                    updateRegistration(3, viewModelPointHistoryInfoVisible);


                    if (viewModelPointHistoryInfoVisible != null) {
                        // read viewModel.pointHistoryInfoVisible.get()
                        viewModelPointHistoryInfoVisibleGet = viewModelPointHistoryInfoVisible.get();
                    }
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelPointHistoryInfoVisibleGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
                    viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = ((viewModelPointHistoryInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView11.getRoot().setVisibility(viewModelPointHistorySuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView11.setErrorText(getRoot().getResources().getString(R.string.rakutenrewardsdk_tab_pointhistory_error));
            this.mboundView12.setInfoText(getRoot().getResources().getString(R.string.rakutenrewardsdk_tab_pointhistory_nohistory));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.rakutenrewardPointhistoryCurrent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, rakutenrewardPointhistoryCurrentandroidTextAttrChanged);
            this.rakutenrewardToolbar.setToolbarLeftIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.rakutenreward_ic_arrow_left));
            this.rakutenrewardToolbar.setToolbarText(getRoot().getResources().getString(R.string.rakutenreawrdsdk_morelist_pointhistory));
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.mboundView12.getRoot().setVisibility(viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardPointhistoryCurrent, viewModelPointGet);
        }
        executeBindingsOn(rakutenrewardToolbar);
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.point
        flag 1 (0x2L): rakutenrewardToolbar
        flag 2 (0x3L): viewModel.pointHistorySuccess
        flag 3 (0x4L): viewModel.pointHistoryInfoVisible
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
        flag 9 (0xaL): viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}