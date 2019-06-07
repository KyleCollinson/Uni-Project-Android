package com.example.pokemonhelper.databinding;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclercardBindingImpl extends RecyclercardBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclercardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RecyclercardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[4]
            );
        this.pokeID.setTag(null);
        this.pokemonPic.setTag(null);
        this.pokename.setTag(null);
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.poke == variableId) {
            setPoke((com.example.pokemonhelper.models.Poke) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPoke(@Nullable com.example.pokemonhelper.models.Poke Poke) {
        this.mPoke = Poke;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.poke);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String pokeId = null;
        int pokeImageId = 0;
        com.example.pokemonhelper.models.Poke poke = mPoke;
        java.lang.String pokeName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (poke != null) {
                    // read poke.id
                    pokeId = poke.id;
                    // read poke.imageId
                    pokeImageId = poke.imageId;
                    // read poke.name
                    pokeName = poke.name;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.pokeID, pokeId);
            com.example.pokemonhelper.models.Poke.loadImage(this.pokemonPic, pokeImageId);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.pokename, pokeName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): poke
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}