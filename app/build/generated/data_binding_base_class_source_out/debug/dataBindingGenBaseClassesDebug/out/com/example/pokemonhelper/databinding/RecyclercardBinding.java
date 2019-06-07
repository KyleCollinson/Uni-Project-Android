package com.example.pokemonhelper.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.pokemonhelper.models.Poke;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecyclercardBinding extends ViewDataBinding {
  @NonNull
  public final TextView pokeID;

  @NonNull
  public final CircleImageView pokemonPic;

  @NonNull
  public final TextView pokename;

  @NonNull
  public final LinearLayout rootView;

  @NonNull
  public final RelativeLayout text;

  @Bindable
  protected Poke mPoke;

  protected RecyclercardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView pokeID, CircleImageView pokemonPic, TextView pokename, LinearLayout rootView,
      RelativeLayout text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pokeID = pokeID;
    this.pokemonPic = pokemonPic;
    this.pokename = pokename;
    this.rootView = rootView;
    this.text = text;
  }

  public abstract void setPoke(@Nullable Poke poke);

  @Nullable
  public Poke getPoke() {
    return mPoke;
  }

  @NonNull
  public static RecyclercardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recyclercard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecyclercardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecyclercardBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.recyclercard, root, attachToRoot, component);
  }

  @NonNull
  public static RecyclercardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recyclercard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecyclercardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecyclercardBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.recyclercard, null, false, component);
  }

  public static RecyclercardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RecyclercardBinding bind(@NonNull View view, @Nullable Object component) {
    return (RecyclercardBinding)bind(component, view, com.example.pokemonhelper.R.layout.recyclercard);
  }
}
