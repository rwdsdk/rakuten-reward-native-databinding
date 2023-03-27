package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiErrorFragmentBindingImpl extends RakutenrewardUiErrorFragmentBinding  {

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

    public RakutenrewardUiErrorFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiErrorFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.MessageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.MessageViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelVisible(androidx.databinding.ObservableBoolean ViewModelVisible, int fieldId) {
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
        boolean viewModelVisibleGet = false;
        int viewModelVisibleViewVISIBLEViewGONE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.MessageViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelVisible = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.visible
                    viewModelVisible = viewModel.getVisible();
                }
                updateRegistration(0, viewModelVisible);


                if (viewModelVisible != null) {
                    // read viewModel.visible.get()
                    viewModelVisibleGet = viewModelVisible.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelVisibleGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.visible.get() ? View.VISIBLE : View.GONE
                viewModelVisibleViewVISIBLEViewGONE = ((viewModelVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardErrormessageRoot.setVisibility(viewModelVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.visible
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.visible.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.visible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}