package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPointExchangeSuccessBindingImpl extends RakutenrewardUiPointExchangeSuccessBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"rakutenreward_ui_toolbar"},
            new int[] {3},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_point_exchange_success_title, 4);
        sViewsWithIds.put(R.id.rakutenreward_rakuten_point_layot, 5);
        sViewsWithIds.put(R.id.rakutenreward_rakuten_point_label, 6);
        sViewsWithIds.put(R.id.rakutenreward_current_point_layout, 7);
        sViewsWithIds.put(R.id.rakutenreward_current_point_label, 8);
        sViewsWithIds.put(R.id.link, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiPointExchangeSuccessBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPointExchangeSuccessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setContainedBinding(this.rakutenrewardToolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        rakutenrewardToolbar.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeSuccessViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeSuccessViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardToolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPoint((androidx.databinding.ObservableLong) object, fieldId);
            case 1 :
                return onChangeViewModelAvailablePoint((androidx.databinding.ObservableLong) object, fieldId);
            case 2 :
                return onChangeRakutenrewardToolbar((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPoint(androidx.databinding.ObservableLong ViewModelPoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAvailablePoint(androidx.databinding.ObservableLong ViewModelAvailablePoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardToolbar(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding RakutenrewardToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String mboundView1AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint = null;
        androidx.databinding.ObservableLong viewModelPoint = null;
        androidx.databinding.ObservableLong viewModelAvailablePoint = null;
        long viewModelAvailablePointGet = 0;
        long viewModelPointGet = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeSuccessViewModel viewModel = mViewModel;
        java.lang.String mboundView2AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelAvailablePoint = null;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.point
                        viewModelPoint = viewModel.getPoint();
                    }
                    updateRegistration(0, viewModelPoint);


                    if (viewModelPoint != null) {
                        // read viewModel.point.get()
                        viewModelPointGet = viewModelPoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_pointexchagne_exchange_actionpoint
                    mboundView1AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint = mboundView1.getResources().getString(R.string.rakutenrewardsdk_pointexchagne_exchange_actionpoint, viewModelPointGet);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.availablePoint
                        viewModelAvailablePoint = viewModel.getAvailablePoint();
                    }
                    updateRegistration(1, viewModelAvailablePoint);


                    if (viewModelAvailablePoint != null) {
                        // read viewModel.availablePoint.get()
                        viewModelAvailablePointGet = viewModelAvailablePoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_pointexchagne_exchange_actionpoint
                    mboundView2AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelAvailablePoint = mboundView2.getResources().getString(R.string.rakutenrewardsdk_pointexchagne_exchange_actionpoint, viewModelAvailablePointGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelAvailablePoint);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.rakutenrewardToolbar.setToolbarLeftIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.rakutenreward_ic_arrow_left));
            this.rakutenrewardToolbar.setToolbarText(getRoot().getResources().getString(R.string.rakutenreawrdsdk_morelist_pointexchange));
        }
        executeBindingsOn(rakutenrewardToolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.point
        flag 1 (0x2L): viewModel.availablePoint
        flag 2 (0x3L): rakutenrewardToolbar
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}