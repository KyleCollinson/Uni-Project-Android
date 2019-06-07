package com.example.pokemonhelper.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogChoosePokemonBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout closeDialog;

  @NonNull
  public final ListView listView;

  protected DialogChoosePokemonBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout closeDialog, ListView listView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeDialog = closeDialog;
    this.listView = listView;
  }

  @NonNull
  public static DialogChoosePokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_choose_pokemon, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogChoosePokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogChoosePokemonBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.dialog_choose_pokemon, root, attachToRoot, component);
  }

  @NonNull
  public static DialogChoosePokemonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_choose_pokemon, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogChoosePokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogChoosePokemonBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.dialog_choose_pokemon, null, false, component);
  }

  public static DialogChoosePokemonBinding bind(@NonNull View view) {
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
  public static DialogChoosePokemonBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogChoosePokemonBinding)bind(component, view, com.example.pokemonhelper.R.layout.dialog_choose_pokemon);
  }
}
