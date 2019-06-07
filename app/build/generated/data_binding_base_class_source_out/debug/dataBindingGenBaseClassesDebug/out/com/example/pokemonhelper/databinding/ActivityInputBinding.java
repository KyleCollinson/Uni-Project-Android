package com.example.pokemonhelper.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.pokemonhelper.IInputActivity;
import com.example.pokemonhelper.IMethod;
import com.example.pokemonhelper.IPokemon;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityInputBinding extends ViewDataBinding {
  @NonNull
  public final Button back;

  @NonNull
  public final Button hunt;

  @NonNull
  public final TextView level;

  @NonNull
  public final RelativeLayout levelbox;

  @NonNull
  public final TextView margin;

  @NonNull
  public final TextView marginB;

  @NonNull
  public final TextView marginM;

  @NonNull
  public final TextView marginMethod;

  @NonNull
  public final TextView marginT;

  @NonNull
  public final TextView method;

  @NonNull
  public final RelativeLayout methodbox;

  @NonNull
  public final TextView poke;

  @NonNull
  public final RelativeLayout pokemonbox;

  @NonNull
  public final TextView txtTitle;

  @NonNull
  public final Button updateButton;

  @Bindable
  protected IMethod mIMethod;

  @Bindable
  protected IPokemon mIPokemon;

  @Bindable
  protected int mLevel;

  @Bindable
  protected IInputActivity mIInputActivity;

  @Bindable
  protected String mPokemon;

  @Bindable
  protected String mMethod;

  protected ActivityInputBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button back, Button hunt, TextView level, RelativeLayout levelbox, TextView margin,
      TextView marginB, TextView marginM, TextView marginMethod, TextView marginT, TextView method,
      RelativeLayout methodbox, TextView poke, RelativeLayout pokemonbox, TextView txtTitle,
      Button updateButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.hunt = hunt;
    this.level = level;
    this.levelbox = levelbox;
    this.margin = margin;
    this.marginB = marginB;
    this.marginM = marginM;
    this.marginMethod = marginMethod;
    this.marginT = marginT;
    this.method = method;
    this.methodbox = methodbox;
    this.poke = poke;
    this.pokemonbox = pokemonbox;
    this.txtTitle = txtTitle;
    this.updateButton = updateButton;
  }

  public abstract void setIMethod(@Nullable IMethod iMethod);

  @Nullable
  public IMethod getIMethod() {
    return mIMethod;
  }

  public abstract void setIPokemon(@Nullable IPokemon iPokemon);

  @Nullable
  public IPokemon getIPokemon() {
    return mIPokemon;
  }

  public abstract void setLevel(int level);

  public int getLevel() {
    return mLevel;
  }

  public abstract void setIInputActivity(@Nullable IInputActivity iInputActivity);

  @Nullable
  public IInputActivity getIInputActivity() {
    return mIInputActivity;
  }

  public abstract void setPokemon(@Nullable String pokemon);

  @Nullable
  public String getPokemon() {
    return mPokemon;
  }

  public abstract void setMethod(@Nullable String method);

  @Nullable
  public String getMethod() {
    return mMethod;
  }

  @NonNull
  public static ActivityInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityInputBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.activity_input, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityInputBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.activity_input, null, false, component);
  }

  public static ActivityInputBinding bind(@NonNull View view) {
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
  public static ActivityInputBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityInputBinding)bind(component, view, com.example.pokemonhelper.R.layout.activity_input);
  }
}
